package com.santosh.tictactoe.model.strategy;

import com.santosh.tictactoe.model.Board;
import com.santosh.tictactoe.model.Cell;
import com.santosh.tictactoe.model.Player;

public class OrderOneGameWinningStrategy implements GameWinningStrategy {
    @Override
    public boolean checkIfWinning(Board board, Player player, Cell cell) {
        return false;
    }

}
