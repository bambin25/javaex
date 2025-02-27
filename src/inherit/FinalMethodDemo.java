package inherit;

public class FinalMethodDemo {
  public static void main(String[] args) {
    WorldChess wc = new WorldChess();
    System.out.println(wc.getFirstPlayer());
  }
}

class Chess {
  enum ChessPlayer { WHITE, BLACK }

  final ChessPlayer getFirstPlayer() {
    return ChessPlayer.WHITE;
  }
}

class WorldChess extends Chess {
//  @Override
//  ChessPlayer getFirstPlayer() {
//    return super.getFirstPlayer();
//  }
}
