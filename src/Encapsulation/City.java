package Encapsulation;

public class City {

    private String name;
    private int population;
    private  int establishment;

    public void setName(String newName){
        // we need to pass the parameter to change the name
        // for set method we are not returning (just setting)
        name = newName;
    }
    public String getName(){
        // for get method we need to return
        // we are not pass te parameter. we are getting the parameter which we set before
        return name;
    }

    // create the setter and getter for other instance fields

    public void setPopulation(int newPopulation){
        population = newPopulation;

    }
    public int getPopulation(){
        return population;
    }
    public void setEstablishment(int newEstablisment){
        establishment = newEstablisment;
    }
    public int getEstablishment(){
        return establishment;
    }

}
