package interfaces;

import java.util.List;

public class BarnYard {
    public static void main(String[] args) {
        Animal donald = new Duck();
        // This will give a runtime error if donald is not a duck since we are
        // assuming geese don't swim.
        ((Duck)donald).swim();
        donald.makeNoise();

        //Polymorphism in action. Donald can by any animal!
        donald = new Goose();
        donald.makeNoise();

        List<Animal> myList = List.of(new Duck(), new Duck(), new Goose());
    }
}
