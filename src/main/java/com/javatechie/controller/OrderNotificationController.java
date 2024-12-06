package com.javatechie.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class OrderNotificationController {

    @MessageMapping("/order/status") // Endpoint to receive updates
    @SendTo("/topic/order") // Broadcast updates to all subscribers
    public OrderUpdate sendOrderUpdate(OrderUpdate orderUpdate) {
        // Simulate order status update processing
        return orderUpdate;
    }
}
