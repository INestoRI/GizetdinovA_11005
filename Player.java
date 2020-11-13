public class Player {
    private int hp = 10;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public void del(int someNumber) {
        this.hp -= someNumber;
    }
}
