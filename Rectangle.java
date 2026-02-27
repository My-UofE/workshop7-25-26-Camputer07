public class Rectangle extends Shape {
    // Private attributes
    private double width;
    private double height;

    // Constructor
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectangle(double width, double height, String colour) {
        this.setColour(colour);
        this.width = width;
        this.height = height;
    }

    // Getter methods
    public double getWidth() {
        return this.width;
    }
    public double getHeight() {
        return this.height;
    }

    // Abstract implementations
    public double area() {
        return this.width * this.height;
    }
    public double perimeter() {
        return 2 * (this.width + this.height);
    }

    // Utility methods
    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f,height=%.2f,colour=%s,area=%.2f,perimeter=%.2f]",this.width, this.height, this.getColour(), this.area(), this.perimeter());
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            // Set up the tolerance
            double tol = 1e-8;
            // Check if the widths are within a tolerance
            boolean equalWidth = Math.abs(this.width - ((Rectangle)obj).getWidth()) < tol;

            // Check if the heights are within a tolerance
            boolean equalHeight = Math.abs(this.height - ((Rectangle)obj).getHeight()) < tol;

            // Check if the colours are the same
            boolean equalColour = this.getColour().equals(((Rectangle)obj).getColour());

            return equalWidth && equalHeight && equalColour;
        }
        return false;
    }
}