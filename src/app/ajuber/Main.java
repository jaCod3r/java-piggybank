package app.ajuber;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Money> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickle(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        double total = 0;
        for (Money money : piggyBank)
        {
            total += money.balance();
            System.out.println(money.detail());
        }

        System.out.println("The piggy bank holds " + total);

    }
}
