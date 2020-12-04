package com.example.demo.utils;

import java.util.function.Consumer;

import org.springframework.stereotype.Service;

@Service
public class Printer{
    public void con(Object t) {
        Consumer<String> c = System.out::println;
        c.accept((String) t);
    }
    
}
