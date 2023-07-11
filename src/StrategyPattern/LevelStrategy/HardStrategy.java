package StrategyPattern.LevelStrategy;

public class HardStrategy implements LevelStrategy{

    @Override
    public void startGame() {
        System.out.println("Hard Game");
    }
}
