package com.locpham.notification.bookstore;

import org.springframework.boot.SpringApplication;

public class TestNotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(NotificationServiceApplication::main)
                .with(ContainersConfig.class)
                .run(args);
    }
}
