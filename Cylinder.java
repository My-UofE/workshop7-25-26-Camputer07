/*
 * A Cylinder is a Circle plus a height.
 */
public class Cylinder extends Circle{
    // Private instance attribute height
    private double height;
    
    // Constructors
    public Cylinder() {
        this(1.0, 1.0, "red");
    }
    public Cylinder(double height) {
        this(height, 1.0, "red");
    }
    public Cylinder(double height, double radius) {
        this(height, radius, "red");
    }
    public Cylinder(double height, double radius, String colour) {
        super(radius, colour);
        this.height = height;
    }
    
    // Getter and setter methods for the height field
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    // Calculates the volume of this cylinder
    public double getVolume() {
        // Calculate the cross sectional area of the cylinder
        double crossSectionalArea = super.getArea();

        // Calculate and return the volume of the cylinder
        return crossSectionalArea * this.height;
    }

    // Task 5. Override toString() method to describe itself
    // (output format should be in line with format: Cylinder[Circle[...],height=X.XX]
    @Override
    public String toString() {
        return String.format("Cylinder[%s,height=%f]", super.toString(), this.height);
    }

    // Calculate the surface area of the cylinder
    @Override
    public double getArea() {
        // Calculate the cross sectional area of the cylinder
        double crossSectionalArea = super.getArea();

        // Calculate the circumference of the cylinder
        double circumference = 2 * Math.PI * this.getRadius();

        // Calculate and return the surface area
        return (2 * crossSectionalArea) + (circumference * this.height);
    }

    // Calculates the cross sectional area of the cylinder
    public double getBaseArea() {
        return super.getArea();
    }

    // Instance method
    public void printClassInfo() {
        System.out.println("It is a Cylinder class");
    }

    // Static method
    public static void printClassInfoStatic() {
        System.out.println("It is a Cylinder class");
    }
 }