public class Circle implements Prototype {


    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public Prototype clone() {
        return new Circle(this);
    }
    
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    
}
