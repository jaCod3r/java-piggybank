package app.ajuber;

public class Quarter implements Money {

  private double total = 1;
  private double worth = 0.25;
  private double coinsInserted = 1;

  public Quarter() {
    total = total*worth;
  }

  public Quarter(double coinsInserted) {
    this.coinsInserted = coinsInserted;
    total=worth*coinsInserted;
  }

  @Override
  public double balance() {
    return this.total;
  }

  @Override
  public String detail() {
    return this.coinsInserted + " Quarter";
  }
}
