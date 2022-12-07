import java.util.Scanner;

public class SuggestActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int airTemperature;

        System.out.print("Enter the temperature of the air: ");
        airTemperature = scanner.nextInt();

        if (airTemperature > 5) {
            if (airTemperature < 15) {
                System.out.println("You can go to the cinema!");
                if (airTemperature > 10) {
                    System.out.print("You can go for a picnic!");
                }
            } else if (airTemperature < 25) {
                System.out.print("You can go for a picnic!");
            } else {
                System.out.print("You can go swimming!");
            }
        } else {
            System.out.print("You can go skiing!");
        }
    }
}
