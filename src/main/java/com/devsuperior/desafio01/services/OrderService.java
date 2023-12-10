package com.devsuperior.desafio01.services;

import com.devsuperior.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired ShippingService shipping;

    public double total(Order order) {
        double discount = order.getBasic() * (order.getDiscount()/100);
        return order.getBasic() + shipping.shipment(order) - discount;
    }


}

