package StrategyPattern;

import StrategyPattern.LevelStrategy.LevelStrategy;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Context {
    LevelStrategy level;
    public void startGame(){
        level.startGame();
    }

}
