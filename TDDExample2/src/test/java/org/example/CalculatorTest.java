//Meryem Durdu
//B221202375
// SWE202 Software Verification and Validation Homework
// https://github.com/meryemdurdu/Homework-SVV.git

package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    // Method to provide test cases for division
    static Stream<Arguments> divisionTestCases() {
        return Stream.of(
                Arguments.of(10, 2, 5),
                Arguments.of(10, 4, 2.5f),
                Arguments.of(12.5f, 2.5f, 5),
                Arguments.of(10, 2.5f, 4),
                Arguments.of(12.5f, 5, 2.5f)
        );
    }

    // Parameterized test for division
    @ParameterizedTest
    @MethodSource("divisionTestCases")
    void testDivision(float dividend, float divisor, float expectedResult) {
        assertEquals(expectedResult, Calculator.divide(dividend, divisor));
    }
}
