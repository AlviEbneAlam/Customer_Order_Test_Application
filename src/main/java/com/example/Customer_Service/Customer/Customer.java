package com.example.Customer_Service.Customer;

import com.example.Customer_Service.Order.Order;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "Customers")
public class Customer {

    @Id
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int customerContact;

    //@DBRef
    private List<Order> orders=new ArrayList<>();

    public Customer(int customerId, String customerName, String customerAddress, int customerContact) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerContact = customerContact;

    }

    public Customer(){

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerContact() {
        return customerContact;
    }

    public void setCustomerContact(int customerContact) {
        this.customerContact = customerContact;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerContact=" + customerContact +
                ", orders=" + orders +
                '}';
    }
}
