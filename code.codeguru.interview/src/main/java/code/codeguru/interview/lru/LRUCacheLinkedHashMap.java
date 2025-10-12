package code.codeguru.interview.lru;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheLinkedHashMap {

    private int capacity;
    private LinkedHashMap<String, String> cache;

    public LRUCacheLinkedHashMap(int capacity) {
        this.capacity = capacity;
        this.cache =
                new LinkedHashMap<String, String>(capacity, 0.75f, true) {
                    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                        return size() > capacity;
                    }
                };
    }

    public String get(String key) {
        return cache.getOrDefault(key, null);
    }

    public void put(String key, String value) {
        cache.put(key, value);
    }

    public void display() {
        System.out.println(cache);
    }
}
