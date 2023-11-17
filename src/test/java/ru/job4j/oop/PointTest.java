package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double out = dist;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when91to25then8dot06() {
        double expected = 8.06;
        Point a = new Point(1, 9);
        Point b = new Point(5, 2);
        double dist = a.distance(b);
        double out = dist;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when52to02then5dot0() {
        double expected = 5.0;
        Point a = new Point(5, 2);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        double out = dist;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when31to55then4dot47() {
        double expected = 4.47;
        Point a = new Point(3, 1);
        Point b = new Point(5, 5);
        double dist = a.distance(b);
        double out = dist;
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}