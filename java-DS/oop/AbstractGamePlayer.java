package oop;

abstract class AbstractGamePlayer implements GamePlayer{
    private String userId;
    private double balance; // 玩家餘額
    private double totalBet; // 總投注額
    private double totalWin;   // 總贏取額
    protected boolean isPlaying; // 是否在遊戲中

    // 建構子
    public AbstractGamePlayer(String userId, double initialBalance){
        this.userId=userId;
        this.balance = initialBalance;
        this.totalBet = 0;
        this.totalWin = 0;
        this.isPlaying = false;
    }

    public double getBalance(){
        return balance;
    }

    protected void updateBalance(double amount){
        double newBalance = this.balance + amount;
        if (newBalance >= MIN_BALANCE && newBalance<= MAX_BALANCE){
            this.balance = newBalance;
        }else{
            throw new IllegalArgumentException("Balance would exceed limits");
        }
    }
    public double getTotalBet(){
        return totalBet;
    }

    public double getTotalWin(){
        return totalWin;
    }

    // 實作interface
    @Override
    public void placeBet(double amount){
        if(amount < MIN_BET){
            throw new IllegalArgumentException("Bet amount below minimum");
        }
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient balance");
        }
        updateBalance(-amount);
        totalBet += amount;
        isPlaying = true;
    }

    @Override
    public void win(double amount){
        updateBalance(amount);
        totalWin += amount;
        isPlaying=false;
    }

    @Override
    public void lose(double amount){
        isPlaying=false;
    }
}
