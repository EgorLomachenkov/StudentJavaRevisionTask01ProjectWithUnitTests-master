package by.itstep.javatraining.revision.task;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task05Test {

    @Test
    public void testPositiveEvenNumber() {
        assertEquals(4, Task05.start(2));
        assertEquals(10, Task05.start(8));
        assertEquals(12, Task05.start(10));
    }

    @Test
    public void testPositiveOddNumber() {
        assertEquals(4, Task05.start(3));
        assertEquals(10, Task05.start(9));
        assertEquals(12, Task05.start(11));
    }

    @Test
    public void testZeroNumber() {
        assertEquals(0, Task05.start(0));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(0, Task05.start(-5));
    }

    @Test
    public void testBoundaryNumber() {
        assertEquals(2, Task05.start(1));
    }
}