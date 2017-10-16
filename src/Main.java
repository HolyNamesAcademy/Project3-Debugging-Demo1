import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("I can add numbers for you!");
        System.out.print("Enter the first number: ");
        int first = scan.nextInt();
        System.out.print("Enter the second number: ");
        int second = scan.nextInt();
        int sum = first + second;
        if ( sum < 50 ) {
            System.out.println("The sum of the two numbers is greater than 25 and less than 50");
        }
        else if ( sum < 25 ) {
            System.out.println("The sum of the two numbers is greater than 25 and less than 50");
        }
        else {
            System.out.println("The sum of the two numbers is greater than 50");
        }
    }
}
