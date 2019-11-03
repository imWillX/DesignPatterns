package creational.builder;

public class MealDemo {

    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal vegMeal = builder.buildVegMeal();
        vegMeal.showItems();
        System.out.println("Total Cost:" + vegMeal.getCost());

        System.out.println();

        Meal nonVegMeal = builder.buildNonVegMeal();
        nonVegMeal.showItems();
        System.out.println("Total Cost:" + nonVegMeal.getCost());
    }
}
