package creational.abstract_factory;

public class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equals("RECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equals("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
}
