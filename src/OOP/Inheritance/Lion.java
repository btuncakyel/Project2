package OOP.Inheritance;

public class Lion extends WildAnimal{

    public void eat(){
        System.out.println("Lion is eating");
    }
    public int sleep(){
        System.out.println("Lion is sleeping");
        return 5;
    }
    public Lion run(){                                  //should be same return type for child and parent
        System.out.println("Lion is running");          //co-variant means smaller than animal which is Lion
        return new Lion();                              // co-variant is Lion which is smaller than Animal
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }

}
