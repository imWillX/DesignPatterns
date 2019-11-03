package structural.bridge;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(10, 10, 5, new RedCircle());
        circle.draw();
        Circle circle2 = new Circle(12, 13, 8, new BlueCircle());
        circle2.draw();
    }
}
