package singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        GameArea gameArea1 = GameArea.getInstance("user1");
        GameArea gameArea2 = GameArea.getInstance("user2");

        System.out.println((gameArea1 == gameArea2) + " = true");
    }
}
