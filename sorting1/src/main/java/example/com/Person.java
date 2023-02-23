package example.com;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Person implements Comparable<Person>{

    protected float height;
    protected int age;

    public static SortPersonByHeight SortPersonByHeightLogic = new SortPersonByHeight();
    public static Comparator<Person> SortPersonByAgeLogic = (o1, o2) -> o1.age - o2.age;
    //public static Comparator<Person> getComparator(String fieldname)

    @Override
    public int compareTo(Person o) {
//        if (this.age > o.age) {
//            return 1;
//        }
//        else if (this.age < o.age) {
//            return -1;
//        }
//        return 0;
        return (this.age - o.age);
    }
}
