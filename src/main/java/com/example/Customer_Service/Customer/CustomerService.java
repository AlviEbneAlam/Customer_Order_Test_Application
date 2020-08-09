package com.example.Customer_Service.Customer;

import com.example.Customer_Service.Order.Order;
import com.example.Customer_Service.Order.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private OrderRepository orderRepository;

    List<Customer> customers=new ArrayList<>();

    public List<Customer> getAllCustomers(){
        customers.addAll(customerRepository.findAll());
        return customers;
    }

    public void addCustomer(Customer customer) {
        List<Order> orderList=new ArrayList<>();
        orderList.add(new Order(15,"Kono kichu","15"));
        customer.setOrders(orderList);
        customerRepository.save(customer);
    }

    public boolean deleteCustomer(int customerId){
        customerRepository.deleteById(customerId);
        return true;
    }

    public void updateCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public Customer getCustomer(int customerId){
        return customerRepository.findById(customerId).get();
    }







}
