package StrategyPattern;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ChessGame {
    private Level level;
    //Violates SRP and OCP
    public void startGame(){
        if(this.level == Level.EASY){
            System.out.println("Easy Game");
        }
        else if(level == Level.MEDIUM){
            System.out.println("Medium Level");
        }
        else{
            System.out.println("HARD GAME");
        }
    }
}
