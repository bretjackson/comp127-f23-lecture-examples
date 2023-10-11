package abstract_classes;

public class IcedCaramelLatte extends CoffeeDrinkStructure {

    @Override
    protected void flavor(){
        System.out.println("insert 3 pumps of caramel syrup");
    }

    protected void dairy(){
        System.out.println("Please add some dairy of your choice such as milk, oat milk, or soy");
    }

    protected void espresso(){
        System.out.println("brew two espresso shots for the drink");
    }

    protected void combine(){
        System.out.println("combine elements together and mix the latte");
    }
    protected void topping(){
        System.out.println("finally add whipped on top");
    }
}
