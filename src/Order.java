import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class Order {
    // create a constructor with 2 params: and arrayList of cupcakeMenu and DrinkMenu
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){
        System.out.println("Hello Customer would you like to place and order? (Y or N).");
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();
        ArrayList<Object> order = new ArrayList<Object>();

        if(placeOrder.equalsIgnoreCase("Y")){
            // adding localDate and local time to the object arrayList order
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu");
            System.out.println("CUPCAKES: ");
            int itemNumber = 0;
            for (int i = 0; i < cupcakeMenu.size() ; i++) {
                // iterate through the cupcakeMenu adding one to itemNumber and printing the type() method and price of each cupcake
                itemNumber++;
                System.out.println(itemNumber + ".");
                cupcakeMenu.get(i).type();
                System.out.println("Price: $" + cupcakeMenu.get(i).getPrice());
                System.out.println();
            }
            System.out.println("DRINKS: ");
            for (int i = 0; i < drinkMenu.size(); i++) {
                // Iterate through the drink menu adding one to item number each iteration and printing the type() method and price of each drink
                itemNumber++;
                System.out.println(itemNumber + ".");
                drinkMenu.get(i).type();
                System.out.println("Price: $" + drinkMenu.get(i).getPrice());
                System.out.println();
            }
        }else{
            System.out.println("Have a nice Day!");
        }
        // place order
        boolean ordering = true;
        while(ordering){
            System.out.println("What would you like to order? Please use the number associated with each item to order.");
            int orderChoice = input.nextInt();
            input.nextLine();
            if(orderChoice == 1){
                order.add(cupcakeMenu.get(0));
                System.out.println("Item added to order");
            } else if (orderChoice == 2) {
                order.add(cupcakeMenu.get(1));
                System.out.println("Item added to order");
            }else if(orderChoice == 3) {
                order.add(cupcakeMenu.get(2));
                System.out.println("Item added to order");
            } else if (orderChoice == 4) {
                order.add(drinkMenu.get(0));
                System.out.println("Item added to order");
            } else if (orderChoice == 5) {
                order.add(drinkMenu.get(1));
                System.out.println("Item Added to order");
            } else if (orderChoice == 6) {
                order.add(drinkMenu.get(2));
                System.out.println("Item added to order");
            }else{
                System.out.println("Sorry we dont seem to have that on our menu");
                System.out.println("Would you like to continue ordering? (Y or N)");
                String placeOrderTwo = input.nextLine();
                if(!placeOrderTwo.equalsIgnoreCase("Y")){
                   ordering = false;
                }
            }
        }
    }
}
