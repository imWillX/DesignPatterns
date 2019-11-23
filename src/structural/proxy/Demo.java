package structural.proxy;

public class Demo {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("test_10mb.jpg");

        // Image is loaded from disk
        image.display();

        System.out.println();

        // Image is not loaded from disk
        image.display();
    }
}
