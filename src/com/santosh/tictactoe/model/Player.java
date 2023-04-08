package com.santosh.tictactoe.model;

public abstract class Player {
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(Symbol symbol, PlayerType playerType) {
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public abstract Move makeMove(Board board);
}
