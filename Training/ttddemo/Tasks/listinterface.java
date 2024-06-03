 import java.util.ArrayList;
import java.util.List;

public class listinterface {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> result = removeEverySecondElement(numbers);
        System.out.println("Original List: " + numbers);
        System.out.println("Result List: " + result);
    }

    public static List<Integer> removeEverySecondElement(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}