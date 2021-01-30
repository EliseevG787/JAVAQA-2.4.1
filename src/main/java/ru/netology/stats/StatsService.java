package ru.netology.stats;

public class StatsService {

    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageAmount(long[] purchases) {
        long sum = calculateSum(purchases);
        return sum / purchases.length;
    }

    public long lastMonthMaximumSales(long[] purchases) {
        long maxValue = purchases[0];
        for (long purchase : purchases) {
            if (maxValue < purchase) {
                maxValue = purchase;
            }
        }

        int number = 0;
        int month = 0;
        for (long purchase : purchases) {
            month++;
            if (purchase == maxValue) {
                number = month;
            }
        }
        return number;
    }


    public long lastMonthMinimumSales(long[] purchases) {
        long minValue = purchases[0];
        for (long purchase : purchases) {
            if (minValue > purchase) {
                minValue = purchase;
            }
        }

        int number = 0;
        int month = 0;
        for (long purchase : purchases) {
            month++;
            if (purchase == minValue) {
                number = month;
            }
        }
        return number;
    }

    public long numberMonthsBelowAverageSales(long[] purchases) {
        long averageAmount = calculateAverageAmount(purchases);

        long count = 0;
        for (long purchase : purchases) {
            if (purchase < averageAmount) {
                count++;
            }
        }
        return count;
    }

    public long numberMonthsAboveAverageSales(long[] purchases) {
        long averageAmount = calculateAverageAmount(purchases);

        long count = 0;
        for (long purchase : purchases) {
            if (purchase > averageAmount) {
                count++;
            }
        }
        return count;
    }
}

