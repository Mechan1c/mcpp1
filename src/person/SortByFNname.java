package person;

import java.util.Comparator;

public class SortByFNname implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) 
	{
		return o1.fname.compareTo(o2.fname);
	}

}
