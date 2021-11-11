package model.road;

import model.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Lane {
    private final Direction direction;
    private final Optional<TrafficLight> trafficLight;
    private List<Vehicle> vehicles;

    public Lane(Direction direction, TrafficLight trafficLight) {
        if (direction == null)
            throw new IllegalArgumentException("Direction null, cannot proceed.");
        this.direction = direction;
        if (trafficLight == null)
            this.trafficLight = Optional.empty();
        else
            this.trafficLight = Optional.of(trafficLight);
        this.vehicles = new ArrayList<>();
    }

    public Lane(Direction direction) {
        this(direction, null);
    }

    /**
     * Getter method for the traffic light installed at the end of this lane.
     * @return The (optional) traffic light at the end of this lane.
     */
    public Optional<TrafficLight> getTrafficLight() {
        return this.trafficLight;
    }

    /**
     * Getter method for the direction of this lane, as specified in the Direction enum.
     * Two roads are connected if and only if consecutive and going in the same direction.
     * @return The direction of this lane.
     */
    public Direction getDirection() {
        return this.direction;
    }

    /**
     * Puts a vehicle at the end of this Lane.
     * @param vehicle The Vehicle to be put.
     */
    public void putVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    /**
     * This method removes the first vehicle in this road, i.e. the first occupant.
     */
    public void removeVehicle() {
        this.removeVehicle(0);
    }

    private void removeVehicle(int index) {
        this.vehicles.remove(index);
    }

    /**
     * This method removes the specified Vehicle from this lane.
     * @param vehicle The Vehicle to be removed.
     */
    public void removeVehicle(Vehicle vehicle) {
        this.vehicles.remove(vehicle);
    }
}
