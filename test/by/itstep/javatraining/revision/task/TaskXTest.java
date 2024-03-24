package by.itstep.javatraining.revision.task;

import org.junit.Test;
import static org.junit.Assert.*;

public class TaskXTest {

    @Test
    public void testWhereMoreCoinThanSeekerWithoutRemainder() {
        assertEquals(0, TaskX.start(4, 20));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithOneRemainder() {
        assertEquals(4, TaskX.start(5, 6));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithTwoRemainder() {
        assertEquals(3, TaskX.start(5, 7));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithThreeRemainder() {
        assertEquals(2, TaskX.start(5, 8));
    }

    @Test
    public void testWhereMoreCoinThanSeekerWithFourRemainder() {
        assertEquals(1, TaskX.start(5, 9));
    }

    @Test
    public void testWhereOnlyOneCoinLeft() {
        assertEquals(4, TaskX.start(5, 1));
    }

    @Test
    public void testWhereMoreSeekerThanCoin() {
        assertEquals(11, TaskX.start(16, 5));
    }

    @Test
    public void testTheSameSeekerAndCoin() {
        assertEquals(0, TaskX.start(10, 10));
    }

    @Test
    public void testOnlyOneSeekerAndOnlyOneCoin() {
        assertEquals(0, TaskX.start(1, 1));
    }

    @Test
    public void testNegativeSeeker() {
        assertEquals(-1, TaskX.start(-3, 1));
    }

    @Test
    public void testNegativeCoin() {
        assertEquals(-1, TaskX.start(3, -1));
    }

    @Test
    public void testZeroSeeker() {
        assertEquals(-1, TaskX.start(0, 10));
    }

    @Test
    public void testZeroCoin() {
        assertEquals(-1, TaskX.start(2, 0));
    }
}