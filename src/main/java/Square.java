public class Square extends Figure {

    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: square, area: " + getArea() + ", side:"
                + getSide() + ", color:" + getColor();
    }

    @Override
    public Color getColor() {
        return color;
    }
}
