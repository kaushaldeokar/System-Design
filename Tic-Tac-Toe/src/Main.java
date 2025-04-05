public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TieTacToe game = new TieTacToe();
        game.initializeGame();
        System.out.println("game winner is: " + game.startGame());


    }
}