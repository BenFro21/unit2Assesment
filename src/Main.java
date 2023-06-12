// import java.utils
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
//    Main function
    public static void main(String[] args) {
        // create a new scanner instance
        Scanner input = new Scanner(System.in);
        // new ArrayList cupcakeMenu. three new cupcake object instances created
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        // setting the cupcake price
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description: ");
        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        // converting string to double
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);
        // setting the redVelvet price
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");
        String redVelvetPriceText = input.nextLine();
        // converting string to double
        double redVelvetPrice = Double.parseDouble(redVelvetPriceText);
        redVelvet.setPrice(price);
        // setting the chocolate price
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");
        String chocolatePriceText = input.nextLine();
        // converting string to double
        double chocolatePrice = Double.parseDouble(chocolatePriceText);
        chocolate.setPrice(chocolatePrice);
        // add cupcake, redvelvet and chocolate to the cupckakeMenu
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        // create a new ArrayList named drink menu
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        // create new drink instances from drink, soda and milk classes
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();
        // setting drink priceing
        System.out.println("We are in the middle of creating the Drink menu. We currently have three drinks on the menu but we need to decide on pricing");
        System.out.println("We are deciding on the price for our standard drink here is the description: ");
        water.type();
        System.out.println("How much would you like to charge for the Water? (Input a numerical number taken to 2 decimal places).");
        String drinkPriceText = input.nextLine();
        double drinkPrice = Double.parseDouble(drinkPriceText);
        water.setPrice(drinkPrice);
        // setting soda priceing
        System.out.println("We are decideing on the price of soda, here is a description: ");
        soda.type();
        System.out.println("How much would you like to charge for the soda?");
        String sodaPriceText = input.nextLine();
        double sodaPrice = Double.parseDouble(sodaPriceText);
        soda.setPrice(sodaPrice);
        // setting milk price
        System.out.println("We are decideing on the price of milk, here is a description: ");
        milk.type();
        System.out.println("How much would you like to charge for the milk?");
        String milkPriceText = input.nextLine();
        double milkPrice = Double.parseDouble(milkPriceText);
        soda.setPrice(milkPrice);
        // adding drinks to the drinkMenu array list
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);

    }


}
//Create a cupcake class. this will be the parent class that extends other classes
class Cupcake {
    public double price;
    // A public function with the responsibility of printing a string.
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
    // Public function responsible for getting the price of a cupcake
    public double getPrice() {
        return price;
    }
    // public function for setting the price of cupcakes
    //@param double price
    public void setPrice(double price) {
        this.price = price;
    }
}
// extends cupcake class. getPrice(), type(), and setPrice() are all inhearted
class RedVelvet extends Cupcake {
//    overides the type function of the parent class cupcake.
    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}
// extends cupcake class. getPrice(), type(), and setPrice() are all inhearted
class Chocolate extends Cupcake {
    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

// main parent drink class
class Drink{
    public double price;

    public void type(){
        System.out.println("A Bottle of water");
    }
    // Public function responsible for getting the price of a cupcake
    public double getPrice(){
        return price;
    }
    // public function for setting the price of drinks
    //@param double price
    public void setPrice(double price) {
        this.price = price;
    }
}
// soda class extending the drink class inheriting getPrice, setPrice, type methods.
class Soda extends Drink {
    //override the parent type() function
    @Override
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

// soda class extending the drink class inheriting getPrice, setPrice, type methods.
class Milk extends Drink {
    @Override
    public void type(){
        System.out.println("A bottle of milk.");
    }
}
