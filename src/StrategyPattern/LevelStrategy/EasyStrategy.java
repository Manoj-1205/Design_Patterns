package StrategyPattern.LevelStrategy;

public class EasyStrategy implements LevelStrategy{
    @Override
    public void startGame() {
        System.out.println("Easy Game");
    }
}
