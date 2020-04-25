package com.nerydlg.daily.coding.problems.medium;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LRUCacheTest {

    @Test
    void FirstTest() {
        LRUCache cache = new LRUCache(2);

        cache.put(1, 1);
        cache.put(2, 2);

        assertEquals(1, cache.get(1));
        cache.put(3, 3);
        assertEquals(-1, cache.get(2));
        cache.put(4, 4);
        assertEquals(3, cache.get(3));
        assertEquals(4, cache.get(4));
    }


    @Test
    void TestCapacityEqualToOne() {
        LRUCache cache = new LRUCache(1);

        cache.put(2, 1);
        assertEquals(1, cache.get(2));
        cache.put(3, 2);
        assertEquals(2, cache.get(3));

        assertEquals(-1, cache.get(2));
        assertEquals(2, cache.get(3));
    }

    @Test
    void TestCapacityEqualToTwo() {
        LRUCache cache = new LRUCache(2);

        cache.put(2, 1);
        cache.put(2, 2);
        assertEquals(2, cache.get(2));
        cache.put(1, 1);
        cache.put(4, 1);
        assertEquals(-1, cache.get(2));
    }

    @Test
    void TestCapacityEqualToThree() {
        LRUCache cache = new LRUCache(3);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        cache.put(4, 4);
        assertEquals(4, cache.get(4));
        assertEquals(3, cache.get(3));
        assertEquals(2, cache.get(2));
        assertEquals(-1, cache.get(1));
        cache.put(5, 5);
        assertEquals(-1, cache.get(1));
        assertEquals(2, cache.get(2));
        assertEquals(3, cache.get(3));
        assertEquals(-1, cache.get(4));
        assertEquals(5, cache.get(5));
    }
}