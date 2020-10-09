//Написать метод, который находит максимальное значение массива
import java.util.Scanner;
public class Zadacha31610 {

    public static int max(int[] mas) {
        int m = mas[0];
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] > m)
                m = mas[i];
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = in.nextInt();
        int[] mas = new int[a];
        System.out.print("Array: ");
        for (int i = 0; i < a; i++) {
            mas[i] = ((int)(Math.random() * 100));
            System.out.print(mas[i] + " ");
        }
        System.out.print("\nMax element: " + max(mas));
    }
}