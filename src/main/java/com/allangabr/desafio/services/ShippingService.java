package com.allangabr.desafio.services;

import com.allangabr.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public Double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return 20.0;
        } else if (order.getBasic() < 200.0) {
            return 12.0;
        }
        return 0.0;
    }

}
