package Shape;

public interface Shape extends Comparable {
    double area();
    String name();
    @Override
    int compareTo(Object o);
}
