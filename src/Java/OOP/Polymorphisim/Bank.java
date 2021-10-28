package Java.OOP.Polymorphisim;

public class Bank extends Branch{

    public void loan(){
        System.out.println("Bank can give up to 1M");
    }
    public void hire(){
        System.out.println("Bank can hire or CEO");
    }
    public void openAccount(){
        System.out.println("Bank can open Business Account");
    }


}
