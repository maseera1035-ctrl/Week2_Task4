package app;

import java.util.LinkedHashMap;

public class CacheSystem {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> cache = new LinkedHashMap<>();
        cache.put(1, "Page A");
        cache.put(2, "Page B");
        cache.put(3, "Page C");

        System.out.println("Cache (Insertion Order): " + cache);
    }
}
