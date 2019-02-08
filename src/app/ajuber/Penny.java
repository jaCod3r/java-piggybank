package app.ajuber;

public class Penny implements Money {

  private double total = 1;
  private double worth = 0.01;
  private double coinsInserted;

  public Penny() {
    total = total*worth;
  }

  public Penny(double coinsInserted) {
    this.coinsInserted = coinsInserted;
    total=worth*coinsInserted;;
  }

  @Override
  public double balance() {
    return this.total;
  }

  @Override
  public String detail() {
    return this.coinsInserted + " Penny";
  }

}
