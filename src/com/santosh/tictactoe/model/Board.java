package com.santosh.tictactoe.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
    private int dimension;

    public Board(int dimension) {
        board = new ArrayList<>();
        for(int i = 0; i < dimension; i++){
            board.add(new ArrayList<>());
            for(int j =0; j < dimension; j++){
                board.get(i).add(new Cell());
            }
        }
    }

    public Cell getCell(int row, int col) {
        return board.get(row).get(col);
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
