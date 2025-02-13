package oop;

public class Game {
    public static void main(String[] args) {
        PokerPlayer pokerPlayer1 = new PokerPlayer("user1",1000);
        pokerPlayer1.startNewHand();
        pokerPlayer1.placeBet(500);
        pokerPlayer1.win(3000);
        System.out.println("poker player win :" + pokerPlayer1.getTotalWin());

        // 創建老虎機玩家
        SlotPlayer slotPlayer = new SlotPlayer("user456", 500);
        slotPlayer.spin(10);
        slotPlayer.winJackpot(1000);  // 中了大獎
        System.out.println("Slot player average win: " + slotPlayer.getTotalWin());
    }
}
