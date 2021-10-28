package Java.Mentoring.Map;

import java.util.*;

public class SuperMarket {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();

        superMarket.printDairy();
        superMarket.printChips();
        superMarket.printCookies();
        superMarket.printDairyPrice();
        superMarket.printChipsPrice();
        superMarket.printCookiesPrice();
        superMarket.dairyNameDairyPrice();
        superMarket.printChipsNameChipsPrice();
        superMarket.printCookiesNameCookiesPrice();
        superMarket.allProductsPrint();

    }
    Map<String,Double> allProductNamePrice;

    //LETS DO IT STEP BY STEP:

    //Store following dairy to the array: Milk, Cheese, Butter, Yogurt, Cream, Casein
    String[] dairy = {"Milk", "Cheese", "Butter", "Yogurt", "Cream", "Casein"};
    //Store following chips to the array: Lays, Fritos, Cheetos, Doritos, Ruffles, Pringles
    String[] chips = {"Lays", "Fritos", "Cheetos", "Doritos", "Ruffles", "Pringles"};

    //Store following cookies to the array: Nabisco,Oreo, Nestle, Amos, SnackWell ,MaryLand
    String[] cookies = {"Nabisco","Oreo", "Nestle", "Amos", "SnackWell" ,"MaryLand"};

    //TASK 1:
    //  Create three more arrays to store the prices for these products.
    //dairyPrice :  2.99, 1.99, 3.99, 2.49, 0.99, 1.69,
    double[] dairyPrice = {2.99, 1.99, 3.99, 2.49, 0.99, 1.69};

    //chipsPrice :  3.99,  2.99,  4.99,  3.49,  1.99,  2.69,
    double[] chipsPrice = {3.99,  2.99,  4.99,  3.49,  1.99,  2.69};

    //cookiesPrice: 4.99,  3.99,  5.99,  4.49,  2.99,  3.69,
    double[] cookiesPrice = {4.99,  3.99,  5.99,  4.49,  2.99,  3.69};

    //TASK 2:
//    Create the method to print the Dairy.(do it with the list, think about the reason why )
        public  void printDairy(){
            // first way and common way, work for all situation
            ArrayList<String > allDairyNames = new ArrayList<>();
            for (String dairyProduct : dairy){
                allDairyNames.add(dairyProduct);
            }
            System.out.println(allDairyNames);

            //second way - not common, working for
            ArrayList<String > alldairyNames2 = new ArrayList<>(Arrays.asList(dairy));
        }

//    Create the method to print the Chips.(do it with the list, think about the reason why )
            public void printChips(){
            ArrayList<String > allChipName = new ArrayList<>();
            for (String chipsProduct : chips){
                allChipName.add(chipsProduct);
            }
                System.out.println(allChipName);
            }


//    Create the method to print the Cookies (do it with the list, think about the reason why )
            public void printCookies(){
            ArrayList<String > allCookiesName = new ArrayList<>();
            for (String cookiesProduct : cookies){
                allCookiesName.add(cookiesProduct);
            }
                System.out.println(allCookiesName);
            }

    //TASK 3:
    //    Create the method to print the DairyPrice.(do it with the list, think about the reason why )
            public void printDairyPrice(){
            ArrayList<Double> allDairyPrice = new ArrayList<>();
            for (Double priceDairy : dairyPrice){
                allDairyPrice.add(priceDairy);
            }
                System.out.println(allDairyPrice);
            }


//    Create the method to print the ChipsPrice.(do it with the list, think about the reason why )
            public void printChipsPrice(){
            ArrayList<Double> allChipsPrice = new ArrayList<>();
            for (Double priceChips : chipsPrice){
                allChipsPrice.add(priceChips);
            }
                System.out.println(allChipsPrice);
            }


//    Create the method to print the CookiesPrice (do it with the list, think about the reason why )
            public void printCookiesPrice(){
            ArrayList<Double> allCookiesPrice = new ArrayList<>();
            for (Double priceCookies : cookiesPrice){
                allCookiesPrice.add(priceCookies);
            }
                System.out.println(allCookiesPrice);
            }


    //TASK 4:
//    Create the method to print the DairyName and DairyPrice.(do it with the map, think about the reason why )
            public void dairyNameDairyPrice() {
                Map<String , Double> allDairy = new LinkedHashMap();
                for (int i = 0; i < dairy.length; i++){
                    allDairy.put(dairy[i],dairyPrice[i]);
                }
                System.out.println(allDairy);
            }

//    Create the method to print the ChipsName and ChipsPrice.(do it with the map, think about the reason why )
            public void printChipsNameChipsPrice(){
            Map<String , Double> allChips = new LinkedHashMap<>();
            for (int i =  0; i < chips.length; i++){
                allChips.put(chips[i], chipsPrice[i]);
            }
                System.out.println(allChips);
            }


//    Create the method to print the CookiesName and CookiesPrice (do it with the map, think about the reason why )
            public void printCookiesNameCookiesPrice(){
            Map<String, Double> allCookies = new LinkedHashMap<>();
            for (int i = 0; i < cookies.length; i++){
                allCookies.put(cookies[i], chipsPrice[i]);
            }
                System.out.println(allCookies);
            }

    //TASK 5:
    // Do all Task4 in a same method
            public void allProductsPrint(){
            allProductNamePrice = new LinkedHashMap<>();
            for (int i = 0; i < dairy.length; i++ ){
                allProductNamePrice.put(dairy[i],dairyPrice[i]);
                allProductNamePrice.put(chips[i],chipsPrice[i]);
                allProductNamePrice.put(cookies[i], chipsPrice[i]);
            }
                System.out.println(allProductNamePrice);
            }


    //TASK 6:

    //Create a method with the parameter Java.String nameofItem and find the price of the product ?



    //Create a method with the parameter Java.String nameofItem and replace it from the map


}
