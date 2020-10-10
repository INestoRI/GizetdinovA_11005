//Дана строка из нескольких слов, разделённых пробелами. Отсортировать слова в ней по алфавиту
import java.util.Scanner;
public class StringSorting0910 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = in.nextLine() + " ";
        String a = " ";
        String s = "";
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a.charAt(0)) {
                k++;
            }
        }
        String[] mas = new String[k];
        int l = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a.charAt(0)) {
                mas[l] = s;
                l++;
                s = "";
            } else {
                s = s + str.charAt(i);
            }
        }
        String z = " ";
        int d;
        for (int i = 0; i < k; i++) {
            for (int j = i; j < k; j++) {
                if (mas[i].length() > mas[j].length()) {
                    d = mas[j].length();
                } else {
                    d = mas[i].length();
                }
                for (int r = 0; r < d; r++) {
                    if (mas[i].charAt(r) > mas[j].charAt(r)) {
                        z = mas[i];
                        mas[i] = mas[j];
                        mas[j] = z;
                        break;
                    } else if (mas[i].charAt(r) < mas[j].charAt(r)) {
                        break;
                    } else if (mas[i].length() > mas[j].length()) {
                        z = mas[i];
                        mas[i] = mas[j];
                        mas[j] = z;
                    }

                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}
