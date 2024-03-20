package com.nexti.androidtestexample;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class CalculatorRepositoryTest {
    @Test
    public void addition_isCorrect() {
        CalculatorRepository calculatorRepository = new CalculatorRepository();
        Double n1 = Math.random();
        Double n2 = Math.random();
        assertEquals((Double) (n1 + n2), calculatorRepository.getSum(n1, n2));
    }

    @Test
    public void subtraction_isCorrect() {
        CalculatorRepository calculatorRepository = new CalculatorRepository();
        Double n1 = Math.random();
        Double n2 = Math.random();
        assertEquals((Double) (n1 - n2), calculatorRepository.getDifference(n1, n2));
    }

    @Test
    public void multiplication_isCorrect() {
        CalculatorRepository calculatorRepository = new CalculatorRepository();
        Double n1 = Math.random();
        Double n2 = Math.random();
        assertEquals((Double) (n1 * n2), calculatorRepository.getProduct(n1, n2));
    }

    @Test
    public void division_isCorrect() {
        CalculatorRepository calculatorRepository = new CalculatorRepository();
        Double n1 = Math.random();
        Double n2 = Math.random();
        assertEquals((Double) (n1 / n2), calculatorRepository.getQuotient(n1, n2));
    }

    @Test
    public void exampleMockTest() {
        Double n1 = 2.0;
        Double n2 = 3.1;
        Double result = 123.456;
        MockitoAnnotations.openMocks(this);
        CalculatorRepository calculatorRepository = Mockito.mock(CalculatorRepository.class);
        Mockito.when(calculatorRepository.getSum(n1, n2)).thenReturn(result);
        assertEquals(result, calculatorRepository.getSum(n1, n2));
    }
}