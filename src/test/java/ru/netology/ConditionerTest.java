package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ConditionerTest {

    @Test
    void increaseCurrentTemperatureSuccess() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(17);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(20);

        int oldTemperature = conditioner.getCurrentTemperature();

        conditioner.increaseCurrentTemperature();

        int newTemperature = conditioner.getCurrentTemperature();

        assertEquals(oldTemperature + 1, newTemperature);
    }

    @Test
    void increaseCurrentTemperatureExceedMaxLimit() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(17);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(25);

        int oldTemperature = conditioner.getCurrentTemperature();

        conditioner.increaseCurrentTemperature();

        int newTemperature = conditioner.getCurrentTemperature();

        assertEquals(oldTemperature, newTemperature);
    }

    @Test
    void decreaseCurrentTemperatureSuccess() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(17);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(20);

        int oldTemperature = conditioner.getCurrentTemperature();

        conditioner.decreaseCurrentTemperature();

        int newTemperature = conditioner.getCurrentTemperature();

        assertEquals(oldTemperature - 1, newTemperature);
    }

    @Test
    void decreaseCurrentTemperatureExceedMinLimit() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(17);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(17);

        int oldTemperature = conditioner.getCurrentTemperature();

        conditioner.decreaseCurrentTemperature();

        int newTemperature = conditioner.getCurrentTemperature();

        assertEquals(oldTemperature, newTemperature);
    }

    @Test
    void setCurrentTemperatureExceedMinLimit() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(17);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(20);

        int oldTemperature = conditioner.getCurrentTemperature();

        conditioner.setCurrentTemperature(16);

        int newTemperature = conditioner.getCurrentTemperature();

        assertEquals(oldTemperature, newTemperature);
    }

    @Test
    void setCurrentTemperatureExceedMaxLimit() {
        Conditioner conditioner = new Conditioner();

        conditioner.setMinTemperature(17);
        conditioner.setMaxTemperature(25);
        conditioner.setCurrentTemperature(20);

        int oldTemperature = conditioner.getCurrentTemperature();

        conditioner.setCurrentTemperature(26);

        int newTemperature = conditioner.getCurrentTemperature();

        assertEquals(oldTemperature, newTemperature);
    }
}
