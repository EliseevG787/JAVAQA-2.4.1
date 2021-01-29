package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageAmount() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.calculateAverageAmount(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void lastMonthMaximumSales() {
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.lastMonthMaximumSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void lastMonthMinimumSales() {
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.lastMonthMinimumSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void numberMonthsBelowAverageSales() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.numberMonthsBelowAverageSales(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void  numberMonthsAboveAverageSales() {
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.numberMonthsAboveAverageSales(purchases);

        assertEquals(expected, actual);
    }
}