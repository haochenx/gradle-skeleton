package com.example;

import javax.ejb.Singleton;

@Singleton
public class GreetingStore {

    public String getGeneralGreeting() {
        return "Hello, you and world!";
    }

}
