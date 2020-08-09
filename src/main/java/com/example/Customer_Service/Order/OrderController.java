package com.example.Customer_Service.Order;

import com.example.Customer_Service.Customer.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping(method= RequestMethod.POST,value="/addOrder")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);

    }
    @RequestMapping(method= RequestMethod.PUT,value="/addOrderToCustomer/{customerId}/{orderId}")
    public void addOrderToCustomer(@PathVariable int customerId,@PathVariable int orderId){
        orderService.addOrderToCustomer(customerId,orderId); }
}
