import com.santosh.tictactoe.controller.GameController;
import com.santosh.tictactoe.model.*;
import com.santosh.tictactoe.model.strategy.gamewinningstrategy.GameWinningStrategy;
import com.santosh.tictactoe.model.strategy.gamewinningstrategy.OrderOneGameWinningStrategy;

import java.util.List;

public class GameSimulation {
    private static Symbol symbol;

    public static void main(String[] args) {
        int dimension = 3;
        Player p1 = new HumanPlayer(new Symbol('X'));
        Player p2 = new BotPlayer(new Symbol('O'), BotDifficultyLevel.EASY);
        GameWinningStrategy strategy = new OrderOneGameWinningStrategy();
        GameController gameController = new GameController();

        Game game = gameController.createGame(dimension, List.of(p1, p2), List.of(strategy));

        while (gameController.getStatus(game).equals(GameStatus.IN_PROGRESS)) {
            System.out.println("Please Make the Next Move. This is current Status");
            gameController.display(game);
            gameController.makeMove(game);
        }

        if (gameController.getStatus(game).equals(GameStatus.ENDED)) {
            System.out.println("WINNER WINNER CHICKEN DINNER");
            gameController.display(game);
        }

        if (gameController.getStatus(game).equals(GameStatus.DRAW)) {
            System.out.println("UH OH. Try AGain. No one won");
            gameController.display(game);
        }
    }
}
