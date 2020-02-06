package Shape;

class square implements Shape{
    private double lenth, width;
    square(double length, double width){
        this.lenth=length;
        this.width=width;
    }
    @Override
    public double area() {
        return this.lenth*this.width;
    }

    @Override
    public String name() {
        return "square";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
