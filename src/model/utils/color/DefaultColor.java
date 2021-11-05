package model.utils.color;

public enum DefaultColor {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

    private int red, green, blue;

    private DefaultColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return this.red;
    }

    public int getGreen() {
        return this.red;
    }

    public int getBlue() {
        return this.red;
    }
}
