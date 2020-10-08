//Реализовать быструю сортировку
import java.util.Scanner;
public class QuickSort0910 {
    public static void quickSort(int[] mas, int x, int y) {
        if (mas.length == 0)
            return;
        if (x >= y)
            return;
        int mid1 = x + (y - x) / 2;
        int mid2 = mas[mid1];
        int i = x, j = y;
        while (i <= j) {
            while (mas[i] < mid2) {
                i++;
            }
            while (mas[j] > mid2) {
                j--;
            }
            if (i <= j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i++;
                j--;
            }
        }
        if (x < j)
            quickSort(mas, x, j);
        if (y > i)
            quickSort(mas, i, y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter massive size: ");
        int a = in.nextInt();
        int[] mas = new int[a];
        System.out.println("Massive before: ");
        for (int i = 0; i < a; i++) {
            mas[i] = ((int)(Math.random() * 50));
            System.out.print(mas[i] + " ");
        }
        int x = 0;
        int y = mas.length - 1;
        quickSort(mas, x, y);
        System.out.println("\nMassive after: ");
        for (int i = 0; i < a; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}