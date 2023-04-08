package com.santosh.tictactoe.model.strategy.gamewinningstrategy;

import com.santosh.tictactoe.model.Board;
import com.santosh.tictactoe.model.Cell;
import com.santosh.tictactoe.model.Player;

public interface GameWinningStrategy {
    boolean checkIfWinning(Board board, Player player, Cell cell);
}
