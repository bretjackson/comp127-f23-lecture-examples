/***
 * Example showing inheritance.
 */
public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z){
        // Constructor chaining
        //super() refers to the parent class' constructor
        // Must be first call inside constructor
        // You have to call super in this context because x and y are private in point2d
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString(){
        return super.toString()+", "+z;
    }
    
}
