package swp.basics.decorator.cafe;

public class Tea extends Beverage{
    public Tea(){
        description = "Tea";
    }
    @Override
    public double cost() {
        return 2.99;
    }
}
