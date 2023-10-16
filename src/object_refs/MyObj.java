package object_refs;

public class MyObj {
    private int x;

    public MyObj(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "MyObj [x=" + x + "]";
    }
}
