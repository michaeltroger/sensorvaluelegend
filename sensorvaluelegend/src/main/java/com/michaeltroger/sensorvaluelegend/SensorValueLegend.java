package com.michaeltroger.sensorvaluelegend;

import android.hardware.Sensor;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;

public class SensorValueLegend {
    private static final String TAG = SensorValueLegend.class.getSimpleName();

    private static final SparseArray<String[]> descriptionsShort = new SparseArray<>();
    private static final SparseArray<String[]> descriptionsFull = new SparseArray<>();
    private static final SparseArray<String[]> units = new SparseArray<>();

    static {
        descriptionsShort.append(Sensor.TYPE_ACCELEROMETER, new String[]{"accX", "accY", "accZ"});
        descriptionsFull.append(Sensor.TYPE_ACCELEROMETER, new String[]{"Acceleration including gravity on x-axis", "Acceleration including gravity on y-axis", "Acceleration including gravity on z-axis"});
        units.append(Sensor.TYPE_ACCELEROMETER, new String[]{"m/s²", "m/s²", "m/s²"});

        descriptionsShort.append(Sensor.TYPE_MAGNETIC_FIELD, new String[]{"magX", "magY", "magZ"});
        descriptionsFull.append(Sensor.TYPE_MAGNETIC_FIELD, new String[]{"Ambient magnetic field x-axis", "Ambient magnetic field y-axis", "Ambient magnetic field z-axis"});
        units.append(Sensor.TYPE_MAGNETIC_FIELD, new String[]{"μT", "μT", "μT"});

        descriptionsShort.append(Sensor.TYPE_ORIENTATION, new String[]{"azimuth", "pitch", "roll"});
        descriptionsFull.append(Sensor.TYPE_ORIENTATION, new String[]{"Azimuth", "Pitch", "Roll"});
        units.append(Sensor.TYPE_ORIENTATION, new String[]{"°", "°", "°"});

        descriptionsShort.append(Sensor.TYPE_GYROSCOPE, new String[]{"gyrX", "gyrY", "gyrZ"});
        descriptionsFull.append(Sensor.TYPE_GYROSCOPE, new String[]{"Angular speed around x-axis", "Angular speed around y-axis", "Angular speed around z-axis"});
        units.append(Sensor.TYPE_GYROSCOPE, new String[]{"rad/s", "rad/s", "rad/s"});

        descriptionsShort.append(Sensor.TYPE_LIGHT, new String[]{"illumination"});
        descriptionsFull.append(Sensor.TYPE_LIGHT, new String[]{"Ambient light level"});
        units.append(Sensor.TYPE_LIGHT, new String[]{"lx"});

        descriptionsShort.append(Sensor.TYPE_PRESSURE, new String[]{"pressure"});
        descriptionsFull.append(Sensor.TYPE_PRESSURE, new String[]{"Atmospheric pressure"});
        units.append(Sensor.TYPE_PRESSURE, new String[]{"hPa"});

        descriptionsShort.append(Sensor.TYPE_TEMPERATURE, new String[]{"temp"});
        descriptionsFull.append(Sensor.TYPE_TEMPERATURE, new String[]{"Temperature"});
        units.append(Sensor.TYPE_TEMPERATURE, new String[]{"°C"});

        descriptionsShort.append(Sensor.TYPE_PROXIMITY, new String[]{"proximity"});
        descriptionsFull.append(Sensor.TYPE_PROXIMITY, new String[]{"Proximity sensor distance"});
        units.append(Sensor.TYPE_PROXIMITY, new String[]{"cm"});

        descriptionsShort.append(Sensor.TYPE_GRAVITY, new String[]{"gravX", "gravY", "gravZ"});
        descriptionsFull.append(Sensor.TYPE_GRAVITY, new String[]{"Force of gravity x-axis", "Force of gravity y-axis", "Force of gravity z-axis"});
        units.append(Sensor.TYPE_GRAVITY, new String[]{"m/s²", "m/s²", "m/s²"});

        descriptionsShort.append(Sensor.TYPE_LINEAR_ACCELERATION, new String[]{"linAccX", "linAccY", "linAccZ"});
        descriptionsFull.append(Sensor.TYPE_LINEAR_ACCELERATION, new String[]{"Acceleration excluding gravity on x-axis", "Acceleration excluding gravity on y-axis", "Acceleration excluding gravity on z-axis"});
        units.append(Sensor.TYPE_LINEAR_ACCELERATION, new String[]{"m/s²", "m/s²", "m/s²"});

        descriptionsShort.append(Sensor.TYPE_ROTATION_VECTOR, new String[]{"rotX", "rotY", "rotZ", "rotCos(θ/2)", "headingAccuracy"});
        descriptionsFull.append(Sensor.TYPE_ROTATION_VECTOR, new String[]{"x*sin(θ/2)", "y*sin(θ/2)", "z*sin(θ/2)", "cos(θ/2)", "Estimated heading Accuracy"});
        units.append(Sensor.TYPE_ROTATION_VECTOR, new String[]{"", "", "", "", "rad"});

        descriptionsShort.append(Sensor.TYPE_RELATIVE_HUMIDITY, new String[]{"humidity"});
        descriptionsFull.append(Sensor.TYPE_RELATIVE_HUMIDITY, new String[]{"Relative ambient air humidity"});
        units.append(Sensor.TYPE_RELATIVE_HUMIDITY, new String[]{"%"});

        descriptionsShort.append(Sensor.TYPE_AMBIENT_TEMPERATURE, new String[]{"ambientTemp"});
        descriptionsFull.append(Sensor.TYPE_AMBIENT_TEMPERATURE, new String[]{"Ambient temperature"});
        units.append(Sensor.TYPE_AMBIENT_TEMPERATURE, new String[]{"°C"});

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            descriptionsShort.append(Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED, new String[]{"magXUncalib", "magYUncalib", "magZUncalib", "xBias", "yBias", "zBias"});
            descriptionsFull.append(Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED, new String[]{"Magnetic field uncalibrated x-axis", "Magnetic field uncalibrated y-axis", "Magnetic field uncalibrated z-axis", "Iron bias estimated in x-axis", "Iron bias estimated in y-axis", "Iron bias estimated in z-axis"});
            units.append(Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED, new String[]{"uT", "uT", "uT", "uT", "uT", "uT"});

            descriptionsShort.append(Sensor.TYPE_GAME_ROTATION_VECTOR, new String[]{"rotNoGeomagX", "rotNoGeomagY", "rotNoGeomagZ", "rotNoGeomogCos(θ/2)"});
            descriptionsFull.append(Sensor.TYPE_GAME_ROTATION_VECTOR, new String[]{"x*sin(θ/2) w/o geomagnetic field", "y*sin(θ/2) w/o geomagnetic field", "z*sin(θ/2) w/o geomagnetic field", "cos(θ/2) w/o geomagnetic field"});
            units.append(Sensor.TYPE_GAME_ROTATION_VECTOR, new String[]{"", "", "", ""});

            descriptionsShort.append(Sensor.TYPE_GYROSCOPE_UNCALIBRATED, new String[]{"gyrNoCompX", "gyrNoCompY", "gyrNoCompZ", "gyrDriftX", "gyrDriftY", "gyrDriftZ"});
            descriptionsFull.append(Sensor.TYPE_GYROSCOPE_UNCALIBRATED, new String[]{"Angular speed w/o drift compensation around x-axis", "Angular speed w/o drift compensation around y-axis", "Angular speed w/o drift compensation around z-axis", "Estimated drift around x-axis", "Estimated drift around y-axis", "Estimated drift around z-axis"});
            units.append(Sensor.TYPE_GYROSCOPE_UNCALIBRATED, new String[]{"rad/s", "rad/s", "rad/s", "rad/s", "rad/s", "rad/s"});

            descriptionsShort.append(Sensor.TYPE_SIGNIFICANT_MOTION, new String[]{"sigMot"});
            descriptionsFull.append(Sensor.TYPE_SIGNIFICANT_MOTION, new String[]{"Significant motion"});
            units.append(Sensor.TYPE_SIGNIFICANT_MOTION, new String[]{""});
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            descriptionsShort.append(Sensor.TYPE_STEP_DETECTOR, new String[]{"stepDet"});
            descriptionsFull.append(Sensor.TYPE_STEP_DETECTOR, new String[]{"Step detected"});
            units.append(Sensor.TYPE_STEP_DETECTOR, new String[]{""});

            descriptionsShort.append(Sensor.TYPE_STEP_COUNTER, new String[]{"stepCount"});
            descriptionsFull.append(Sensor.TYPE_STEP_COUNTER, new String[]{"Steps detected since last reboot"});
            units.append(Sensor.TYPE_STEP_COUNTER, new String[]{""});

            descriptionsShort.append(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR, new String[]{"rotGeomagX", "rotGeomagY", "rotGeomagZ", "rotGeomogCos(θ/2)"});
            descriptionsFull.append(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR, new String[]{"x*sin(θ/2) using magnetometer", "y*sin(θ/2) using magnetometer", "z*sin(θ/2) using magnetometer", "cos(θ/2) using magnetometer"});
            units.append(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR, new String[]{"", "", "", ""});
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            descriptionsShort.append(Sensor.TYPE_HEART_RATE, new String[]{"heart"});
            descriptionsFull.append(Sensor.TYPE_HEART_RATE, new String[]{"Heart rate"});
            units.append(Sensor.TYPE_HEART_RATE, new String[]{"BPM"});
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            descriptionsShort.append(Sensor.TYPE_POSE_6DOF, new String[]{"rotPoseX","rotPoseY","rotPoseZ","rotPoseCos","transX","transY","transZ","deltaQuatX","deltaQuatY","deltaQuatZ","deltaQuatCos","deltaTransX","deltaTransY","deltaTransZ","seqNr"});
            descriptionsFull.append(Sensor.TYPE_POSE_6DOF, new String[]{"x*sin(θ/2)", "y*sin(θ/2)", "z*sin(θ/2)", "cos(θ/2)", "Translation x-axis from arbitrary origin", "Translation y-axis from arbitrary origin", "Translation z-axis from arbitrary origin", "Delta quaternion rotation x*sin(θ/2)", "Delta quaternion rotation y*sin(θ/2)", "Delta quaternion rotation z*sin(θ/2)", "Delta quaternion rotation cos(θ/2)", "Delta translation along x-axis", "Delta translation along y-axis", "Delta translation along z-axis", "Sequence number"});
            units.append(Sensor.TYPE_POSE_6DOF, new String[]{"", "", "", "", "", "", "", "", "", "", "", "", "", "", ""});

            descriptionsShort.append(Sensor.TYPE_STATIONARY_DETECT, new String[]{"stat"});
            descriptionsFull.append(Sensor.TYPE_STATIONARY_DETECT, new String[]{"Stationary for at least 5 seconds"});
            units.append(Sensor.TYPE_STATIONARY_DETECT, new String[]{""});

            descriptionsShort.append(Sensor.TYPE_MOTION_DETECT, new String[]{"mot"});
            descriptionsFull.append(Sensor.TYPE_MOTION_DETECT, new String[]{"Motion for at least 5 seconds"});
            units.append(Sensor.TYPE_MOTION_DETECT, new String[]{""});

            descriptionsShort.append(Sensor.TYPE_HEART_BEAT, new String[]{"heartPeak"});
            descriptionsFull.append(Sensor.TYPE_HEART_BEAT, new String[]{"Heart beat peak detected"});
            units.append(Sensor.TYPE_HEART_BEAT, new String[]{"confidence"});
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            descriptionsShort.append(Sensor.TYPE_LOW_LATENCY_OFFBODY_DETECT, new String[]{"offBody"});
            descriptionsFull.append(Sensor.TYPE_LOW_LATENCY_OFFBODY_DETECT, new String[]{"Off-body state"});
            units.append(Sensor.TYPE_LOW_LATENCY_OFFBODY_DETECT, new String[]{""});

            descriptionsShort.append(Sensor.TYPE_ACCELEROMETER_UNCALIBRATED, new String[]{"accXUncalib", "accYUncalib", "accZUncalib", "estXBias", "estYBias", "estZBias"});
            descriptionsFull.append(Sensor.TYPE_ACCELEROMETER_UNCALIBRATED, new String[]{"Acceleration uncalibrated w/o bias x-axis", "Acceleration uncalibrated w/o bias y-axis", "Acceleration uncalibrated w/o bias z-axis", "Estimated x-axis bias", "Estimated y-axis bias", "Estimated z-axis bias"});
            units.append(Sensor.TYPE_ACCELEROMETER_UNCALIBRATED, new String[]{"m/s²", "m/s²", "m/s²", "m/s²", "m/s²", "m/s²"});
        }

    }

    private SensorValueLegend() {}

    /**
     * Retrieve the short descriptions for the sensor's values
     * @param sensorType the Sensor type
     * @return the short descriptions or null if sensor type unknown
     */
    public static String[] getDescriptionsShort(final int sensorType) {
        final String[] legend = descriptionsShort.get(sensorType);
        if (legend == null)  Log.e(TAG, "unknownSensorType:" + sensorType);
        return legend;
    }

    /**
     * Retrieve the full descriptions for the sensor's values
     * @param sensorType the Sensor type
     * @return the full descriptions or or null if sensor type unknown
     */
    public static String[] getDescriptionsFull(final int sensorType) {
        final String[] legend = descriptionsFull.get(sensorType);
        if (legend == null)  Log.e(TAG, "unknownSensorType:" + sensorType);
        return legend;
    }

    /**
     * Retrieve the units for the sensor's values
     * @param sensorType the Sensor type
     * @return the units or or null if sensor type unknown
     */
    public static String[] getUnits(final int sensorType) {
        final String[] legend = descriptionsShort.get(sensorType);
        if (legend == null)  Log.e(TAG, "unknownSensorType:" + sensorType);
        return legend;
    }

}
