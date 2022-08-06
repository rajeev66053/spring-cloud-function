package com.java.springcloudfunction;

import java.util.function.Function;

public class Test implements Function<String,String> {
    @Override
    public String apply(String str) {
        return "Serverless functional programming : example by "+str;
    }
}