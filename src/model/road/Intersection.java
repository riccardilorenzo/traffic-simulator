package model.road;

import model.road.sensor.Sensor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

// TODO: roundabouts
// TODO: FORCED TURNS IN SOME INTERSECTIONS
/**
 * This class defines an intersection between three or more roads.
 * When crossed, vehicle just instant transport to the destination road if has his right free.
 */
public class Intersection {
    private Map<Road, Sensor> roads;

    public Intersection() {
        this(new HashMap<Road, Sensor>());
    }

    public Intersection(Map<Road, Sensor> roads) {
        if (roads == null)
            throw new IllegalArgumentException("Roads null, aborting.");
        if (roads.keySet().size() < 3 && roads.keySet().size() != 0)
            throw new IllegalArgumentException("Number of roads too low, must be at least three.");
        if (!validateRoads(roads))
            throw new IllegalArgumentException("Roads and/or associated sensors not valid (null).");
        this.roads = roads;
    }

    private boolean validateRoads(Map<Road, Sensor> roads) {
        for (Road r : roads.keySet()) {
            if (r == null) return false;
        }
        for (Sensor s : roads.values()) {
            if (s == null) return false;
        }
        return true;
    }

    /**
     * Auxiliary method to add a Road to this Intersection.
     * @param road The Road to be added.
     * @param sensor The Sensor associated to the Road given.
     */
    public void addRoad(Road road, Sensor sensor) {
        if (road == null || sensor == null)
            throw new IllegalArgumentException("Road and/or associated sensor cannot be null.");
        this.roads.put(road, sensor);
    }

    /**
     * Auxiliary method to remove a Road to this Intersection.
     * @param road The Road to be removed, along with its associated Sensor.
     */
    public void removeRoad(Road road) {
        if (road == null)
            throw new IllegalArgumentException("Road null, aborting.");
        this.roads.remove(road);
    }

    /**
     * Getter method for the sensors.
     * @return The sensors in this intersection.
     */
    public List<Sensor> getSensors() {
        return new ArrayList<>(this.roads.values());
    }

    /**
     * Getter method for the roads forming this intersection.
     * @return The roads of this intersection.
     */
    public List<Road> getRoads() {
        return new ArrayList<>(this.roads.keySet());
    }

    /**
     * This method resolves the intersection.
     * In other words, this moves, from each connected lane, the first vehicle into another, random, lane of another road.
     * The most left lane of a road cannot continue in a lane of a road more curved than 180 degrees. The same applies for the most right lane.
     * @return True if the intersection has been resolved, false otherwise (an error occurred).
     */
    public boolean resolve() {
        for (Road r : this.getRoads()) {
            // TODO: END THIS METHOD
        }
        return true;
    }
}
