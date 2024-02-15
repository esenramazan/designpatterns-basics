package com.ramazan.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, Tree> treeMap = new HashMap<>();

    public static Tree getTree(String type) {
        if (!treeMap.containsKey(type)) {
            switch (type) {
                case "Pine":
                    System.out.println("Creating a new Pine tree");
                    treeMap.put(type, new PineTree());
                    break;
                // Add other tree types here...
            }
        }
        return treeMap.get(type);
    }
}
