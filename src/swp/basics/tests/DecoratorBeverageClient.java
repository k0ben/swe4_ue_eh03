package swp.basics.tests;

import swp.basics.decorator.cafe.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;

public class DecoratorBeverageClient {
    public static void main(String[] args) throws FileNotFoundException {
        Beverage beverage = new Tea();
        System.out.println(beverage.getDescription() + beverage.cost());

        beverage = new Espresso();
        beverage = new Milk(beverage);
        beverage = new Milk(beverage);
        beverage = new Sugar(beverage);
        System.out.println(beverage.getDescription() + " " + beverage.cost() + "€");

        Reader reader = new BufferedReader(new FileReader("FILENAME"));
    }
}
