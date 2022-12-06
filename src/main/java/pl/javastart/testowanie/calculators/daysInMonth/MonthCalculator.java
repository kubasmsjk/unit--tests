package pl.javastart.testowanie.calculators.daysInMonth;

import java.time.YearMonth;

public class MonthCalculator {
    int getDayCount(int year, int month) {
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
