//Написать метод, который принимает на вход матрицу и транспонирует её
import java.util.Arrays;
import java.util.Scanner;
public class Zadacha51610 {

    public static int[][] transpose(int[][] mas, int x, int y) {
        int[][] res = new int[y][x];
        for (int i = 0; i < y; i++){
            for (int j = 0; j < x; j++){
                res [i][j] = mas[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = in.nextInt();
        System.out.print("Enter y: ");
        int y = in.nextInt();
        int[][] mas = new int[x][y];
        System.out.println("Array: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mas[i][j] = (int)(Math.random() * 100);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] res = transpose(mas, x, y);
        System.out.println("Result: ");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
