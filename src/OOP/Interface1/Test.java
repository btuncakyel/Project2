package OOP.Interface1;

public class Test {
    public static void main(String[] args) {

        Square square = new Square();

        System.out.println(square.area(4));
        System.out.println(square.perimeter());

        // Shape shape = new Shape();
        // you cannot create object from interfcae

        Shape shape = new Square();
        // we can refer to interface class to create an object

        System.out.println(shape.area(6));
        System.out.println(shape.SIDE);  // calling by object
        System.out.println(Shape.SIDE);  // calling by class

        System.out.println(square.SIDE);
      // square. SIDE = 4;  // you cannot reassign the final


        Triangle triangle = new Triangle();
        triangle.height = 7;

        System.out.println(triangle.height);
        System.out.println(triangle.area(8));

        shape.info();
        square.info();
        triangle.info();

        square.info("SQUARE");




    }
}
