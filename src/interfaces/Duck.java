package interfaces;

public class Duck implements Animal, Flyable {
    private int age;

    public Duck(){
        this(0);
    }

    public Duck(int age){
        this.age = age;
    }

    public void fly(){
        //..
    }

    public void makeNoise(){
        System.out.println("Quack");
    }

    public void eat(){
        //..
    }

    public void swim(){

    }
}
