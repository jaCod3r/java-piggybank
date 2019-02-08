package app.ajuber;

public class Nickle implements Money{

  private double total;
  private double worth = 0.05;
  private double coinsInserted;

  public Nickle() {
    total = 1;
    total = total*worth;
  }

  public Nickle(double coinsInserted) {
    this.coinsInserted = coinsInserted;
    total=worth*coinsInserted;

  }

  @Override
  public double balance() {
    return this.total;
  }

  @Override
  public String detail() {
    return this.coinsInserted + " Nickle";
  }

}
