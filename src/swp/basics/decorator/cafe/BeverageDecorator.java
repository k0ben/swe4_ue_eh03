package swp.basics.decorator.cafe;

public abstract class BeverageDecorator extends Beverage{

    Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public abstract String getDescription();
}
