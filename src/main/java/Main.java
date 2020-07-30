public class Main {
    public static void main(String[] args) {

        int size = (int) Math.random() * 5;
        Figure[] figures = new Figure[size];
        for (int i = 0; i < size; i++) {
            int random = (int) Math.random() * 4;
            switch (random) {
                case 0:
                    figures[i] = new Circle(Math.random() * 10, randomColor());
                case 1:
                    figures[i] = new Square(Math.random() * 10, randomColor());
                case 2:
                    figures[i] = new Triangle(Math.random() * 10, Math.random() * 10, randomColor());
                case 3:
                    figures[i] = new Trapezoid(Math.random() * 10, Math.random() * 10, randomColor());
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
    private static Color randomColor() {
        int random = (int) Math.random() * 3;
        switch (random) {
            case 1:
                return Color.RED;
            case 2:
                return Color.GREEN;
            case 3:
                return Color.BLUE;
            default:
                return Color.MAGENTA;
        }
    }
}
