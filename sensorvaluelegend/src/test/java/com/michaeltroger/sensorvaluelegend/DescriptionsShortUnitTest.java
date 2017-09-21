package com.michaeltroger.sensorvaluelegend;

import android.hardware.Sensor;

import org.junit.Test;

import static org.junit.Assert.*;

public class DescriptionsShortUnitTest {
    @Test
    public void getDescriptionsShort_isCorrect() throws Exception {
        assertEquals(SensorValueLegend.getDescriptionsShort(Sensor.TYPE_ACCELEROMETER)[0], "accX");
    }

    @Test
    public void getDescriptionsShort_sensorIsWrong() throws Exception {
        assertNull(SensorValueLegend.getDescriptionsShort(520));
    }
}