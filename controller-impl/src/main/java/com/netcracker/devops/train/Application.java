package com.netcracker.devops.train;

import com.netcracker.devops.train.service.GreetingService;
import com.netcracker.devops.train.service.SimpleGreetingService;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        GreetingService greetingService = new SimpleGreetingService();

        while (true) {
            String greeting = greetingService.getGreeting();
            System.out.println(greeting);
            Thread.sleep(10000);
        }
    }
}

