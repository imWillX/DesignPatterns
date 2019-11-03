package creational.prototype;

public class Demo {

    public static void main(String[] args) {
        ShapeCache.load();

        /**
         * 36ms
         * 428ms
         */
        measure(true);
        measure(false);

//        Circle circle = (Circle) ShapeCache.getShape("1");
//        circle.draw();
//
//        Square square = (Square) ShapeCache.getShape("2");
//        square.draw();
//
//        Rectangle rect = (Rectangle) ShapeCache.getShape("3");
//        rect.draw();


    }

    private static void measure(boolean cache) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Circle circle = createCircle(cache);
        }
        System.out.println((System.currentTimeMillis() - start));
    }

    private static Circle createCircle(boolean cache) {
        if (cache)
            return new Circle();
        else
            return (Circle) ShapeCache.getShape("1");
    }

}
