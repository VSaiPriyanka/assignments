import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 3:");
        int number = scanner.nextInt();
        
        switch(number) {
            case 1:
                System.out.println("You entered one.");
                break;
            case 2:
                System.out.println("You entered two.");
                break;
            case 3:
                System.out.println("You entered three.");
                break;
            default:
                System.out.println("Invalid number entered.");
        }
        
        scanner.close();
    }
    
}
