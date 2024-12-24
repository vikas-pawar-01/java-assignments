public class Encapsulation {
    public static void main(String[] args) {
//        Player player = new Player();
//        System.out.println(player.getHealth());

//        player = new Player(200);
//        System.out.println(player.getHealth());

        Player player = Player.getetPlayerer();
        System.out.println(player.getHealth());

        player.setHealth(200);
        System.out.println(player.getHealth());

        Player player1 = Player.getetPlayerer();
        System.out.println(player1.getHealth());

    }
}


