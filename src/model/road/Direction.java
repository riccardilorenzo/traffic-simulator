package model.road;

/**
 * This enum defines the directions a road can follow.
 */
public enum Direction {
    UP(0), RIGHT(90), DOWN(180), LEFT(270);

    private final float angle;

    private Direction(float angle) {
        this.angle = angle;
    }

    /**
     * Getter method for the angle of this Direction.
     * @return The angle of this Direction, as a float.
     */
    public float getAngle() {
        return this.angle;
    }
}
