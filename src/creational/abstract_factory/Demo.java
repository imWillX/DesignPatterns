package creational.abstract_factory;

public class Demo {

    public static void main(String[] args) {
        AbstractFactory roundedFactory = FactoryProducer.getFactory(true);
        roundedFactory.getShape("RECTANGLE").draw();
        roundedFactory.getShape("SQUARE").draw();
        AbstractFactory factory = FactoryProducer.getFactory(false);
        factory.getShape("RECTANGLE").draw();
        factory.getShape("SQUARE").draw();
        /**
         * Output:
         * Inside RoundedRectangle
         * Inside RoundedSquare
         * Inside Rectangle
         * Inside Square
         */
    }
}
