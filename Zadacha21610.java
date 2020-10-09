//Написать метод, который выводит строку в обратном порядке
import java.util.Scanner;
public class Zadacha21610 {

    public static String ss(String str) {
        String str1 = "";
        for (int i = str.length() -1; i > -1; i--) {
            str1 = str1 + str.charAt(i);
        }
        return str1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine();
        System.out.print("Str: " + ss(str));
    }
}
