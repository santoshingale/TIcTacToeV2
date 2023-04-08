package com.santosh.tictactoe.model;

import java.util.Scanner;

public class HumanPlayer extends Player{

    public HumanPlayer(Symbol symbol) {
        super(symbol, PlayerType.HUMAN);
    }

    @Override
    public Move makeMove(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER ROW Number");
        int row = scanner.nextInt();
        System.out.println("ENTER COLUMN Number");
        int col = scanner.nextInt();

        Move move = new Move();
        move.setCell(board.getCell(row - 1, col - 1));
        move.setPlayer(this);
        move.setSymbol(this.getSymbol());
        return move;
    }
}
