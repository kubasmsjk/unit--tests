package pl.javastart.testowanie.assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class JUnit5AssertionsTest {

    private JUnit5Assertions jUnit5Assertions;

    @BeforeEach
    public void init() {
        jUnit5Assertions = new JUnit5Assertions();
    }

    @Test
    public void shouldReturnTrueIfIsPrimary() {
        //given
        int number = 5;

        //when
        boolean result = jUnit5Assertions.isPrimeNumber(number);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfIsNotPrimary() {
        //given
        int number = 10;

        //when
        boolean result = jUnit5Assertions.isPrimeNumber(number);

        //then
        assertFalse(result);
    }

    @Test
    public void shouldReturnValidCode() {

        //when
        JUnit5Assertions.Code code = jUnit5Assertions.getCode("first");

        //then
        assertEquals("first", code.getKey());
        assertNotNull(code.getCreatedAtTimestamp());
        assertNotNull(code.getCode());
    }

    @Test
    public void shouldReturnSameCodes() {

        //when
        JUnit5Assertions.Code firstCode = jUnit5Assertions.getCode("first");
        JUnit5Assertions.Code secondCode = jUnit5Assertions.getCode("first");

        //then
        assertSame(firstCode, secondCode);
    }

    @Test
    public void shouldReturnDiffrentCodes() {

        //when
        JUnit5Assertions.Code firstCode = jUnit5Assertions.getCode("first");
        JUnit5Assertions.Code secondCode = jUnit5Assertions.getCode("second");

        //then
        assertNotSame(firstCode,secondCode);
    }
}