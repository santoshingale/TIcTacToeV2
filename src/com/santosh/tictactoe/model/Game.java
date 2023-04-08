package com.santosh.tictactoe.model;

import java.util.List;

public class Game {
    private List<Player> player;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> winningStrategies;
    private GameStatus gameStatus;
    private Player winner;

}
