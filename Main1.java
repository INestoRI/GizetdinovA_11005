public class Main1 {
    public static void main(String[] args) {
        Vector2D vec = new Vector2D(3, 5);
        vec.printVector2D();

        vec.setAdd(4, 8);
        vec.printVector2D();

        vec.setSub(5, 9);
        vec.printVector2D();

        vec.setMult(4);
        vec.printVector2D();
    }
}
