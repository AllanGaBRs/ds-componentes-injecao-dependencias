package com.allangabr.desafio;

import com.allangabr.desafio.entities.Order;
import com.allangabr.desafio.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    private OrderService orderService;

    public DesafioApplication(OrderService orderService) {
        this.orderService = orderService;
    }

    public static void main(String[] args) {

        SpringApplication.run(DesafioApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Order order1 = new Order(1034,  150.00, 20.00);
        Order order2 = new Order(2282, 800.00, 10.00);
        Order order3 = new Order(1309, 95.90, 0.0);

        System.out.println("=== Order 1 ===");
        System.out.println("Pedido código: " + order1.getCode());
        System.out.println("Valor total: R$" + String.format("%.2f", orderService.total(order1)));

        System.out.println("\n=== Order 2 ===");
        System.out.println("Pedido código: " + order2.getCode());
        System.out.println("Valor total: R$" + String.format("%.2f", orderService.total(order2)));

        System.out.println("\n=== Order 3 ===");
        System.out.println("Pedido código: " + order3.getCode());
        System.out.println("Valor total: R$" + String.format("%.2f", orderService.total(order3)));
    }
}
