package Part_2;

public class Circle {
    private double radius;
    private String color;

    public Circle(){
        this.radius = 1;
        this.color= "blue";
    }
    public Circle(double r){
        this.radius = r;
        this.color = "blue";
    }
    public Circle(double circle_radius, String circleColor){
        this.radius = circle_radius;
        this.color = circleColor;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "The circle has radius of " + this.radius + " and area of " +
                this.getArea();
    }
}
