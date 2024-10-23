public class ExtraCheeseBurger extends BurgerDecorator {
    private Burger burger;

    public ExtraCheeseBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return burger.getDescription() + " with extra cheese";
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return burger.getPrice() + 30.0;
    }

}
