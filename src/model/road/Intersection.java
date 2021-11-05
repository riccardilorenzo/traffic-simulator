package model.road;

import model.road.sensor.Sensor;

/**
 * This class defines an intersection between three or more roads.
 * When crossed, vehicle just instant transport to the destination road if has his right free.
 */
public class Intersection {
    private Road[] roads;
    private Sensor[] sensors;
    private int roadsNumber;

    public Intersection(int roadsNumber, Sensor[] sensors, Road[] roads) {
        if (roadsNumber < 2)
            throw new IllegalArgumentException("Number of roads too low, must be at least three.");
        if (roadsNumber != sensors.length || roadsNumber != roads.length)
            throw new IllegalArgumentException("Different number of roads and sensors or forming roads.");
        this.roadsNumber = roadsNumber;
        this.sensors = sensors;
        this.roads = roads;
    }

    /**
     * Getter method for the number of roads.
     * @return The number of roads as an int.
     */
    public int getRoadsNumber() {
        return this.roadsNumber;
    }

    /**
     * Getter method for the sensors.
     * @return The sensors in this intersection.
     */
    public Sensor[] getSensors() {
        return this.sensors;
    }

    /**
     * Getter method for the roads forming this intersection.
     * @return The roads of this intersection.
     */
    public Road[] getRoads() {
        return this.roads;
    }
}
