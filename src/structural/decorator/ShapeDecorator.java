package structural.decorator;

public class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape decoratedShape) {
        this.shape = decoratedShape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
