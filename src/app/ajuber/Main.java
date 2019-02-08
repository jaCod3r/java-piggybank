package app.ajuber;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dollar dollar = new Dollar();
        dollar.add(1);
        dollar.getTotal();

        Dime dime = new Dime();
        dime.add(1);
        dime.getTotal();


        Penny penny = new Penny();
        penny.add(1);
        penny.getTotal();

        Quarter quarter = new Quarter();
        quarter.add(1);
        quarter.getTotal();

        Nickle nickle = new Nickle();
        nickle.add(1);
        nickle.getTotal();

    }
}
