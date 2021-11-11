package model.road;

/**
 * This class defines a traffic light, used in the Intersection class.
 * Each traffic light has a clock (i.e. the time between a change of color and another).
 * Each traffic light supports a certain number of lanes.
 */
public class TrafficLight {
    private int clockYellowRed, clockGreenYellow;
    private final int laneNumber;

    public TrafficLight(int laneNumber, int clockGreenYellow, int clockYellowRed) {
        if (laneNumber <= 0)
            throw new IllegalArgumentException("Lane number must be greater than zero.");
        if (clockGreenYellow <= 0 || clockYellowRed <= 0)
            throw new IllegalArgumentException("Clock must be positive.");
        this.clockGreenYellow = clockGreenYellow;
        this.clockYellowRed = clockYellowRed;
        this.laneNumber = laneNumber;
    }

    public TrafficLight(int laneNumber, int clockYellowRed) {
        this(laneNumber, clockYellowRed * 2, clockYellowRed);
    }

    /**
     * Getter method for the number of lanes this TrafficLights supports.
     * @return The number of lanes associated with this TrafficLight object.
     */
    public int getLaneNumber() {
        return this.laneNumber;
    }

    /**
     * Getter method for the clock time from yellow to red.
     * @return The clock time from yellow to red.
     */
    public int getClockYellowRed() {
        return this.clockYellowRed;
    }

    /**
     * Getter method for the clock time from green to yellow.
     * @return The clock time from green to yellow.
     */
    public int getClockGreenYellow() {
        return this.clockGreenYellow;
    }

    /**
     * Setter method for the clock time.
     * This method sets the clock time between green and yellow to two times the clock given (from yellow to red).
     */
    public void setClock(int clockYellowRed) {
        this.setClock(clockYellowRed * 2, clockYellowRed);
    }

    /**
     * Setter method for the clock time.
     */
    public void setClock(int clockGreenYellow, int clockYellowRed) {
        if (clockYellowRed <= 0 || clockGreenYellow <= 0)
            throw new IllegalArgumentException("Clock must be positive.");
        this.clockYellowRed = clockYellowRed;
        this.clockGreenYellow = clockGreenYellow;
    }
}
