public class task1 {
    public static void main(String[] args) {
        // Declare two integer variables
        int num1 = 5, num2 = 10;

        // Print the initial values of the variables
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap the values of the variables without using a third variable
        num1 = num1 + num2; // num1 now holds the sum of the original values
        num2 = num1 - num2; // num2 now holds the difference between the sum and the original value of num2
        num1 = num1 - num2; // num1 now holds the difference between the sum and the original value of num1

        // Print the swapped values of the variables
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}