package creational.prototype;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeCache = new Hashtable<>();

    public static Shape getShape(String id) {
        Shape shape = shapeCache.get(id);
        return (Shape) shape.clone();
    }

    public static void load() {
        Shape circle = new Circle();
        circle.setId("1");
        shapeCache.put(circle.getId(), circle);

        Shape square = new Square();
        square.setId("2");
        shapeCache.put(square.getId(), square);

        Shape rectangle = new Rectangle();
        rectangle.setId("3");
        shapeCache.put(rectangle.getId(), rectangle);
    }
}
