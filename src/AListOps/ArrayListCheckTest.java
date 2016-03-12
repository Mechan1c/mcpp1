package AListOps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayListCheckTest
{
	ArrayListCheck testObj = new ArrayListCheck();
	ArrayListCheck addObj = new ArrayListCheck();
	int[] testArr = {11,-22,33,44,-55,66,-77,-88,99,0};
	
	@Before
	public void doBeforeEach()
	{
	testObj.init(testArr);
	}
	
	@Test
	public void testInit()
	{
		
		assertArrayEquals(testArr, testObj.getArray());
	}

	@Test
	public void testClear()
	{
		testObj.clear();
		int[] t = {0,0,0,0,0,0,0,0,0,0};
		assertArrayEquals(t, testObj.getArray());
	}

	@Test
	public void testSize()
	{
		
		assertEquals(10, testObj.size());
	}
	@Test
	public void testSize0()
	{
		
		testObj.clear();
		assertEquals(0, testObj.size());
	}
	
	/*@Test
	public void testToArray()
	{
		
		int[] addArr = {36,18};
		int[] arr = {11,-22,33,44,-55,66,-77,-88,99,0,36,18};
		assertArrayEquals(arr, testObj.toArray(addArr)); // TODO
	}*/

	@Test
	public void testAddStart()
	{
		
		int[] resArr = {15,11,-22,33,44,-55,66,0,0,0};
		testObj.addStart(15);
		assertArrayEquals(resArr, testObj.array);
	}

	@Test
	public void testAddEnd()
	{
		int[] resArr = {11,-22,33,44,-55,66,15,0,0,0};
		testObj.addEnd(15);
		assertArrayEquals(resArr, testObj.array);
	}

	/*@Test
	public void testAddPos()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testDelStart()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testDelEnd()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testDelPos()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testGet()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSet()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testMin()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testMax()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testMinInd()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testMaxInd()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testReverse()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testHalfRev()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSooort()
	{
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSort()
	{
		fail("Not yet implemented"); // TODO
	}
*/
}
