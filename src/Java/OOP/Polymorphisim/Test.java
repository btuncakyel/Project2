package Java.OOP.Polymorphisim;

public class Test {
    public static void main(String[] args) {

        ATM atm = new ATM();
        atm.balance();

//        Branch branch = (Branch) atm;   // it gives exceptions
//        branch.loan();

        ATM branch1 = new Branch();
        branch1.deposit();
       //  branch1.loan();  it will not work because ewe are referring to ATM, methods will come from ATM not Branch.

        Branch branch2 = new Branch();
        branch2.hire();

        Bank bank = new Bank();
        bank.withdraw();  // since Bank is extending from Branch but Branch does not have withdraw method.
                        // But Branch is extending from the ATM and ATM has a withdraw method and ATM has withdraw method


        // Down Casting the object to the child reference. it is nececrasy

        ATM atm1 = new Bank();
        atm1.balance();
        ((Branch)atm1).hire();

        ATM atm2 = new Branch();
        ((Branch)atm2).hire();
       // ((Bank)atm2).hire();

        Bank bank1 = new Bank();
        bank1.withdraw();
        bank1.hire();
        bank1.assistance();

        //Upcasting  --> it is not necessary because Branch already capable to call the assistance method
        ((Branch)bank1).assistance();



    }
}
