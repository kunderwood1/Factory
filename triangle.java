package Shape;

class triangle implements Shape{
private double height,base;
    triangle(double height, double base){
        this.height=height;
        this.base=base;
    }
    @Override
    public double area() {
        return (this.base*this.height)/2.0;
    }

    @Override
    public String name() {
        return "triangle";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
