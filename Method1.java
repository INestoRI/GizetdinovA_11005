//Рекурсивно посчитать произведение чисел от 1 до N
import java.util.Scanner;
public class Method1 {

    public static int mult(int n) {
        if (n == 1)
            return 1;
        return n * mult(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int i = sc.nextInt();
        System.out.print("Multiplication: " + mult(i));
    }
}
