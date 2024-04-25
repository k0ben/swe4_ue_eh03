package swp.basics.decorator.cafe;

public class Espresso extends Beverage{ //konkrete Komponente

    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
