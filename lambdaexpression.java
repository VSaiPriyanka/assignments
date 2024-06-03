import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class lambdaexpression {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("sravani", 50));
        people.add(new Person("priyanka", 75));
        people.add(new Person("suneel", 85));

        // Sorting by age using a Comparator with lambda expression
        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());

        // Printing sorted list
        for (Person person : people) {
            System.out.println(person.getName() + ": " + person.getAge());
        }
    }
}