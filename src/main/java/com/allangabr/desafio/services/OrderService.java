package com.allangabr.desafio.services;

import com.allangabr.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order){
        return  order.getBasic() - (order.getBasic() * (order.getDiscount() / 100)) + shippingService.shipment(order);
    }
}
