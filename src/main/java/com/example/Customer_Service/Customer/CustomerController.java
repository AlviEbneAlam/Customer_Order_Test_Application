package com.example.Customer_Service.Customer;

import com.example.Customer_Service.Order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerservice;

    /*@RequestMapping(method= RequestMethod.GET,value="/allCustomers")
    public List<Customer> allStudents(){
        return customerservice.getAllCustomers();
    }
*/
    @RequestMapping(method= RequestMethod.POST,value="/addCustomer")
    public void addCustomer(@RequestBody Customer customer){
        customerservice.addCustomer(customer);
    }

    /*{
        if(customer!=null){
            return customerservice.addCustomer(customer);
        }
        else{
            return false;
        }

    }*/

    /*@RequestMapping(method= RequestMethod.DELETE,value="/deleteCustomer/{customerId}")
    public void deleteStudent(@PathVariable int customerId)*/
    public boolean deleteCustomer(int customerId)
    {
        return customerservice.deleteCustomer(customerId);

    }

    @RequestMapping(method= RequestMethod.PUT,value="/updateCustomer")
    public void updateStudent(@RequestBody Customer customer)
    {
        customerservice.updateCustomer(customer);

    }

    @RequestMapping(method= RequestMethod.GET,value="/getCustomer/{customerId}")
    public Customer getCustomerById(@PathVariable int customerId){
        return customerservice.getCustomer(customerId);
    }







}
