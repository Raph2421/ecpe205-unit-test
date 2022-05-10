package com.ecpe205;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest {
    Calculator calc;

    @BeforeAll
    void setup(){
        calc = new Calculator();
    }

    //CREATE A TEST TO TEST isEven
    @Test
    void shouldCheckValueIsEven() {
        assertEquals(true,calc.isEven(2));
        assertEquals(false,calc.isEven(1));
    }

    @Test
    void shouldCheckValueIsOdd() {
        assertEquals(true,calc.isOdd(1));
        assertEquals(false,calc.isOdd(2));
    }


    @Test
    @DisplayName("Sum 2 encoded values")
    void shouldSumTwoEncodedValues() {

        // 1 + 2 = 3
        assertEquals(3, calc.sum(1,2) );
        assertEquals(9, calc.sum(5,4) );
        assertEquals(5, calc.sum(3,2) );
        assertEquals(14, calc.sum(5,9) );
    }
    //Test of number 1
    @Test
    @DisplayName("Ans of Base X Power Y")
    void shouldBaseXPowerY1 (){

        assertEquals(8, calc.ans(2,3) );
        assertEquals(27, calc.ans(3,3) );
        assertEquals(1, calc.ans(12,0) );
        assertEquals(1, calc.ans(5,0) );
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void shouldSumValueWithOne( int value ) {
        assertEquals(value + 1, calc.sum(value, 1));
    }

    @ParameterizedTest
    @MethodSource("sumInputValues")
    void shouldSumTwoInputValues(int a, int b) {
        assertEquals(a + b, calc.sum(a, b));
    }

    //1. Test of base X power of Y
    @ParameterizedTest
    @MethodSource("AnsForBasePower")
    void shouldBaseXPowerY(int x, int y) { assertEquals( Math.pow(x, y), calc.ans(x, y)); }

    //2. Test of factorial
    @ParameterizedTest
    @ValueSource(ints =  {120, 1, 720, 40320, 6})
    void shouldGetFact(int f) {
        assertEquals(120, calc.factorial(5));
        assertEquals(1, calc.factorial(1));
        assertEquals(720, calc.factorial(6));
        assertEquals(40320, calc.factorial(8));
        assertEquals(6, calc.factorial(3));

    }
    //3. Test of Palindrome


    //4. Test of Sort
    @ParameterizedTest
    @MethodSource("AnsForBasePower")
    void ShouldSort(int [ ] array) { assertEquals( calc.bubbleSort(array)
    }


    static Stream<Arguments> sumInputValues () {
        return Stream.of(
                Arguments.of(1,2),
                Arguments.of(4,6),
                Arguments.of(2,7),
                Arguments.of(3,7),
                Arguments.of(3,0)
        );
    }

    //1. Test of base X power of Y
    static Stream<Arguments> AnsForBasePower () {
        return Stream.of(
                Arguments.of(2,3),
                Arguments.of(6,4),
                Arguments.of(12,4),
                Arguments.of(1,7),
                Arguments.of(1,0)
        );
    }

}