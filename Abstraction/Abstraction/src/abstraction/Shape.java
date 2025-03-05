package abstraction;

public abstract class Shape {
    private double sides;
    private double angle;
    private double perimeter;


    public abstract void Name();

    public void setAngle(double area) {
        this.angle = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public void ShapeDetails(){
        System.out.println("Sides is "+this.sides);
        System.out.println("angle is "+this.angle);
        System.out.println("Perimeter is "+this.perimeter);
    }
}
