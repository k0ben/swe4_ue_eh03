package swp.basics.decorator.cafe;

public class Sugar extends BeverageDecorator{

    public Sugar(Beverage beverage){
        super(beverage);
    }
    @Override
    public double cost() {
        return beverage.cost() + 0.19;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }
}
