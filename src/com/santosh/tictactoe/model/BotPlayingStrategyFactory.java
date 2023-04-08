package com.santosh.tictactoe.model;

import com.santosh.tictactoe.model.strategy.botplaying.BotPlayingStrategy;
import com.santosh.tictactoe.model.strategy.botplaying.RandomBotMove;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy createBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {

        return switch (botDifficultyLevel){
            case EASY, MEDIUM, HARD -> new RandomBotMove();
        };
//        return null;
    }
}
