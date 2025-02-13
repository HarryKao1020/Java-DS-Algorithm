package oop;

public interface GamePlayer {

    int MAX_BALANCE = 1_000_000;
    int MIN_BALANCE = 0;
    int MIN_BET =0;

    void placeBet(double amount);

    void win(double amount);

    void lose(double amount);
}
