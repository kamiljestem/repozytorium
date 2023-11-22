package oop;

import java.util.HashMap;
import java.util.Map;

public class collection {
    static Map<Integer, String> wyrazy = new HashMap<>();

    public static void main(String[] args) {

        wyrazy.put(1, "Jestem");
        wyrazy.put(2, "Kamil");
        wyrazy.put(3, "i");
        wyrazy.put(4, "kocham");
        wyrazy.put(5, "moja");
        wyrazy.put(6, "szkole");
        wyrazy.put(7, "I love ZSL <3");

        for (int i = 1; i <= wyrazy.size()  ; i++ ) {
            System.out.println("element mapy wyrazy" + wyrazy.get(i));
        }
    }
}
