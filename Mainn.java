public class Mainn {
    public static void main(String[] args) {
        Shape[] shape = new Shape[5];
        shape[0] = new Rectangle(5, 6);
        shape[1] = new Circle(5);
        shape[2] = new Triangle(6.5, 3);
        shape[3] = new Circle(2);
        shape[4] = new Triangle(1, 9);
        for (int i = 0; i < 5; i++) {
            System.out.println(shape[i].getArea());
        }
    }
}
