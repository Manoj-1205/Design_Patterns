package StrategyPattern.LevelStrategy;

public class MediumStrategy implements LevelStrategy{
    @Override
    public void startGame() {
        System.out.println("Medium Strategy");
    }
}
