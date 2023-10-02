/***
 * Example showing constructor chaining, instance variables, and immutable variable
 */
public class Point2D {
    // Static means this variable is shared by all Point2D objects
    // Final makes it immutable so that it can't be changed after it's set
    public static final double ORIGIN = 0;

    //Instance variables -- define state
    private double x;
    private double y;

    // Constructor
    public Point2D(double x, double y){
        // this refers to the object that this method is operating on.
        this.x = x;
        this.y = y;
    }

    public Point2D(){
        //Constructor chaining. This calls the constructor above.
        this(ORIGIN, ORIGIN);
    }


    public static void main(String[] args) {
        Point2D p1 = new Point2D(2, 3);
        Point2D p2 = new Point2D(4, 5);
        Point2D p3 = new Point2D();
    }
}
