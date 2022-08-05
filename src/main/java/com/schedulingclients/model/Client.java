package com.schedulingclients.model;

import com.schedulingclients.model.enums.OrderStatus;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Document(collection = "client")
public class Client extends User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private OrderStatus orderStatus;

    public Client(String id, String name, String email, String gender, String birthDat, String phone, OrderStatus orderStatus) {
        super(id, name, email, gender, birthDat, phone);
        this.orderStatus = orderStatus;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
