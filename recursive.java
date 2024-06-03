public class recursive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array);
        System.out.println("Sum of elements in the array: " + sum);
    }
    
    public static int sumArray(int[] array) {
        return sumArrayRecursive(array, array.length - 1);
    }
    
    private static int sumArrayRecursive(int[] array, int index) {
        // Base case: if index is less than 0 (no elements left)
        if (index < 0) {
            return 0;
        }
        
        // Recursive case: sum the current element with the sum of the rest of the array
        return array[index] + sumArrayRecursive(array, index - 1);
    }
}