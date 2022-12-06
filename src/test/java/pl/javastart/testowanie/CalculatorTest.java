package pl.javastart.testowanie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldAdd5To2AndResult7(){
        //given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        //when
        int result = calculator.add(a, b);

        //then
        Assertions.assertEquals(7,result);
    }

    @Test
    public void shouldAdd1To1AndResult2(){
        //given
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 1;

        //when
        int result = calculator.add(a, b);

        //then
        Assertions.assertEquals(2,result);
    }




}