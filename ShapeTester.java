import Shape.Shape;
import Shape.ShapeFactory;


public class ShapeTester {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.createShape("Circle",1.0,0);
        System.out.println("Name "+shape1.name()+" : Area "+shape1.area());

        Shape shape2 = ShapeFactory.createShape("rectangle",2.0,2.0);
        System.out.println("Name "+shape2.name()+" : Area "+shape2.area());

        Shape shape3 = ShapeFactory.createShape("triangle",2.0,23.0);
        System.out.println("Name "+shape3.name()+" : Area "+shape3.area());

        Shape shape4 = ShapeFactory.createShape("TRiangle",15.0,2.0);
        System.out.println("Name "+shape4.name()+" : Area "+shape4.area());

        Shape shape5 = ShapeFactory.createShape("rectangle",5.1,3.2);
        System.out.println("Name "+shape5.name()+" : Area "+shape5.area());

        Shape shape6 = ShapeFactory.createShape("rectangle",2.0,2.0);
        System.out.println("Name "+shape6.name()+" : Area "+shape6.area());

        Shape shape7 = ShapeFactory.createShape("rectangle",2.0,48.0);
        System.out.println("Name "+shape7.name()+" : Area "+shape7.area());

        Shape shape8 = ShapeFactory.createShape("rectangle",42.0,42.0);
        System.out.println("Name "+shape8.name()+" : Area "+shape8.area());
    }
}
