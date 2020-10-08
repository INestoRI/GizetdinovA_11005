//В отсортированном массиве найти элемент с помощью бинарного поиска
import java.util.Scanner;
public class BinarySearch0910 {
    public static int binarySearch(int[] sortedArray, int x, int left, int right) {
        int y = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (sortedArray[mid] < x) {
                left = mid + 1;
            } else if (sortedArray[mid] > x) {
                right = mid - 1;
            } else if (sortedArray[mid] == x) {
                y = mid;
                break;
            }
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int a = in.nextInt();
        int[] mas = new int[a];
        for (int i = 0; i < a; i++) {
            mas[i] = i + 1;
        }
        System.out.println("Array:");
        for (int i = 0; i < a; i++) {
            System.out.print(mas[i] + " ");
        }
        int left = 0;
        int right = mas.length - 1;
        System.out.print("\nWhat number to check? ");
        int b = in.nextInt();
        int res = binarySearch(mas, b, left, right);
        if (res == -1)
            System.out.print(b + " isn't in array");
        else
            System.out.print(b + " is in array");
    }
}
