package structural.bridge;

public class BlueCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Blue Circle at (" + x + "," + y + ") with radius=" + radius);
    }
}
