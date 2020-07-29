public class Trapezoid extends Figure {

    private double height;
    private double middleLine;
    private Color color;

    public Trapezoid(double height, double middleLine, Color color) {
        this.height = height;
        this.middleLine = middleLine;
        this.color = color;
    }

    private double getHeight() {
        return height;
    }

    private double getMiddleLine() {
        return middleLine;
    }

    @Override
    public double getArea() {
        return height * middleLine;
    }

    @Override
    public String draw() {
        return "Figure: triangle, area: " + getArea() + ", height:"
                + getHeight() + ", middleLine:" + getMiddleLine() + ", color:" + getColor();
    }

    @Override
    public Color getColor() {
        return color;
    }
}
