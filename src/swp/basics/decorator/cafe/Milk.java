package swp.basics.decorator.cafe;

public class Milk extends BeverageDecorator{ //konkreter Dekorator

    public Milk(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.49;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
