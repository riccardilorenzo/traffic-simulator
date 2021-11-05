package model.road;

import model.utils.color.material.RoadMaterial;
import model.vehicle.Vehicle;

import java.util.List;

/**
 * This interface defines a generic road, made of a certain material and with a certain number of slots for vehicles.
 */
public interface Road {

    /**
     * Getter method for the material this road is made of.
     * @return The road material, given as RoadMaterial.
     */
    public RoadMaterial getRoadMaterial();

    /**
     * Getter method for the length of this road, in terms of slots for vehicles.
     * @return The length of this road, i.e. the number of its slots, as an int.
     */
    public int getLength();

    /**
     * Getter method for the list of currently occupying vehicles.
     * @return The list of occupying vehicles.
     */
    public List<Vehicle> getVehicles();

    /**
     * Getter method for the number of lanes in this road (one lane means one lane forwards and one backwards).
     * @return The number of lanes as an int.
     */
    public int getLanesNumber();

    /**
     * Puts a vehicle at the end of the road (i.e. in the last position of the list of vehicles).
     * @param vehicle The Vehicle to be put.
     */
    public void putVehicle(Vehicle vehicle);

    /**
     * Puts a vehicle at the end of the specified lane.
     * @param vehicle The Vehicle to be put.
     * @param laneNumber The lane number the vehicle has to be put into.
     */
    public void putVehicle(Vehicle vehicle, int laneNumber);

    /**
     * Removes the Vehicle at the first index (i.e. the first occupant of the road), and shifts the entire list.
     */
    public void removeVehicle();
}
