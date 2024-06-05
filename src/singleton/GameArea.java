package singleton;

public final class GameArea {

    private static GameArea gameArea;
    public String username;

    private GameArea(String username) {
        this.username = username;
    }

    public static GameArea getInstance(String username) {
        if (gameArea == null) {
            gameArea = new GameArea(username);
        }
        return gameArea;
    }
}
