package by.itstep.javatraining.revision.task;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task03Test {

    @Test
    public void testWithSingleDigitNumber() {
        assertEquals(4, Task03.start(4));
    }

    @Test
    public void testWithTwoDigitNumber() {
        assertEquals(4, Task03.start(24));
    }

    @Test
    public void testWithThreeDigitNumber() {
        assertEquals(4, Task03.start(124));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(4, Task03.start(-4));
        assertEquals(1, Task03.start(-11));
        assertEquals(2, Task03.start(-12));
    }

    @Test
    public void testZeroNumber() {
        assertEquals(0, Task03.start(0));
    }

    @Test
    public void testBoundaryNumber() {
        assertEquals(1, Task03.start(1));
        assertEquals(9, Task03.start(9));
        assertEquals(9, Task03.start(99));
        assertEquals(0, Task03.start(10));
        assertEquals(0, Task03.start(100));
    }
}