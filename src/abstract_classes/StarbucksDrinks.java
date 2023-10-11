package abstract_classes;

public class StarbucksDrinks {

    //will produce ERROR!
    // public abstract void baristaName();

    public static void main(String[] args) {
        //creating a new instance of the CaramelMachiatto object 
        //the myDrink ref variable points to it
        CaramelMachiatto myDrink = new CaramelMachiatto();
        //method invocation of makeDrink which calls the rest of the
        //coffee creation methods
        myDrink.makeDrink();

        System.out.println("-----------------------------------------");
        
        //same thing applies here from above, only difference
        //is the onject and class
        // IcedCaramelLatte anotherDrink = new IcedCaramelLatte();
        // anotherDrink.makeDrink();

        //CANNOT INSTANTIATE ABSTRACT CLASSES, CREATE OBJECTS OF IT
        //CoffeeDrinkStructure coffee = new CoffeeDrinkStructure(); // ERROR
    }
}