package app.ajuber;

public class Dime implements Money{

  private double total = 1;
  private double worth = 0.10;
  private double coinsInserted = 1;

  public Dime() {
    total = total*worth;
  }

  public Dime(double coinsInserted) {
    this.coinsInserted = coinsInserted;
    total=worth*coinsInserted;
  }

  @Override
  public double balance() {
    return this.total;
  }

  @Override
  public String detail() {
    return this.coinsInserted + " Dime";
  }


}
