public abstract class Shape {
    // Colour of this shape
    private String colour;

    // Constructor
    public Shape() {
        this.colour = "red";
    }
    public Shape(String colour) {
        this.colour = colour;
    }

    // Getter and Setter methods
    public String getColour() {
        return this.colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    // Abstract methods
    public abstract double area();
    public abstract double perimeter();
}