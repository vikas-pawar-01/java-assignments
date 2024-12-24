public class Player {
    private int health;
    private static Player playerInstance;

    public static Player getetPlayerer() {
        if(playerInstance instanceof Player) {
            return playerInstance;
        }
        playerInstance = new Player();
        return playerInstance;
    }

    private Player() {
        this(100);
    }

    private Player(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
