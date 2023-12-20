package model;

import lombok.*;
import model.enums.OrderStatus;
import model.enums.PaymentMethod;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private String id;
    private User user;
    private Product product;
    private int qty;
    private Date date;
    private OrderStatus orderStatus;
    private PaymentMethod paymentMethod;
    private Double price;

}

