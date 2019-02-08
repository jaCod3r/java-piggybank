package app.ajuber;

public class Dime {

  private double total;
  private double worth = 0.10;

  public double add(double numberOfCoins) {
    double newTotal=worth*numberOfCoins;
    total += newTotal;
    return total;
  }

  public void getTotal() {
    System.out.println("The number of dimes adds up to " + total + " cents!");
  }
}
