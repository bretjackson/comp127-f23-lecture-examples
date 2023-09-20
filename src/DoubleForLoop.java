public class DoubleForLoop {
    public static void main(String[] args) {
        
        // Be careful using doubles in a for loop!
        for(double x = 1.0; x <=2.0; x+=0.1){
            // Does this print the "right" answer? NO!
            System.out.println(x);
        }
    
    }
}
