package app.ajuber;

public class Quarter {

  private double total;
  private double worth = 0.25;

  public double add(double numberOfCoins) {
    double newTotal=worth*numberOfCoins;
    total += newTotal;
    return total;
  }

  public void getTotal() {
    System.out.println("The number of quarters adds up to " + total + " cents!");
  }
}
