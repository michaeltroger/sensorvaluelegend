# Sensor Value Legend
An Android library which provides a legend for the sensor values by providing the sensor type.

## Usage
```
final String[] legend = SensorValueLegend.getLegend(Sensor.TYPE_ACCELEROMETER);
// legend contains -> legend[0] = "accX", legend[1] = "accY", legend[2] = "accZ"
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
  compile 'com.michaeltroger.sensorvaluelegend:sensorvaluelegend:1.0.0'
}
```
