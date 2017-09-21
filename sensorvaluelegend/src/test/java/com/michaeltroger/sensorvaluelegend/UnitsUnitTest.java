package com.michaeltroger.sensorvaluelegend;

import android.hardware.Sensor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UnitsUnitTest {
    @Test
    public void getUnits_isCorrect() throws Exception {
        assertEquals(SensorValueLegend.getUnits(Sensor.TYPE_ACCELEROMETER)[0], "m/s²");
    }

    @Test
    public void getUnits_sensorIsWrong() throws Exception {
        assertNull(SensorValueLegend.getUnits(520));
    }
}