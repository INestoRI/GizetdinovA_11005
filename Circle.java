public class Circle extends Shape {
    private double area;

    public Circle(double r) {
        this.area = r * r * Math.PI;
    }

    @Override
    public double getArea() {
        return this.area;
    }
}
