public class Vector2D {
    private double x;
    private double y;

    public void printVector2D() { System.out.println(this.x + " " + this.y); }

    //Task 1
    public Vector2D (double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Task 2
    public void setAdd (double x, double y) {
        this.x += x;
        this.y += y;
    }

    //Task 3
    public void setSub (double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    //Task 4
    public void setMult (double a) {
        this.x *= a;
        this.y *= a;
    }
}