package com.michaeltroger.sensorvaluelegend;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneralUnitTest {
    @Test
    public void checkArraySize_IsCorrect() throws Exception {
        for (int i = 1; i < 36; i++) {
            final String[] shortDescriptions = SensorValueLegend.getDescriptionsShort(i);
            final String[] fullDescriptions = SensorValueLegend.getDescriptionsFull(i);
            final String[] units = SensorValueLegend.getUnits(i);
            if (shortDescriptions == null || fullDescriptions == null || units == null) {
                assertNull(shortDescriptions);
                assertNull(fullDescriptions);
                assertNull(units);
            } else {
                final int size = shortDescriptions.length;
                assertEquals(fullDescriptions.length, size);
                assertEquals(units.length, size);
            }
        }
    }
}
