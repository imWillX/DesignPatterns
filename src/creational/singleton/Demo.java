package creational.singleton;

public class Demo {
    public static void main(String[] args) {
        String message = ConfigData.getInstance().getMessage();
        System.out.println(message);
    }
}
