//Рекурсивно вывести целые числа от A до B (A < B)
import java.util.Scanner;
public class Method2 {

    public static void method(int a, int b) {
        if (a > b)
            return;
        method(a, b - 1);
        System.out.print(b + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        method(a, b);
    }
}
