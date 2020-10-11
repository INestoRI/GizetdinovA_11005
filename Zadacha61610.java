//Написать метод, который принимает на вход две матрицы и возвращает их сумму
import java.util.Scanner;
public class Zadacha61610 {

    public static int[][] sum(int[][] mas1, int[][] mas2, int x) {
        int[][] mas = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                mas[i][j] = mas1[i][j] + mas2[i][j];
            }
        }
        return mas;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        int s = in.nextInt();
        int[][] m1 = new int[s][s];
        int[][] m2 = new int[s][s];
        System.out.println("First array: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                m1[i][j] = (int)(Math.random() * 100);
                System.out.print(m1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Second array: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                m2[i][j] = (int)(Math.random() * 100);
                System.out.print(m2[i][j] + " ");
            }
            System.out.println("");
        }
        int[][] res = sum(m1, m2, s);
        System.out.println("Result is: ");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
