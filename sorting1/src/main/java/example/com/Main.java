package example.com;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Person[] people = { new Person(1.8f, 29), new Person(1.2f, 12), new Person(1.9f, 31),
                new Person(0.8f, 6), new Person(1.75f, 28)};

        int[] nums = { 5, 9, -2, 30, 0 , 1 };

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("sort by age");
        Arrays.sort(people); // sort by Comperable
        System.out.println(Arrays.toString(people));

        System.out.println("sort by height");
        // 1
        Arrays.sort(people, new SortPersonByHeight());
        // 2
        Arrays.sort(people, Person.SortPersonByHeightLogic);
        // 3
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getHeight() > o2.getHeight()) {
                    return 1;
                }
                else if (o1.getHeight() < o2.getHeight()) {
                    return -1;
                }
                return 0;
            }
        });
        // 4
        Arrays.sort(people, (o1, o2) -> {
                if (o1.getHeight() > o2.getHeight()) {
                    return 1;
                }
                else if (o1.getHeight() < o2.getHeight()) {
                    return -1;
                }
                return 0;
            });
        // 5 -- sort by age
        Arrays.sort(people, (o1, o2) -> o1.age - o2.age);

        System.out.println(Arrays.toString(people));
    }
}
