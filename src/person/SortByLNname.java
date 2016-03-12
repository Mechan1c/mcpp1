package person;

import java.util.Comparator;

public class SortByLNname implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) 
	{
		return o1.lname.compareTo(o2.lname);
	}

}
