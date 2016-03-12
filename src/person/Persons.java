/*package person;

import java.util.Arrays;

public class Persons 
{

	public static void main(String[] args) 
	{
		Person[] p = new Person[30];

		init(p);
		sortByAge(p);
		printAll( p );
		//print18To65( p );
		//print20or30or40( p );
		//printLengthLnameFname( p );
		//printLname6Letters( p );
		//printId( p );
		//printIdPlus1000( p );
		//printMiddleA( p );
		//printSmollTheFirstLetterToTall( p );
		//printSame( p );
		//printToUpperCase( p );
		//printEvToOv( p );
		Arrays.sort(p, new SortByFNname());
		System.out.println();
		printAll( p );
		Arrays.sort(p, new SortByID());
		System.out.println();
		printAll( p );		
	}

	public static void init( Person[] p )
	{
		p[0] = new Person(15, "Vasia", "Pupkin", 23);
		p[1] = new Person(1, "Vania", "Golubkin", 36);
		p[2] = new Person(5, "Igor", "Korovaev", 17);
		p[3] = new Person(17, "Danil", "Voronov", 63);
		p[4] = new Person(19, "Lana", "Koneva", 20);
		p[5] = new Person(4, "Vasia", "Pab", 24);
		p[6] = new Person(7, "Misha", "Nosov", 31);
		p[7] = new Person(6, "Mania", "Nosova", 44);
		p[8] = new Person(9, "Roma", "Zverev", 57);
		p[9] = new Person(10, "Katrusia", "Babaikina", 23);

		p[10] = new Person(20, "Liza", "Kaverkina", 27);
		p[11] = new Person(21, "Ulia", "Zozulia", 32);
		p[12] = new Person(22, "Max", "Zbruev", 13);
		p[13] = new Person(23, "Sasha", "kluev", 28);
		p[14] = new Person(24, "Linda", "Zarina", 74);
		p[15] = new Person(25, "nikolay", "andreev", 93);
		p[16] = new Person(26, "Gavriil", "Zdoroveckiy", 13);
		p[17] = new Person(27, "Rostik", "Frostik", 30);
		p[18] = new Person(28, "denis", "Krot", 18);
		p[19] = new Person(29, "Vitaliy", "Pupkin", 29);

		p[20] = new Person(37, "Diana", "Molofeeva", 31);
		p[21] = new Person(59, "Irina", "Zozulia", 43);
		p[22] = new Person(61, "Irina", "Zozulia", 34);
		p[23] = new Person(77, "Masha", "Krasa", 40);
		p[24] = new Person(34, "Ksusha", "Lopatina", 39);
		p[25] = new Person(45, "Lora", "Klueva", 18);
		p[26] = new Person(51, "Olia", "Dolia", 33);
		p[27] = new Person(61, "Oleg", "Smeh", 80);
		p[28] = new Person(50, "Andrey", "Kurochkin", 24);
		p[29] = new Person(49, "Vlad", "tajan", 25);
	}

	public static void printAll( Person[] p )
	{
		for(int i = 0; i < p.length; i++)
		{
			System.out.println(p[i]);
		}
	}

	public static void print18To65( Person[] p )
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].age >= 18 && p[i].age <= 65)
			{
				System.out.println( p[i] );
			}
		}
	}

	public static void print20or30or40( Person[] p )
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].age == 20 || p[i].age == 30 || p[i].age == 40)
			{
				System.out.println( p[i] );
			}
		}
	}

	public static void printLengthLnameFname( Person[] p )
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].fname.length() == p[i].lname.length())
			{
				System.out.println( p[i] );
			}
		}
	}

	public static void printLname6Letters( Person[] p)
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].lname.length() == 6)
			{
				System.out.println( p[i] );
			}
		}
	}

	public static void printId( Person[] p )
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].id %2 == 0)
			{
				System.out.println( p[i] );
			}
		}
	}

	public static void printIdPlus1000( Person[] p)
	{
		for(int i = 0; i < p.length; i++)
		{
			if(i < 10)
			{
				p[i].id += 1000;
			}

			System.out.println( p[i] );
		}
	}

	public static void printMiddleA( Person[] p)
	{
		here: for(int i = 0; i < p.length ; i++)
		{
			if(p[i].lname.contains("a"))
			{
				if(p[i].lname.startsWith("a") || p[i].lname.endsWith("a"))
				{
					continue here;
				}

				System.out.println( p[i] );
			}
		}
	}

	public static void printSame(Person[] p)
	{
		for(int i = 0; i < p.length; i++)
		{
			for(int j = i+1; j < p.length; j++)
			{
				if(p[i].lname.compareToIgnoreCase(p[j].lname) == 0)
				{
					System.out.println( p [i] );
					System.out.println( p [j] );
				}
			}
		}
	}

	public static void printToUpperCase( Person[] p )
	{
		for(int i = 0; i < p.length; i++)
		{
			StringBuilder str1 = new StringBuilder(p[i].fname);
			StringBuilder str2 = new StringBuilder(p[i].lname);

			char cc1 = Character.toUpperCase(str1.charAt(0));
			char cc2 = Character.toUpperCase(str2.charAt(0));

			str1.setCharAt(0, cc1);
			str2.setCharAt(0, cc2);

			p[i].fname = str1.toString();
			p[i].lname = str2.toString();

			System.out.println( p[i] );
		}
	}

	public static void printEvToOv( Person[] p)
	{
		for(int i = 0; i < p.length; i++)
		{

			System.out.println( p[i] );

		}
	}
	public int compareTo(Object obj)
	{
		if(this==obj) return 0;
		Person tmp=(Person)obj;

		int[] arr1 = array;
		int[] arr2 = tmp.array;
		if (this.size()>=tmp.size()) return 1;
		
		else if (this.size()<=tmp.size()) return -1;
		else 
		{
			for(int i=0; i<arr1.length;i++)
			{
				if(arr1[i]>=arr2[i]) return 1;
				else if (arr1[i]<=arr2[i]) return -1;				
			}
			return 0;
		}
	}
	public static void sortByLName(Person[] p) 
	 {
	  for (int i = 0; i < p.length; i++) 
	  {
	   for (int j = 0; j < p.length-i-1; j++) 
	   {
	    if(p[j].lname.compareTo(p[j+1].lname) > 0)
	    {
	     Person tmp = p[j];
	     p[j] = p[j+1];
	     p[j+1] = tmp;
	    }
	   }
	  }
	 }
	public static void sortByFName(Person[] p) 
	 {
	  for (int i = 0; i < p.length; i++) 
	  {
	   for (int j = 0; j < p.length-i-1; j++) 
	   {
	    if(p[j].fname.compareTo(p[j+1].fname) > 0)
	    {
	     Person tmp = p[j];
	     p[j] = p[j+1];
	     p[j+1] = tmp;
	    }
	   }
	  }
	 }
	public static void sortByid(Person[] p) 
	 {
	  for (int i = 0; i < p.length; i++) 
	  {
	   for (int j = 0; j < p.length-i-1; j++) 
	   {
	    if(p[j].id > p[j+1].id)
	    {
	     Person tmp = p[j];
	     p[j] = p[j+1];
	     p[j+1] = tmp;
	    }
	   }
	  }
	 }
	public static void sortByAge(Person[] p) 
	 {
	  for (int i = 0; i < p.length; i++) 
	  {
	   for (int j = 0; j < p.length-i-1; j++) 
	   {
	    if(p[j].age > p[j+1].age)
	    {
	     Person tmp = p[j];
	     p[j] = p[j+1];
	     p[j+1] = tmp;
	    }
	   }
	  }
	 }
}*/