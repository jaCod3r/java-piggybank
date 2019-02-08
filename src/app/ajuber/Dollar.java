package app.ajuber;

public class Dollar implements Money {


  private double total = 1;
  private double worth = 1.00;
  private double coinsInserted;

  public Dollar() {
    total = total*worth;
  }

  public Dollar(double coinsInserted) {
    total=worth*coinsInserted;
  }

  @Override
  public double balance() {
    return this.total;
  }

  @Override
  public String detail() {
    return "$" + this.total;
  }
}
