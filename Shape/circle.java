package Shape;

class circle implements Shape{
    private double radius;
    circle(double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String name() {
        return "circle";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
