package object_refs;

public class ObjectRefs {
    public static void main(String[] args) {
        MyObj obj = new MyObj(0);
        System.out.println(obj);
        int y = 2;
        System.out.println(y);

        change(obj, y);

        System.out.println(obj);
        System.out.println(y);
    }

    /*
     * When objects are passed into methods a copy of the reference is made
     * When primitives are passed into methods a copy of the value is made.
     */
    public static void change(MyObj o, int y){
        y = 5;
        System.out.println("Y in change: " + y);
        o.setX(y);
    }
}
