// Написать метод, который считает количество разрядов числа
import java.util.Scanner;
public class Zadacha11610 {
    public static int r(int i) {
        int j = 0;
        while (i > 0) {
            i = i / 10;
            j++;
        }
        return j;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.print("Количество разрдов числа: " + r(a));
    }
}
