package OOP.Interface1;

public class Square implements Shape {

    @Override

    public Integer area(int side){
        return side*side;
        // you have to make the access modifiers public

    }
    public Double perimeter(){
        // since Number is parent of the primitive type of Object
        // Number's co-variant are --> Integer, Double...

        return 10.5;
    }

}
