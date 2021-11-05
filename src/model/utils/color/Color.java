package model.utils.color;

public class Color {
    private int red, green, blue, alpha;

    public Color(int red, int green, int blue, int alpha) {
        if (red < 0 || green < 0 || blue < 0 || alpha < 0)
            throw new IllegalArgumentException("Specified color not valid: negative values.");

        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public Color(int red, int green, int blue) {
        this(red, green, blue, 1);
    }

    public Color(DefaultColor color) {
        this(color.getRed(), color.getGreen(), color.getBlue());
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public int getAlpha() {
        return alpha;
    }

    @Override
    public String toString() {
        return "(R: " + this.getRed() + ", G: " + this.getGreen()
                + ", B: " + this.getBlue() + ", A: " + this.getAlpha() + ")";
    }
}
