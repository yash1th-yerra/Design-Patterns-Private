public class ExtraMayoBurger extends BurgerDecorator {
    private Burger burger;

    public ExtraMayoBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return burger.getDescription() + " with extra Mayonisse";
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return burger.getPrice() + 50.0;
    }

}
