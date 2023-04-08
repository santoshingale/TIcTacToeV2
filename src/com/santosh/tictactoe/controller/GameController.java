package com.santosh.tictactoe.controller;

import com.santosh.tictactoe.model.Game;
import com.santosh.tictactoe.model.GameStatus;
import com.santosh.tictactoe.model.Player;
import com.santosh.tictactoe.model.strategy.gamewinningstrategy.GameWinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimension, List<Player> playerList, List<GameWinningStrategy> gameWinningStrategies){
        return Game.create().addDimension(dimension).addPlayers(playerList).addWinningStrategies(gameWinningStrategies).build();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public GameStatus getStatus(Game game){
        return game.getGameStatus();
    }

    public void display(Game game){
        game.getBoard().printBoard();
    }
}
