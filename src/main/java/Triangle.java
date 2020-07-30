public class Triangle extends Figure {

    private double cathetus1;
    private double cathetus2;
    private Color color;

    public Triangle(double cathetus1, double cathetus2, Color color) {
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
        this.color = color;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
    }

    @Override
    public double getArea() {
        return cathetus1 * cathetus2 / 2;
    }

    @Override
    public String draw() {
        return "Figure: triangle, area: " + getArea() + ", hipotenuza:"
                + getHypotenuse() + ", color:" + getColor();
    }

    @Override
    public Color getColor() {
        return color;
    }
}
