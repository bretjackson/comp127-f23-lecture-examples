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



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Point2D other = (Point2D) obj;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
            return false;
        if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(2, 3);
        Point2D p2 = new Point2D(2, 3);
        Point2D p3 = new Point2D();
        System.out.println(p1 == p2);
    }
}
