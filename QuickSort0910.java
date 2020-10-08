//Реализовать быструю сортировку
import java.util.Scanner;
public class QuickSort0910 {
    public static void quickSort(int[] mas, int left, int right) {
        if (mas.length == 0)
            return;
        if (left >= right)
            return;
        int mid1 = left + (right - left) / 2;
        int mid2 = mas[mid1];
        int i = left, j = right;
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
        if (left < j)
            quickSort(mas, left, j);
        if (right > i)
            quickSort(mas, i, right);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter massive size: ");
        int a = in.nextInt();
        int[] mas = new int[a];
        System.out.println("Array before: ");
        for (int i = 0; i < a; i++) {
            mas[i] = ((int)(Math.random() * 50));
            System.out.print(mas[i] + " ");
        }
        int left = 0;
        int right = mas.length - 1;
        quickSort(mas, left, right);
        System.out.println("\nArray after: ");
        for (int i = 0; i < a; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}