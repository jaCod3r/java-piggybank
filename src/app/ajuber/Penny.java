package app.ajuber;

public class Penny {

  private double total;
  private double worth = 0.01;

  public double add(double numberOfCoins) {
    double newTotal=worth*numberOfCoins;
    total += newTotal;
    return total;
  }

  public void getTotal() {
    System.out.println("The number of pennies adds up to " + total + " cents!");
  }

}
