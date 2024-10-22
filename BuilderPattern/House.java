public class House {
    private String foundation;
    private String structure;

    private boolean hasGarden;
    private boolean hasSwimmingPool;


    private House(HouseBuilder builder){
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.hasGarden = builder.hasGarden;
        this.hasSwimmingPool = builder.hasSwimmingPool;

    }

    @Override
    public String toString(){
        return "House [foundation=" + foundation + 
        ", structure=" + structure + 
        ", hasGarden=" + hasGarden + 
        ", hasSwimmingPool=" + hasSwimmingPool + "]";
    }

    public static class HouseBuilder {

        private String foundation;
        private String structure;
        
        // Optional parameters (set to default values)
        private boolean hasGarden = false;
        private boolean hasSwimmingPool = false;
    
        // Constructor for required parameters
        public HouseBuilder(String foundation, String structure) {
            this.foundation = foundation;
            this.structure = structure;
        }
        
        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }
    
        public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }
    
        public House build(){
            return new House(this);
        }
    
    
    
    
        
    }
    
    


}

