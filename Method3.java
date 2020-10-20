//Рекурсивно вычислить число Фибоначчи с номером N.
import java.util.Scanner;
public class Method3 {

    public static int fib(int n) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        return fib((n - 1)) + fib((n - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index of number: ");
        int a = sc.nextInt();
        System.out.print("Number with index " + a + " equals: " + fib(a));
    }
}
