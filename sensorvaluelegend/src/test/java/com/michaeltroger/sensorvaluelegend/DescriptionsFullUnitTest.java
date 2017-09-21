package com.michaeltroger.sensorvaluelegend;

import android.hardware.Sensor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DescriptionsFullUnitTest {
  @Test
    public void getDescriptionsFull_isCorrect() throws Exception {
        assertEquals(SensorValueLegend.getDescriptionsFull(Sensor.TYPE_ACCELEROMETER)[0], "Acceleration including gravity on x-axis");
    }
    @Test
    public void getDescriptionsFull_sensorIsWrong() throws Exception {
        assertNull(SensorValueLegend.getDescriptionsFull(520));
    }
}