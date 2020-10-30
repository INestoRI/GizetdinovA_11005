public class Vector2D {
    private double x;
    private double y;
    private double S;
    private double Add;
    private double Sub;
    private double Mult;
    double a = 3;
    double b = 2;
    double c = 4;

    public void vector2D (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void vLen(double x, double y) {
        if (x > 0 && y > 0) {
            this.S = Math.sqrt(x * x + y * y);
            this.Add = Math.sqrt((x + a) * (x + a) + (y + b) * (y + b));
            this.Sub = Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
            this.Mult = Math.sqrt((x * c) * (x * c) + (y * c) * (y * c));
        }
    }

    public void add(double x, double y) {
        this.Add = Math.sqrt((x + a) * (x + a) + (y + b) * (y + b));
    }
    public double getAll () {
        return this.Add;
        return this.Sub;
        return this.Mult;
    }
}