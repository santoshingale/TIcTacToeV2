package com.santosh.tictactoe.model;

public interface GameWinningStrategy {
    boolean checkIfWinning(Board board,Player player, Cell cell);
}
