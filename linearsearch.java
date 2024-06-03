public class linearsearch{
    public static void main(String[] args) {
        int[] array = { 2, 5, 7, 9, 11, 15 };
        int target = 11;

        int index = performLinearSearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }

    // Function to perform linear search
    public static int performLinearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index of the target element if found
            }
        }
        return -1; // Return -1 if target element is not found
    }
}