package person;

import java.util.Comparator;

public class SortByID implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.id - o2.id;
	}

}
