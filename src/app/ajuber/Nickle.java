package app.ajuber;

public class Nickle {

  private double total;
  private double worth = 0.05;

  public double add(double numberOfCoins) {
    double newTotal=worth*numberOfCoins;
    total += newTotal;
    return total;
  }

  public void getTotal() {
    System.out.println("The number of nickle adds up to " + total + " cents!");
  }

}
