package Shape;

class rectangle implements Shape{
    private double lenth, width;
    rectangle(double length, double width) {
        this.lenth=length;
        this.width=width;
    }

    @Override
    public double area() {
        return this.lenth*this.width;
    }

    @Override
    public String name() {
        return "rectangle";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
