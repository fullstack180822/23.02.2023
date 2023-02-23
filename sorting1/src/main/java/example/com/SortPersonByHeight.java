package example.com;

import java.util.Comparator;

public class SortPersonByHeight implements Comparator<Person> {

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

}
