package structural.bridge;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red Circle at (" + x + "," + y + ") with radius=" + radius);
    }
}
