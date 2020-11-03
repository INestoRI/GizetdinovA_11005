public class Vector2D {
    private double x;
    private double y;

    public Vector2D (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printVector2D() {
        System.out.println(this.x + " " + this.y);
    }

    public void setAdd (double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void setSub (double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    public void setMult (double a) {
        this.x *= a;
        this.y *= a;
    }
}