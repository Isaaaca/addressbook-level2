package seedu.addressbook.comparators;

import seedu.addressbook.data.person.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return  o1.getName().toString().compareTo(o2.getName().toString());

    }
}
