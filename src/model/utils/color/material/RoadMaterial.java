package model.utils.color.material;

/**
 * This enum defines a material for roads, and defines a name (used in the toString() method), along with a frictionCoefficient used for the simulation.
 */
public enum RoadMaterial {
    ASPHALT("Asphalt", (float) 0.8);

    private String name;
    private float frictionCoefficient;

    private RoadMaterial(String name, float frictionCoefficient) {
        this.name = name;
        this.frictionCoefficient = frictionCoefficient;
    }

    public float getFrictionCoefficient() {
        return this.frictionCoefficient;
    }

    @Override
    public String toString() {
        return this.name + ", friction coefficient: " + this.getFrictionCoefficient();
    }
}
