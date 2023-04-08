package com.santosh.tictactoe.model;

import com.santosh.tictactoe.model.strategy.botplaying.BotPlayingStrategy;

import java.util.List;
import java.util.Scanner;

public class BotPlayer extends Player{

    private BotPlayingStrategy botPlayingStartegy;
    private BotDifficultyLevel botDifficultyLevel;
    public BotPlayer(Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStartegy = BotPlayingStrategyFactory
                .createBotPlayingStrategyForDifficultyLevel(botDifficultyLevel);

    }

    @Override
    public Move makeMove(Board board) {
        return botPlayingStartegy.makeNextMove(board, this);
    }
}
