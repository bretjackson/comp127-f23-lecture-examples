package abstract_classes;

public class CaramelMachiatto extends CoffeeDrinkStructure {
    //I do not need this below because it is being inherited from the superclass
    
    // public void makeDrink(){
    //     flavor();
    //     dairy();
    //     espresso();
    //     combine();
    //     topping();
    // }

    public CaramelMachiatto(){
        super();
    }

    @Override
    protected void flavor(){
        System.out.println("insert 3 pumps of vanilla syrup");
    }

    protected void dairy(){
        System.out.println("please add some dairy of your choice such as milk, oat milk, or soy");
    }

    protected void espresso(){
        System.out.println("brew two espresso shots for the drink");
    }

    protected void combine(){
        System.out.println("combine elements together but NEVER mix the machiatto");
    }

    protected void topping(){
        System.out.println("finally add caramel drizzle on top");
    }
}