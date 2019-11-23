package structural.decorator;

public class RedShapeDecorator implements Shape {

    protected Shape shape;

    public RedShapeDecorator(Shape decoratedShape) {
        this.shape = decoratedShape;
    }

    @Override
    public void draw() {
        shape.draw();
        setColorRed();
    }

    private void setColorRed() {
        System.out.println("Color: Red");
    }
}
