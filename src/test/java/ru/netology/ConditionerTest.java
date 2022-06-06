package ru.netology;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    public void shouldCreateConditioner() {

        Conditioner conditioner = new Conditioner();
        Conditioner conditioner1 = new Conditioner(40);  // создадим др кондиционер с др макс темп
        Conditioner conditioner2 = new Conditioner(0, 30);
        conditioner.setCurrentTemperature(35);
        conditioner1.setCurrentTemperature(35);
        int actual = conditioner.getCurrentTemperature();
        int actual2 = conditioner1.getCurrentTemperature();
        int expected = 0;
        int expected2 = 35;
        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected2, actual2 );

    }

}
