package com.santosh.tictactoe.model;

import com.santosh.tictactoe.model.strategy.gamewinningstrategy.GameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> player;
    private Board board;
    private List<Move> moves;
    private List<GameWinningStrategy> winningStrategies;
    private GameStatus gameStatus;
    private int lastMovedPlayerIndex;
    private Player winner;

    private Game() {
        this.player = new ArrayList<>();
        this.moves = new ArrayList<>();
        this.winningStrategies = new ArrayList<>();
        this.lastMovedPlayerIndex = -1;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public static Builder create() {
        return new Builder();
    }

    public void makeMove() {
        this.lastMovedPlayerIndex += 1;
        this.lastMovedPlayerIndex %= this.player.size();
        Move move = this.player.get(this.lastMovedPlayerIndex).makeMove(this.board);
        this.moves.add(move);
        move.getCell().setSymbol(move.getSymbol());


    }

    public List<Player> getPlayer() {
        return player;
    }

    public Board getBoard() {
        return board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public List<GameWinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    private static class Builder {
        private List<Player> player;
        private int dimension;
        private List<GameWinningStrategy> winningStrategies;

        public Builder() {
            player = new ArrayList<>();
            winningStrategies = new ArrayList<>();
        }

        public Builder addPlayer(Player player) {
            this.player.add(player);
            return this;
        }

        public Builder addPlayers(List<Player> players) {
            this.player.addAll(player);
            return this;
        }

        public Builder addWinningStrategy(GameWinningStrategy gameWinningStrategy) {
            winningStrategies.add(gameWinningStrategy);
            return this;
        }

        public Builder addDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Game build() {
            Game game = new Game();
            game.board = new Board(dimension);
            game.winningStrategies.addAll(this.winningStrategies);
            game.player.addAll(this.player);
            return game;
        }
    }
}
