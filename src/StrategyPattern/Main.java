package StrategyPattern;

import StrategyPattern.LevelStrategy.EasyStrategy;
import StrategyPattern.LevelStrategy.MediumStrategy;

public class Main {
    public static void main(String[] args) {
        Context context=new Context(new MediumStrategy());
        context.startGame();
    }
}
