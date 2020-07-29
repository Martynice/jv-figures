public class Triangle extends Figure {

    private double side1;
    private double side2;
    private Color color;

    public Triangle(double side1, double side2, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    @Override
    public double getArea() {
        return side1 * side2 / 2;
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
