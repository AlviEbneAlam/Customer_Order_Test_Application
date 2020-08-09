package com.example.Customer_Service.SpringBootApplicationTest;

import com.example.Customer_Service.Customer.Customer;
import com.example.Customer_Service.Customer.CustomerController;
import com.example.Customer_Service.Customer.CustomerRepository;
import com.example.Customer_Service.Customer.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
public class SpringBootApplicationCustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private CustomerRepository customerRepository;

    public SpringBootApplicationCustomerControllerTest() {
    }

    @Test
    public void PostRequestTest() throws Exception {
        Customer customer=new Customer(11,"Moin","Chawkbazar",110);
        /*RequestBuilder request= MockMvcRequestBuilders.post("/addCustomer");
        MvcResult result=mockMvc.perform(request).andExpect(status().isOk());*//*
        //mockMvc.perform(post("/addCustomer").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(customer)))
        *//*mockMvc.perform(post("/addCustomer").contentType(MediaType.APPLICATION_JSON)
                //.param("sendWelcomeMail", "true")
                .content(objectMapper.writeValueAsString(user)))
                .andExpect(status().isOk());*//*

        mockMvc.perform(post("/forums/{forumId}/register", 42L)
                .contentType(MediaType.APPLICATION_JSON).queryParam().);*/

    }


}
