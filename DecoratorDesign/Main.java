public class Main {

    public static void main(String[] args) {
        Burger burger = new ZingerBurger();
        // System.out.println(burger.getPrice());
        // System.out.println(burger.getDescription());

        Burger extraCheeseBurger = new ExtraCheeseBurger(burger);

        System.out.println(extraCheeseBurger.getDescription());
        System.out.println(extraCheeseBurger.getPrice());

        Burger extraMayoBurger = new ExtraMayoBurger(burger);

        System.out.println(extraMayoBurger.getDescription());
        System.out.println(extraMayoBurger.getPrice());

        Burger extraCheeseMayoBurger = new ExtraMayoBurger(extraCheeseBurger);
        System.out.println(extraCheeseMayoBurger.getDescription());
        System.out.println(extraCheeseMayoBurger.getPrice());

    }

}
