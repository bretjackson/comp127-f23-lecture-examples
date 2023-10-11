package abstract_classes;

public abstract class CoffeeDrinkStructure {
    //1.in abstract classes we can have empty methods almost like an outline
    //then you can use them in other sub classes and modify as you see fit
    //2.Abstract classes allow you to write a common piece of code that will 
    //defer specific decisions to derived classes, reducing code duplication.
    //3.an abstract class is a partially incomplete class with some incomplete 
    //methods, which the inheriting children must specify their own
    public void makeDrink(){
        flavor();
        dairy();
        espresso();
        combine();
        topping();
    }

    // I can have a constructor to initialize state, but it only can be called from
    // child classes using super()
    public CoffeeDrinkStructure(){
        System.out.println("here!");
    }

    protected abstract void flavor(); //enhancing with flavor (caramel, mocha, vanilla, etc)

    protected abstract void dairy(); //oatmilk, whole milk, soy mily

    protected abstract void espresso(); //how many shots or type

    protected abstract void combine(); //put things together

    protected abstract void topping(); //like whipped cream or caramel drizzle
}
