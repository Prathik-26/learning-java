import java.util.Scanner;
public class Mad_Libs {
    public static void main(String[] args){
        //MAD LIBS

        Scanner scanner = new Scanner(System.in);

        String adjective1, adjective2, noun1, noun2, noun3, verb1, verb2, place1, place2;
        System.out.println("Enter an adjective: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter another adjective: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a noun: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter another noun: ");
        noun2 = scanner.nextLine();
        System.out.println("Enter one more noun: ");
        noun3 = scanner.nextLine();
        System.out.println("Enter a verb: ");
        verb1 = scanner.nextLine();
        System.out.println("Enter another verb: ");
        verb2 = scanner.nextLine();
        System.out.println("Enter a place: ");
        place1 = scanner.nextLine();
        System.out.println("Enter another place: ");
        place2 = scanner.nextLine();
        System.out.println("Here is your story: ");
        System.out.println("Once upon a time in a " + adjective1 + " land, there was a " + noun1 + " who loved to " + verb1 + ".");
        System.out.println("Every day, the " + noun1 + " would visit the " + place1 + " to meet its friends, a " + adjective2 + " " + noun2 + ".");
        System.out.println("One day, they decided to go on an adventure to " + place2 + ".");
        System.out.println("Along the way, they encountered a " + noun3 + " who challenged them to a " + verb2 + " contest.");
        System.out.println("In the end, they all became friends and lived happily ever after.");
        scanner.close();

    }
}
