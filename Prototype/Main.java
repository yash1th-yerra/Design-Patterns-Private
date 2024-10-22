public class Main {
    public static void main(String[] args){
        Circle originalCircle = new Circle(10);
        System.out.println("Original Circle: " + originalCircle);

        // Clone the Circle
        Circle clonedCircle = (Circle) originalCircle.clone();
        System.out.println("Cloned Circle: " + clonedCircle);

        // Modify the cloned Circle
        clonedCircle.setRadius(20);
        System.out.println("Modified Cloned Circle: " + clonedCircle);

        // The original Circle remains unchanged
        System.out.println("Original Circle after cloning: " + originalCircle);

        // Create an original Rectangle object
        Rectangle originalRectangle = new Rectangle(5, 10);
        System.out.println("Original Rectangle: " + originalRectangle);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
    
}
