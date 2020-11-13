import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    int impact;
    private int x = 1;
    private Player p1;
    private Player p2;

    public Game (Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static int rnd() {
        int max = 10;
        max -= 1;
        return (int) (Math.random() * ++max) + 1;
    }
    public void startGame() {
        System.out.println(p1.getName() + " your HP is 10\n" + p2.getName() + " your HP is 10");
        System.out.println("--------------- 1 Round ---------------");
        while (true) {
            System.out.print("- " + p1.getName() + " enter the impact force (1 to 9): ");
            impact = sc.nextInt();
            if (rnd() > impact) {
                p2.del(impact);
                System.out.println(p1.getName() + " great shot!");
            }
            else
                System.out.println(p1.getName() + " you missed :(");
            System.out.print(p2.getName() + " your HP is " + p2.getHp() + "\n");
            if (p2.getHp() <= 0) {
                System.out.print(p1.getName() + " you WON!");
                break;
            }
            System.out.print("- " + p2.getName() + " enter the impact force (1 to 9): ");
            impact = sc.nextInt();
            if (rnd() > impact) {
                p1.del(impact);
                System.out.println(p2.getName() + " great shot!");
            }
            else
                System.out.println(p2.getName() + " you missed :(");
            System.out.print(p1.getName() + " your HP is " + p1.getHp() + "\n");
            if (p1.getHp() <= 0) {
                System.out.println(p2.getName() + " you WON!");
                break;
            }
            this.x++;
            System.out.println("--------------- " + this.x + " Round ---------------");
        }
    }
}
