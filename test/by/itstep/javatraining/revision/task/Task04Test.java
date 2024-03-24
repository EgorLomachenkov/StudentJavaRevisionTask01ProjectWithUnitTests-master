package by.itstep.javatraining.revision.task;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task04Test {

    @Test
    public void testWithSingleDigitNumber() {
        assertEquals(0, Task04.start(1));
        assertEquals(0, Task04.start(9));
    }

    @Test
    public void testWithTwoDigitNumber() {
        assertEquals(1, Task04.start(12));
        assertEquals(9, Task04.start(91));
    }

    @Test
    public void testWithThreeDigitNumber() {
        assertEquals(2, Task04.start(123));
        assertEquals(8, Task04.start(987));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(4, Task04.start(-42));
        assertEquals(0, Task04.start(-100));
        assertEquals(2, Task04.start(-123));
    }

    @Test
    public void testZeroNumber() {
        assertEquals(0, Task04.start(0));
    }

    @Test
    public void testBoundaryNumber() {
        assertEquals(0, Task04.start(9));
        assertEquals(1, Task04.start(11));
        assertEquals(9, Task04.start(99));
        assertEquals(0, Task04.start(101));
        assertEquals(9, Task04.start(991));
        assertEquals(9, Task04.start(199));
    }
}
