package com.idklabs.app;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedListTest {
    
    @Test
    public void testList() {
		LinkedList example = new LinkedList();
		System.out.println(example.getSize());
		example.add(1);
		System.out.println(example.getSize());
		example.add(2);
		example.add(3);
		example.add(4);
		example.add(5);
		example.add(6);
		example.add(7);
		System.out.println(example.addLayer(8));
		System.out.println(example.find(4).getData());
		example.remove(5);
		System.out.println(example.getSize());
		System.out.println(example.find(5));
    }
}
