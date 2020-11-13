import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First player enter your name: ");
        Player p1 = new Player(sc.nextLine());
        System.out.print("Second players enter your name: ");
        Player p2 = new Player(sc.nextLine());
        Game game = new Game (p1, p2);
        game.startGame();
    }
}
