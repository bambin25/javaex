package inherit;

public class FinalDemo {
  public static void main(String[] args) {
    Best best = new Best();
  }
}

class Good {
  String good;
}

class Better extends Good {
  String better;
}

final class Best extends Better {
  String best;
}

//class Another extends Best {}
