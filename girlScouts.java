import java.util.ArrayList;
import java.util.Scanner;

public class girlScouts {
    private static final String[] cookieList = null;

    public static ArrayList<String> greeting(String[] args) {
        ArrayList<String> cookieList = new ArrayList<String>();
        cookieList.add("Thanks-A-Lot");
        cookieList.add("Girl Scout Smores");
        cookieList.add("Lemonades");
        cookieList.add("Shortbread");
        cookieList.add("Thin Mints");
        cookieList.add("Peanut Butter Patties");
        cookieList.add("Caramel deLites");
        cookieList.add("Peanut Butter Sandwich");
        System.out.println("Here is the list of cookies" + " " + cookieList);
        return cookieList;
    }

    public static void main(String[] args) {
        greeting(cookieList);
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to order: ");
        String choice = input.next();
        if (choice.equals("Thanks-A-Lot")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        // Girl Scout Smores
        else if (choice.equals("Girl Scout Smores")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        // Lemonades
        else if (choice.equals("Lemonades")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        // Shortbread
        else if (choice.equals("Shortbread")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        // Thin Mints
        else if (choice.equals("Thin Mints")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        // Peanut Butter Patties
        else if (choice.equals("Peanut Butter Patties")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        // Caramel deLights
        else if (choice.equals("Caramel delites")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        // Peanut Butter Sandwich
        else if (choice.equals("Peanut Butter Sandwich")) {
            System.out.println("How many boxes would you like to order: ");
            Integer quant = input.nextInt();
            System.out.println("You wanted " + quant + " boxes of " + choice);
            Integer total = quant * 5;
            System.out.println("Your total is: $" + total + " have a great day!");
        }
        input.close();
    }
}