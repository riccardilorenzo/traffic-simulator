package model.vehicle;

import model.utils.color.Color;

/**
 * This interface defines a generic vehicle.
 * Each vehicle has, at least, a color (used in the GUI), a weight and a size (used for the simulation).
 */
public interface Vehicle {
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
     * Getter method for the size of the vehicle, in terms of occupied slots in a road.
     * @return The size of the vehicle as an int.
     */
    public int getSize();
}
