package by.itstep.javatraining.revision.task;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task02Test {

    @Test
    public void testWhereMoreCoinThanSeekerWithoutRemainder() {
        assertEquals(0, Task02.start(2, 30));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithRemainder() {
        assertEquals(2, Task02.start(5, 27));
    }

    @Test
    public void testWhereOnlyOneCoinLeft() {
        assertEquals(1, Task02.start(3, 1));
    }

    @Test
    public void testWhereMoreSeekerThanCoin() {
        assertEquals(5, Task02.start(16, 5));
    }

    @Test
    public void testTheSameSeekerAndCoin() {
        assertEquals(0, Task02.start(10, 10));
    }

    @Test
    public void testOnlyOneSeekerAndOnlyOneCoin() {
        assertEquals(0, Task02.start(1, 1));
    }

    @Test
    public void testNegativeSeeker() {
        assertEquals(-1, Task02.start(-3, 1));
    }

    @Test
    public void testNegativeCoin() {
        assertEquals(-1, Task02.start(3, -1));
    }

    @Test
    public void testZeroSeeker() {
        assertEquals(-1, Task02.start(0, 10));
    }

    @Test
    public void testZeroCoin() {
        assertEquals(-1, Task02.start(2, 0));
    }
}