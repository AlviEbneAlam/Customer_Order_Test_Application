package com.example.Customer_Service.SpringBootApplicationTest;


import com.example.Customer_Service.Customer.Customer;
import com.example.Customer_Service.Customer.CustomerController;
import com.example.Customer_Service.Customer.CustomerRepository;
import com.example.Customer_Service.Customer.CustomerService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
//import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class SpringBootApplicationTest {

    @Mock
    private CustomerService customerService;


    private CustomerRepository customerRepository;


    @InjectMocks
    private CustomerController customerController;

   /* @Test
    @DisplayName("Running Test for Creating Customer Without Null Parameter")
    public void TestIsAddedCustomerIfCustomerWasAdded(){
        System.out.println("PRINTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        Customer customer=new Customer(14,"Rafat","Boalkhali",101);
        //assertEquals(true,customerService.addCustomer(customer),"Adding Successfull");
        assertThat(customerController.addCustomer(customer)).isEqualTo(true);

    }*/

    @Test
    @DisplayName("Running Test for deleting Customer")
    public void TestIstrueIfCustomerisdeleted(){
        Customer customer=null;
        int customerId=14;
        //assertEquals(true,customerService.addCustomer(customer),"Adding Successfull");
        when(customerService.deleteCustomer(customerId)).thenReturn(true);
        assertThat(customerController.deleteCustomer(customerId)).isEqualTo(true);

    }

    /*@Test
    @DisplayName("Running Test for Creating Customer With Null Parameter")
    public void TestIsFalseIfCustomerWasNull(){
        System.out.println("PRINTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
        Customer customer=null;
        //assertEquals(true,customerService.addCustomer(customer),"Adding Successfull");
        assertThat(customerController.addCustomer(customer)).isEqualTo(false);

    }*/



    /*@Test
    @DisplayName("Running Test for Finding all customers")
    public void TestIsFindingAllCustomersInDatabase(){

        Customer customer1=new Customer(1,"Alvi","Nasirabad",12);
        Customer customer2=new Customer(2,"Rakib","Nasirabad",13);

        customerRepository.save(customer1);
        customerRepository.save(customer2);

        assertThat(customerService.getAllCustomers().size()).isEqualTo(3);

    }*/

    /*@Test
    public void TestIsFindingCustomersInDatabaseUsingMockito(){
        System.out.println("Finding all customers");
        when(customerRepository.findAll()).thenReturn(new ArrayList<Customer>(Arrays.asList(new Customer(1,"Alvi","Nasirabad",12),new Customer(2, "Rafin","Halishahar",15))));
        assertThat(customerService.getAllCustomers().size()).isEqualTo(2);
    }*/




}
