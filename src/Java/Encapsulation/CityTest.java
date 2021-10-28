package Java.Encapsulation;

public class CityTest {
    public static void main(String[] args) {

        City city = new City();

        city.setName("chicago");
        System.out.println(city.getName());

        city.setPopulation(200000);
        System.out.println(city.getPopulation());

        city.setEstablishment(1770);
        System.out.println(city.getEstablishment());

    }
}
