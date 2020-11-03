public class Vector2D {
    private double x;
    private double y;

    public Vector2D (double a, double b) {
        x = a;
        y = b;
    }

    public void printVector2D() {
        System.out.println(this.x + " " + this.y);
    }

    public void setAdd (double a, double b) {
        this.x += a;
        this.y += b;
    }

    public void setSub (double a, double b) {
        this.x -= a;
        this.y -= b;
    }

    public void setMult (double a) {
        this.x *= a;
        this.y *= a;
    }
}