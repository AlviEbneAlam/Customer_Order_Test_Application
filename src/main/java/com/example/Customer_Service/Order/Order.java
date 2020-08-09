package com.example.Customer_Service.Order;

import com.example.Customer_Service.Customer.Customer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "Orders")
public class Order {

    @Id
    private int orderId;
    private String orderDescription;
    private String orderPrice;


    public Order(){}

    public Order(int orderId, String orderDescription, String orderPrice) {
        this.orderId = orderId;
        this.orderDescription = orderDescription;
        this.orderPrice = orderPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }
}
