// NotificationController.java
package com.javatechie.controller;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class NotificationController {

    @MessageMapping("/sendMessage") // Endpoint matching the JavaScript destination
    @SendTo("/topic/notifications") // Broadcast to subscribers of this topic
    public String sendMessage(String message) {
        System.out.println("Received message: " + message); // Debugging log
        return message; // Broadcast the message
    }

}
