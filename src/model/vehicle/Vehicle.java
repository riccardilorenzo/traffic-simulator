package model.vehicle;

import model.utils.color.Color;

/**
 * This interface defines a generic vehicle.
 * Each vehicle has, at least, a color (used in the GUI), a weight and a size (used for the simulation) and a max speed.
 * Each vehicle is uniquely identified by their ID.
 */
public interface Vehicle {

    /**
     * Getter method for the vehicle's ID.
     * @return The vehicle unique ID, as an int.
     */
    public int getId();

    /**
     * Getter method for the color of the vehicle.
     * @return The color of the vehicle, as a Color object.
     */
    public Color getColor();

    /**
     * Getter method for the weight of the vehicle.
     * @return The weight of the vehicle as an int.
     */
    public float getWeight();

    /**
     * Getter method for the length of the vehicle, in meters.
     * @return The length of the vehicle as a float.
     */
    public float getLength();

    /**
     * Getter method for the maximum speed this vehicle can sustain.
     * @return The max speed of this vehicle, a float.
     */
    public float getMaxSpeed();
}
