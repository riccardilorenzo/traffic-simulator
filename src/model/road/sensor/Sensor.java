package model.road.sensor;

// TODO: maybe use an internal timer in every type of Sensor
// TODO: maybe incorporate TrafficLight into Sensor
/**
 * This interface defines a sensor, used for activating traffic lights in an intersection.
 * The Sensor, when triggered, throws a SensorException, and switches its state.
 */
public interface Sensor {

    /**
     * Getter method for the type of Sensor.
     * @return The type of this Sensor, given as String.
     */
    public String getType();

    /**
     * Checks whether this Sensor is triggered by its associated event.
     * @return True if this Sensor is triggered and currently stopping the normal workflow, false otherwise.
     */
    public boolean isTriggered();

    /**
     * Triggers this Sensor, either automatically or manually by the user.
     * Can also turn off this Sensor, so this method is used whenever you want to change its state.
     */
    public void trigger() throws SensorException;
}
