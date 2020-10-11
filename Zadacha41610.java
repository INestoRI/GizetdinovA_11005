//Написать метод, который принимает два массива и “склеивает” их
import java.util.Scanner;
public class Zadacha41610 {

    public static int[] unity(int[] mas1, int[] mas2) {
        int[] mas = new int[mas1.length + mas2.length];
        for (int i = 0; i < mas1.length; i++) {
            mas[i] = mas1[i];
        }
        for (int i = 0; i < mas2.length; i++) {
            mas[i + mas1.length] = mas2[i];
        }
        return mas;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first array size: ");
        int a = in.nextInt();
        System.out.print("Enter second array size: ");
        int b = in.nextInt();
        int[] mas1 = new int[a];
        System.out.print("First array: ");
        for (int i = 0; i < a; i++) {
            mas1[i] = ((int)(Math.random() * 100));
            System.out.print(mas1[i] + " ");
        }
        int[] mas2 = new int[b];
        System.out.print("\nSecond array: ");
        for (int i = 0; i < b; i++) {
            mas2[i] = ((int)(Math.random() * 100));
            System.out.print(mas2[i] + " ");
        }
        System.out.print("\nNew array: ");
        int[] mas3 = unity(mas1, mas2);
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
        }
    }
}
