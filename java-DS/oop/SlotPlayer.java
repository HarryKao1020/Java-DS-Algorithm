package oop;

public class SlotPlayer extends AbstractGamePlayer{

    private int spinsPlayed;
    private double jackpotWins;

    public SlotPlayer(String userId, double initialBalance) {
        super(userId, initialBalance);
        this.spinsPlayed=0;
        this.jackpotWins=0;
    }

    public void spin(double betAmount) {
        placeBet(betAmount);
        spinsPlayed++;
    }

    public void winJackpot(double amount) {
        super.win(amount);
        jackpotWins++;
    }

}
