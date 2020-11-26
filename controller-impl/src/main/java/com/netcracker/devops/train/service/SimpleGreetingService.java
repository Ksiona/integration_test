package com.netcracker.devops.train.service;

public class SimpleGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Hi from java microservice!";
    }
}
