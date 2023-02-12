package pl.javastart.testowanie.calculators.daysInMonth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import pl.javastart.testowanie.calculators.daysInMonth.MonthCalculator;


public class MonthCalculatorTest {

    private MonthCalculator monthCalculator;

    @BeforeEach
    public void init() {
        monthCalculator = new MonthCalculator();
    }


    @DisplayName("Days in 06.2018")
    @Test
    public void shouldReturn30For2018_06() {
        // when
        int dayCount = monthCalculator.getDayCount(2018, 6);

        // then
        Assertions.assertEquals(30, dayCount);
    }

    @DisplayName("Days in 07.2018")
    @Test
    public void shouldReturn31For2018_07() {
        // when
        int dayCount = monthCalculator.getDayCount(2018, 7);

        // then
        Assertions.assertEquals(31, dayCount);
    }

    @DisplayName("Days in 08.2018")
    @Test
    public void shouldReturn31For2018_08() {
        // when
        int dayCount = monthCalculator.getDayCount(2018, 8);

        // then
        Assertions.assertEquals(31, dayCount);
    }

    @DisplayName("Days in 02.2018")
    @Test
    public void shouldReturn28For2018_02() {
        // when
        int dayCount = monthCalculator.getDayCount(2018, 2);

        // then
        Assertions.assertEquals(28, dayCount);
    }

    @DisplayName("Days in 02.2016")
    @Test
    public void shouldReturn29For2016_02() {
        // when
        int dayCount = monthCalculator.getDayCount(2016, 2);

        // then
        Assertions.assertEquals(29, dayCount);
    }

    @DisplayName("Days in 02.2010")
    @Test
    public void shouldReturn28For2010_02() {
        // when
        int dayCount = monthCalculator.getDayCount(2010, 2);

        // then
        Assertions.assertEquals(28, dayCount);
    }

    @DisplayName("Days in 02.2000")
    @Test
    public void shouldReturn28For2000_02() {
        // when
        int dayCount = monthCalculator.getDayCount(2000, 2);

        // then
        Assertions.assertEquals(29, dayCount);
    }

    @DisplayName("Days in 02.2100")
    @Test
    public void shouldReturn28For2100_02() {
        // when
        int dayCount = monthCalculator.getDayCount(2100, 2);

        // then
        Assertions.assertEquals(28, dayCount);
    }

    @DisplayName("Days of the month for the year")
    @ParameterizedTest(name = "Year {arguments} month has 31 days")
    @CsvSource({"2018,07", "2018,08"})
    public void shouldReturn31ForMonthInYear(int year,int month) {
        // when
        int dayCount = monthCalculator.getDayCount(year, month);

        // then
        Assertions.assertEquals(31, dayCount);
    }

    @DisplayName("Days of the month for the year")
    @ParameterizedTest(name = "Year {arguments} month has 30 days")
    @CsvSource("2018,06")
    public void shouldReturn30ForMonthInYear(int year,int month) {
        // when
        int dayCount = monthCalculator.getDayCount(year, month);

        // then
        Assertions.assertEquals(30, dayCount);
    }

    @DisplayName("Days of the month for the year")
    @ParameterizedTest(name = "Year {arguments} month has 29 days")
    @CsvSource({"2016,02", "2000,02"})
    public void shouldReturn29ForMonthInYear(int year,int month) {
        // when
        int dayCount = monthCalculator.getDayCount(year, month);

        // then
        Assertions.assertEquals(29, dayCount);
    }

    @DisplayName("Days of the month for the year")
    @ParameterizedTest(name = "Year {arguments} month has 28 days" )
    @CsvSource({"2018,02", "2010,02","2100,02"})
    public void shouldReturn28ForMonthInYear(int year,int month) {
        // when
        int dayCount = monthCalculator.getDayCount(year, month);

        // then
        Assertions.assertEquals(28, dayCount);
    }

}
