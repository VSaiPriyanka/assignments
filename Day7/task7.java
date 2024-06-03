public class task7 {
    public class Main {
        public static void main(String[] args) {
            int dividend = 5;
            int divisor = 0;
            try {
                int result = dividend / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

    