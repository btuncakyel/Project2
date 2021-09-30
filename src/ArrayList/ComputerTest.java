package ArrayList;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        ArrayList<Computer> computer = new ArrayList();

        Computer com1 = new Computer("Apple","macbook Air", 1500 ,13.5 );
        Computer com2 = new Computer("Apple","macbookpro", 2000  ,16 );
        Computer com3 = new Computer("HP ","Envy", 1100  ,15.0 );
        Computer com4 = new Computer("Lenovo ","ThinkPad", 900  ,11 );


        ArrayList<Computer> computers = new ArrayList();

        computers.add(com1);
        computers.add(com2);
        computers.add(com3);
        computers.add(com4);

        // com1.findComputer(computers); if it not static you can also call the method because you are already create an object
        Computer.findComputer(computers);  // you can call static method with class name
        System.out.println("***********************************");
        com1.findComputer1(computers);   // you can call static or non static method with help of object

    }

}
