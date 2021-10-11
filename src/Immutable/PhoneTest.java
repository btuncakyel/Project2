package Immutable;

public class PhoneTest {

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        String brand = phone1.getBrand();
        System.out.println(brand);

        Phone phone2 = new Phone();
        System.out.println(phone2.getBrand());

        Phone phone3 = new Phone();
        phone3.call();

    }

}
