import java.util.Scanner;
public class Sorting2509 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        System.out.print("Enter a matrix size: ");
        int a = in.nextInt();
        int[][] mas = new int[a][a];
        System.out.println("\nMatrix before sorting: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                mas[i][j] = ((int)(Math.random() * 50));
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
        int n = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                for (int k = j; k < a; k++) {
                    
                }
            }
        }
        System.out.println("\nMatrix after sorting: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
