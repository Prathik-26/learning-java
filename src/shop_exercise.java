import java.util.Scanner;

public class shop_exercise {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item are you purchasing?: ");
        item = scanner.nextLine();

        System.out.print("What is the price of the item?: ");
        price = scanner.nextDouble();

        System.out.print("How many are you purchasing?: ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("You are purchasing " + quantity + " " + item + "(s) at a price of " + currency + price + " each.");
        System.out.println("Your total is: " + currency + total);

        scanner.close();


    }
}
