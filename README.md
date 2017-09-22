# Sensor Value Legend
A simple Android library which provides a legend for the sensor values by providing the sensor type.

## Usage
```
final String[] shortDescriptions = SensorValueLegend.getDescriptionsShort(Sensor.TYPE_ACCELEROMETER);
// shortDescriptions contains -> [0] = "accX", [1] = "accY", [2] = "accZ"

final String[] fullDescriptions = SensorValueLegend.getDescriptionsShort(Sensor.TYPE_ACCELEROMETER);
// fullDescriptions contains -> [0] = "Acceleration including gravity on x-axis", [1] = "Acceleration including gravity on y-axis", [2] = "Acceleration including gravity on z-axis"

final String[] units = SensorValueLegend.getUnits(Sensor.TYPE_ACCELEROMETER);
// units contains -> [0] = "m/s²", [1] = "m/s²", [2] = "m/s²"
```

## Setting up
In your project's build gradle add the respository:
```
allprojects {
    repositories {
        // ...
        maven {
            url 'https://dl.bintray.com/michaeltroger/android'
        }
        
    }
}
```

finally in your module's build.gradle reference the library:
```
dependencies {
  // ...
  compile 'com.michaeltroger.sensorvaluelegend:sensorvaluelegend:1.0.2'
}
```
