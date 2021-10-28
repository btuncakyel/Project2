package Java.Object;

public class Animal {

    String name = "Jerry";
    public int age;
    double weight;
    int legNumber;
    double energy = 100;

  public void run(String destination){

      energy -= 10;
      System.out.println(name + " is running " + destination);


  }
    // create a sleep method and print >> " ... is sleeping"
    //make every animal sleep

    public void sleep(){           // public--> access modifier  // void --> return type  // sleep --> name of method  // () --> you can pass parameters

      energy =100;
      System.out.println(name + " is sleeping");
    }

    // create printInfo() method to print out all information about the animals

    public void printInfo(){

        System.out.println("information about name: " + name +" age : "  + age + " weigth " + weight + " leg Numbers : " + legNumber + " Energy is: " + energy );
    }
}
