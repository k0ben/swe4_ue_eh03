package swp.basics.decorator.cafe;

public abstract class Beverage {

    String description = "Unknown Beverage"; //komponenten interface

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
