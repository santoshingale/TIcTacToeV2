package com.santosh.tictactoe.model.strategy.botplaying;

import com.santosh.tictactoe.model.Board;
import com.santosh.tictactoe.model.Move;
import com.santosh.tictactoe.model.Player;

public interface BotPlayingStrategy {
    Move makeNextMove(Board board, Player player);
}
