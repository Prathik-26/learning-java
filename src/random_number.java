import java.util.Random;
public class random_number {
    public static void main(String[] args) {
        Random random = new Random();
        int number1;
        int number2;
        double number3;
        boolean isHeads;

        number1 = random.nextInt(1,5);
        number2 = random.nextInt(5,11);
        number3 = random.nextDouble(11,20);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(isHeads) {
            System.out.println("Heads");
        }
        else {
            System.out.println("Tails");
        }
    }
}
