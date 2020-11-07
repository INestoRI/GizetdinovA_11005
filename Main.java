import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st player enter your name: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("2nd player enter your name: ");
        Player player2 = new Player(sc.nextLine());
        player1.printInfo();
        player2.printInfo();
    }
}
