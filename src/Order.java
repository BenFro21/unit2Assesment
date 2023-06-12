import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

        // part 4
        System.out.println(order.get(0));
        System.out.println(order.get(1));
        double subTotal = 0.0;
        for (int i = 2; i < order.size() ; i++) {
            // check if order i is equal to cupcakeMenu 0
            if(order.get(i).equals(cupcakeMenu.get(0))){
                cupcakeMenu.get(0).type();
                System.out.println(cupcakeMenu.get(0).getPrice());
                subTotal += cupcakeMenu.get(0).getPrice();
            } else if (order.get(i).equals(cupcakeMenu.get(1))) {
                cupcakeMenu.get(1).type();
                System.out.println(cupcakeMenu.get(1).getPrice());
                subTotal += cupcakeMenu.get(1).getPrice();
            }else if(order.get(i).equals((cupcakeMenu.get(2)))){
                cupcakeMenu.get(2).type();
                System.out.println(cupcakeMenu.get(2).getPrice());
                subTotal += cupcakeMenu.get(2).getPrice();
            }else if(order.get(i).equals(drinkMenu.get(0))){
                drinkMenu.get(0).type();
                System.out.println(drinkMenu.get(0).getPrice());
                subTotal += drinkMenu.get(0).getPrice();
            }else if(order.get(i).equals(drinkMenu.get(1))){
                drinkMenu.get(1).type();
                System.out.println(drinkMenu.get(1).getPrice());
                subTotal += drinkMenu.get(1).getPrice();
            } else if (order.get(i).equals(drinkMenu.get(2))) {
                drinkMenu.get(2).type();
                System.out.println(drinkMenu.get(2).getPrice());
                subTotal += drinkMenu.get(2).getPrice();
            }
            System.out.println("$ " + subTotal);
            new CreateFile();
            new WriteToFile(order);
        }
    }
    //project 4 part 2
    public class CreateFile{
        public CreateFile(){
            try{
                File salesData = new File("salesData.txt");
                if(salesData.createNewFile()){
                    System.out.println("File Created: " + salesData.getName());
                }else {
                    System.out.println("File already made");
                }
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
    }
    //project 4 part 3
    public class WriteToFile{
        public WriteToFile(ArrayList<Object> order){
            try{
                FileWriter fw = new FileWriter("salesData.txt", true);
                PrintWriter salesWriter = new PrintWriter(fw);

                for (int i = 0; i < order.size() ; i++) {
                    salesWriter.println(order.get(i));
                }
                salesWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("Error");
            }

        }
    }
}



