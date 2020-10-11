//Проверить, есть ли в квадратной матрице n/2 чётных чисел, расположенных по диагонали, где n - размер матрицы
import java.util.Scanner;
public class EvenNumbers0910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = in.nextInt();
        int[][] mas = new int[n][n];
        System.out.println("Array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mas[i][j] = (int)(Math.random()*100);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (mas[i][i] % 2 == 0)
                s = s + 1;
            if (mas[i][n-1-i] % 2 == 0)
                s = s + 1;
        }
        if ((mas[n / 2][n / 2] % 2 == 0) && (n % 2 == 1))
            s = s - 1;
        if (s >= n / 2)
            System.out.print("Even numbers: " + s + " it's more or equally than " + (n / 2));
        else
            System.out.print("Even numbers: " + s + " it's less than " + (n / 2));
    }
}
