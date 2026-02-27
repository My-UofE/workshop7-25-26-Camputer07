public class Triangle extends Shape {
    // Private attributes
    private double a;
    private double b;
    private double c;

    // Constructor
    public Triangle() {
        this.a = 1.0;
        this.b = 1.0;
        this.c = 1.5;
    }
    public Triangle(double a, double b, double c, String colour) {
        this.setColour(colour);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getter methods
    public double getSideA() {
        return this.a;
    }
    public double getSideB() {
        return this.b;
    }
    public double getSideC() {
        return this.c;
    }

    // Abstract implementations
    public double area() {
        // Compute s
        double s = (this.a + this.b + this.c) / 2;

        // Compute the area
        double area = Math.sqrt(s * (s-this.a) * (s-this.b) * (s-this.c));

        return area;
    }
    public double perimeter() {
        return this.a + this.b + this.c;
    }

    // Utility methods
    @Override
    public String toString() {
        return String.format("Triangle[a=%.2f,b=%.2f,c=%.2f,colour=%s,area=%.2f,perimeter=%.2f]", this.a, this.b, this.c, this.getColour(), this.area(), this.perimeter());
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Triangle) {
            // Set up the tolerance
            double tol = 1e-8;
            // Check if both side a are within a tolerance
            boolean equalSideA = Math.abs(this.a - ((Triangle)obj).getSideA()) < tol;

            // Check if both side b are within a tolerance
            boolean equalSideB = Math.abs(this.b - ((Triangle)obj).getSideB()) < tol;

            // Check if both side c are within a tolerance
            boolean equalSideC = Math.abs(this.c - ((Triangle)obj).getSideC()) < tol;

            // Check if the colours are the same
            boolean equalColour = this.getColour().equals(((Triangle)obj).getColour());

            return equalSideA && equalSideB && equalSideC && equalColour;
        }
        return false;
    }
}