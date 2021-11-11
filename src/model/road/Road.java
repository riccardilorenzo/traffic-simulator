package model.road;

import model.road.material.RoadMaterial;
import model.vehicle.Vehicle;

import java.util.List;

/**
 * This interface defines a generic road, made of a certain material and of a certain length.
 * Each road has a name, unique.
 */
public interface Road {

    /**
     * Getter method for the name of this road.
     * @return The name of this road, a String.
     */
    public String getName();

    /**
     * Getter method for the material this road is made of.
     * @return The road material, given as RoadMaterial.
     */
    public RoadMaterial getRoadMaterial();

    /**
     * Getter method for the length of this road, in meters. This length is the same for each lane in this road.
     * @return The length of a SINGLE lane of this road, as a float.
     */
    public float getLength();

    /**
     * Getter method for the current status of this Road (closed or open).
     * @return The current status of this Road, a boolean.
     */
    public boolean isClosed();

    /**
     * Getter method for the Z index of this road (i.e. if this is a bridge or a tunnel). 0 is the default height.
     * Three or more roads form an intersection if they are all at the same height.
     * @return The height of this Road, as specified above, as an int.
     */
    public int getHeight();

    /**
     * Getter method for the list of currently occupying vehicles.
     * @return The list of occupying vehicles.
     */
    public List<Vehicle> getVehicles();

    /**
     * Getter method for the list of currently occupying vehicles in the selected lane.
     * @return The list of occupying vehicles in the selected lane.
     */
    public List<Vehicle> getVehicles(int lane);

    /**
     * Getter method for the list of lanes present on this road.
     * @return The list of lanes.
     */
    public List<Lane> getLanes();

    /**
     * Adds a lane to the current list of lanes in this road.
     * This method checks if the lane added has the same or opposite direction of the present lane.
     * Otherwise, this method throws an IllegalArgumentException.
     */
    public void addLane();

    /**
     * Removes the lane at the index specified.
     * @param index The index the lane to be removed is at.
     */
    public void removeLane(int index);

    /**
     * Getter method for the number of lanes in this road (one lane means one lane forwards and one backwards).
     * @return The number of lanes, as an int.
     */
    public int getLanesNumber();

    /**
     * Getter method for the maximum speed allowed on this road.
     * @return The max speed allowed on this road, as a float.
     */
    public float getMaxSpeed();

    /**
     * Puts a vehicle at the end of a random lane.
     * This method checks also if the vehicle can be put (i.e. in at least one lane there's enough room).
     * @param vehicle The Vehicle to be put.
     */
    public boolean putVehicle(Vehicle vehicle);

    /**
     * Puts a vehicle at the end of the specified lane.
     * This method checks also if the vehicle can be put (i.e. in the specified lane there's enough room).
     * @param vehicle The Vehicle to be put.
     * @param laneNumber The lane number the vehicle has to be put into.
     */
    public boolean putVehicle(Vehicle vehicle, int laneNumber);

    /**
     * Removes the specified Vehicle (i.e. the first occupant of the road) of the specified lane.
     * @param vehicle The Vehicle to be removed.
     * @param laneNumber The lane index/number where the vehicle is on.
     */
    public void removeVehicle(Vehicle vehicle, int laneNumber);

    /**
     * Removes the first Vehicle (i.e. the first occupant of the road) of the specified lane.
     * @param laneNumber The lane index/number where the vehicle is on.
     */
    public void removeVehicle(int laneNumber);

    /**
     * Returns if this Road is consecutive to that Road.
     * @param that The second Road to be compared to.
     * @return True if the two roads have some lanes with common direction, false otherwise.
     */
    public boolean isConsecutive(Road that);
}
