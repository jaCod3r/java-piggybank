package app.ajuber;

public class Dollar {


  private double total;
  private double worth = 1.00;

  public double add(double numberOfCoins) {
    double newTotal=worth*numberOfCoins;
    total += newTotal;
    return total;
  }

  public void getTotal() {
    System.out.println("The number of dollar adds up to " + total + " dollars");
  }
}
