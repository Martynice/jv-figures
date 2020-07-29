public class Circle extends Figure {

    private double radius;
    private Color color;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: triangle, area: " + getArea() + ", radius:"
                + getRadius() + ", color:" + getColor();
    }

    @Override
    public Color getColor() {
        return color;
    }
}
