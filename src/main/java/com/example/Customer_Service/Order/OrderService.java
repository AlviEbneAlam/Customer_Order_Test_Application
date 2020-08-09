package com.example.Customer_Service.Order;

import com.example.Customer_Service.Customer.Customer;
import com.example.Customer_Service.Customer.CustomerRepository;
import com.example.Customer_Service.Customer.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    public void addOrder(Order order) {


        orderRepository.save(order);


    }
    public void addOrderToCustomer(int customerId,int orderId){
        Order order=orderRepository.findById(orderId).get();
        Customer customer=customerRepository.findById(customerId).get();
        customer.getOrders().add(order);
        //customerRepository.findById(customerId).get().getOrders().add(order);
        customerRepository.save(customer);





    }

}
