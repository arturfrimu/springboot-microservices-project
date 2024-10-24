package com.programming.techie.notificationservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailSender {
    public void sendEmail(String orderNumber) {
        log.info("Order Placed Successfully - Order Number is {}", orderNumber);
        log.info("Email Sent For Order Id {}", orderNumber);
    }
}