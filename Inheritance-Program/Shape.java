class Shape{
    public double getArea() {
        System.out.println(" The  Shape");
        return 0.0;
    }
}
 class Rectangle extends Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }
    // override the getArea Method
    public double getArea() {
       return length * width;
    }
    public static void main(String[] args){
        Rectangle areaOfRectangle = new Rectangle(50,40);
        double area = areaOfRectangle.getArea();

        System.out.println("The Area of Rectangle is :"+area);
    }
}