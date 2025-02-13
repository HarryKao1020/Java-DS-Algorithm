package oop;

public class PokerPlayer extends AbstractGamePlayer{

    private int handsPlayed; // 已玩局數
    private int handsWon; // 贏取局數

    public PokerPlayer(String userId, double initialBalance) {
        super(userId, initialBalance);
        this.handsPlayed=0;
        this.handsWon=0;
    }

    public void startNewHand(){
        if(isPlaying){
            throw new IllegalStateException("Already in a game");
        }
        handsPlayed++;
    }

//    @Override
//    public void win(double amount){
//        super.win(amount);
//        handsWon++;
//    }


}
