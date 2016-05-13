package com.example;

import javax.ejb.Stateless;

@Stateless
public class GreetingStore {

    public String getGeneralGreeting() {
        return "Hello, you and world!";
    }

}
