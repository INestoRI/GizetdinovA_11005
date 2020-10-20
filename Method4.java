//Функция Аккермана
import java.util.Scanner;
public class Method4 {

    public static int func(int m, int n) {
        if (m == 0)
            return n + 1;
        if ((n == 0) && (m > 0))
            return func((m - 1), (1));
        return func((m - 1), func(m, (n - 1)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Result: " + func(a, b));
    }
}
