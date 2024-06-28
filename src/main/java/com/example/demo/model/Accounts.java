package com.example.demo.model;
import java.util.HashMap;
import java.util.Map;

public class Accounts {
    static Map<String, String> usermap = new HashMap<>();

    public static Map<String, String> createMap() {
        usermap.put("Gelo", "dean");
        usermap.put("Angelo", "Alabaso");
        usermap.put("Alabaso", "angelo");
        usermap.put("admin", "admin");
        return usermap;
    }
}