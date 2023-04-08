package com.santosh.tictactoe.model.strategy.botplaying;

import com.santosh.tictactoe.model.Board;
import com.santosh.tictactoe.model.Cell;
import com.santosh.tictactoe.model.Move;
import com.santosh.tictactoe.model.Player;

import java.util.List;

public class RandomBotMove implements BotPlayingStrategy{
    @Override
    public Move makeNextMove(Board board, Player player) {
        for(List<Cell> row: board.getBoard()){
            for(Cell cell : row){
                if(cell.isEmpty()){
                    Move move = new Move();
                    move.setPlayer(player);
                    move.setSymbol(player.getSymbol());
                    move.setCell(cell);
                    return move;
                }
            }
        }
        return null;
    }
}
