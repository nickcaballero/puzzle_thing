package com.idklabs.app;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class LinkedListTest {
    
    @Test
    public void testList() {
		LinkedList example = new LinkedList();
		assertEquals(1, example.getSize());
		example.addLayer();
		assertEquals(3, example.getSize());
    }
}
