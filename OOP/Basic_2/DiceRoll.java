package OOP.Basic_2;

class DiceRoll {

  int roll() {
    double random = Math.random() * 6;
    return (int) Math.ceil(random);
  }

  public static void main(String[] args) {
    DiceRoll dr = new DiceRoll();
    for (int i = 0; i < 100; i++) {
      System.out.println(dr.roll());
    }

  }
}
