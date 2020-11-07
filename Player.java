public class Player {
    private String name;
    int hp = 50;
    public Player(String name) {
        this.name = name;
    }
    public void printInfo() {
        System.out.println("Name: " + this.name + "\nHp: " + this.hp);
    }
}
