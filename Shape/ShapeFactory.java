package Shape;

public class ShapeFactory {
    public static Shape createShape(String Type, double length, double width) {
        if (Type == null) {
            return null;
        }
        if (Type.equalsIgnoreCase("CIRCLE")) {
            return new circle(length);
        } else if (Type.equalsIgnoreCase("RECTANGLE")) {
            return new rectangle(length, width);

        } else if (Type.equalsIgnoreCase("SQUARE")) {
            return new square(length, width);

        } else if (Type.equalsIgnoreCase("TRIANGLE"))
            return new triangle(length, width);

        return null;
    }
}
