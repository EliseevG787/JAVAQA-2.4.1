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
// находим максимальное значение
        long maxValue = purchases[0];
        for (long purchase : purchases) {
            if (maxValue < purchase) {
                maxValue = purchase;
            }
        }

// находим количество максимальных значений
        int numberMaxValues = 0;
        for (long purchase : purchases) {
            if (purchase == maxValue) {
                numberMaxValues++;
            }
        }

// находим номер последнего месяца с пиком продаж
        int counter = 0;
        int lastMaximumNumber = 0;
        for (long purchase : purchases) {
            lastMaximumNumber++;
            if (purchase == maxValue) {
                counter++;
            }
            if (counter == numberMaxValues) {
                break;
            }
        }
        return lastMaximumNumber;
    }


    public long lastMonthMinimumSales(long[] purchases) {
// находим минимальное значение
        long minValue = purchases[0];
        for (long purchase : purchases) {
            if (minValue > purchase) {
                minValue = purchase;
            }
        }

// находим количество минимальных значений
        int numberMinValues = 0;
        for (long purchase : purchases) {
            if (purchase == minValue) {
                numberMinValues++;
            }
        }

// находим номер месяца, в котором был минимум продаж
        int counter = 0;
        int lastMinimumNumber = 0;
        for (long purchase : purchases) {
            lastMinimumNumber++;
            if (purchase == minValue) {
                counter++;
            }
            if (counter == numberMinValues) {
                break;
            }
        }
        return lastMinimumNumber;
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

