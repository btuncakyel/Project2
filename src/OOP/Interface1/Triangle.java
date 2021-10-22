package OOP.Interface1;

public class Triangle implements Shape {
    //(base * height) / 2

    int height = 5;

    @Override
    public Integer area(int side) {
        return (side * height) / 2;   // object can be null but primitive type cannot be null
    }

    @Override
    public Double perimeter() {
        return 10.5;
    }
    public void info(){
        System.out.println("I am info from Triangle");
    }
}
