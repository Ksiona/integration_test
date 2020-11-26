package com.netcracker.devops.train.service;

import org.junit.Assert;
import org.junit.Test;

public class SimpleGreetingServiceTest {
    @Test
    public void testHelloService() {
        SimpleGreetingService greetingService = new SimpleGreetingService();
        String greeting = greetingService.getGreeting();
        Assert.assertEquals("Hi from java microservice!", greeting);
    }
}
