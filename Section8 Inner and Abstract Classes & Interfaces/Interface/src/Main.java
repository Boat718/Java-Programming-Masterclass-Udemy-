public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Boat", 9999, 99999);
        System.out.println(player1.write());

        Monster monster = new Monster("Dragon", 1, 2);
        System.out.println(monster.write());
    }
}
