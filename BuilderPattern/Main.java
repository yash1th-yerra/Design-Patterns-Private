public class Main {
    public static void main(String[] args) {
        // Build a house with a garden but no swimming pool
        House house1 = new House.HouseBuilder("Concrete", "Wood")
                              .setGarden(true)
                              .build();
        System.out.println(house1);

        // Build a house with a garden and a swimming pool
        House house2 = new House.HouseBuilder("Steel", "Brick")
                              .setGarden(true)
                              .setSwimmingPool(true)
                              .build();
        System.out.println(house2);
    }
}
