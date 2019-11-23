package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map map = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) map.get(color);

        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
