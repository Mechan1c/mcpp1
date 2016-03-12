package AListOps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EListTestNG 
{
	//EList list = new AList0();
		//EList list = new AList1();
		//EList list = new AList2();
		//EList list = new LList1();
		EList list = new LList2();
  /*@BeforeClass
  public void beforeClass() 
  {
  }*/

  @BeforeMethod
  public void beforeTest() 
  {	
			list.clear();		
  }


	//==========================================
	// Init, toArray, size
	//==========================================
	@Test (groups = { "mainT" })
	public void testInit_null()
	{
		int [] array = null;
		list.init(array);
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testInit_0()
	{
		int [] array = {};
		list.init(array);
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testInit_1()
	{
		int [] array = {10};
		list.init(array);
		assertEquals(1, list.size());
		int[] exp = {10};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testInit_2()
	{
		int [] array = {10,20};
		list.init(array);
		assertEquals(2, list.size());
		int[] exp = {10,20};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testInit_Many()
	{
		int [] array = {10,20,33,11,77,24};
		list.init(array);
		assertEquals(6, list.size());
		int[] exp = {10,20,33,11,77,24};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}

	//==========================================
	// clear
	//==========================================
	@Test (groups = { "mainT" })
	public void testClear_0()
	{
		int [] array = {};
		list.init(array);
		list.clear();
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testClear_1()
	{
		int [] array = {10};
		list.init(array);
		list.clear();
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testClear_2()
	{
		int [] array = {10,20};
		list.init(array);
		list.clear();
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testClear_Many()
	{
		int [] array = {10,20,33,11,77,24};
		list.init(array);
		list.clear();
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	//==========================================
	// addStart
	//==========================================
	@Test (groups = { "mainT" })
	public void testAddStart_0()
	{
		int [] array = {};
		list.init(array);
		list.addStart(99);
		assertEquals(1, list.size());
		int[] exp = {99};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testAddStart_1()
	{
		int [] array = {10};
		list.init(array);
		list.addStart(99);
		assertEquals(2, list.size());
		int[] exp = {99,10};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testAddStart_2()
	{
		int [] array = {10,20};
		list.init(array);
		list.addStart(99);
		assertEquals(3, list.size());
		int[] exp = {99,10,20};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test (groups = { "mainT" })
	public void testAddStart_Many()
	{
		int [] array = {10,20,33,11,77,24};
		list.init(array);
		list.addStart(99);
		assertEquals(7, list.size());
		int[] exp = {99,10,20,33,11,77,24};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
}
