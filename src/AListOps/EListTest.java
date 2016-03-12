package AListOps;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EListTest
{
	EList list = new AList0();
	//EList list = new AList1();
	//EList list = new AList2();
	//EList list = new LList1();
	//EList list = new LList2();

	@Before
	public void SetUp()
	{
		list.clear();
	}

	//==========================================
	// Init, toArray, size
	//==========================================
	@Test
	public void testInit_null()
	{
		int [] array = null;
		list.init(array);
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testInit_0()
	{
		int [] array = {};
		list.init(array);
		assertEquals(0, list.size());
		int[] exp = {};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testInit_1()
	{
		int [] array = {10};
		list.init(array);
		assertEquals(1, list.size());
		int[] exp = {10};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
	public void testInit_2()
	{
		int [] array = {10,20};
		list.init(array);
		assertEquals(2, list.size());
		int[] exp = {10,20};
		int[] act = list.toArray();
		assertArrayEquals(exp, act);
	}
	@Test
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
	@Test
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
	@Test
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
	@Test
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
	@Test
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

	@Test
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
	@Test
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
	@Test
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
	@Test
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
	@Test
	public void test_addEnd0()
	{
		int [] array = {};
		int [] checkArray = {11};
		list.init(array);
		list.addEnd(11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_addEnd1()
	{
		int [] array = {3};
		int [] checkArray = {3,11};
		list.init(array);
		list.addEnd(11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_addEnd2()
	{
		int [] array = {3,7};
		int [] checkArray = {3,7,11};
		list.init(array);
		list.addEnd(11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_addEnd_Many()
	{
		int [] array = {3,7,5,1,9,2};
		int [] checkArray = {3,7,5,1,9,2,11};
		list.init(array);
		list.addEnd(11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_addPos_0()
	{
		int [] array = {};
		int [] checkArray = {11};
		list.init(array);
		list.addPos(0,11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_addPos_1()
	{
		int [] array = {3};
		int [] checkArray = {3,11};
		list.init(array);
		list.addPos(1,11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_addPos_2()
	{
		int [] array = {3,7};
		int [] checkArray = {3,11,7};
		list.init(array);
		list.addPos(1,11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_addPos_MAny()
	{
		int [] array = {3,7,5,1,9,2};
		int [] checkArray = {3,7,11,5,1,9,2};
		list.init(array);
		list.addPos(2,11);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test (expected = NullPointerException.class) 
	public void test_delStart0()
	{
		int numb=0;
		int [] array = {};
		int [] checkArray = {3,7,11,5,1,9,2};
		list.init(array);
		int pos=list.delStart();

		assertEquals(numb, pos);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}@Test
	public void test_delStart1()
	{
		int numb=3;
		int [] array = {3};

		list.init(array);
		int pos=list.delStart();
		assertEquals(numb, pos);
	}@Test
	public void test_delStart2()
	{
		int check=3;
		int [] array = {3,7};
		int [] checkArray = {7};
		list.init(array);
		int pos=list.delStart();
		assertEquals(check, pos);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_delStart_Many()
	{
		int check=3;
		int [] array = {3,7,5,1,9,2};
		int [] checkArray = {7,5,1,9,2};
		list.init(array);
		int pos=list.delStart();
		assertEquals(check, pos);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test (expected = NullPointerException.class) 
	public void test_delEnd0()
	{
		int numb=2;
		int [] array = {};

		list.init(array);
		int pos=list.delEnd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_delEnd1()
	{
		int numb=2;
		int [] array = {2};

		list.init(array);
		int pos=list.delEnd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_delEnd2()
	{
		int numb=2;
		int [] array = {9,2};

		list.init(array);
		int pos=list.delEnd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_delEndMAny()
	{
		int numb=2;
		int [] array = {3,7,5,1,9,2};

		list.init(array);
		int pos=list.delEnd();
		assertEquals(numb, pos);
	}
	@Test (expected = NullPointerException.class) 
	public void test_delPos0()
	{
		int numb=5;
		int [] array = {};

		list.init(array);
		int pos=list.delPos(2);
		assertEquals(numb, pos);
	}
	@Test
	public void test_delPos1()
	{
		int numb=3;
		int [] array = {3};

		list.init(array);
		int pos=list.delPos(0);
		assertEquals(numb, pos);
	}
	@Test
	public void test_delPos2()
	{
		int numb=7;
		int [] array = {3,7};

		list.init(array);
		int pos=list.delPos(1);
		assertEquals(numb, pos);
	}
	@Test
	public void test_delPosMany()
	{
		int numb=5;
		int [] array = {3,7,5,1,9,2};

		list.init(array);
		int pos=list.delPos(2);
		assertEquals(numb, pos);
	}
	@Test (expected = NullPointerException.class) 
	public void test_getPos0()
	{
		int numb=0;
		int [] array = {};

		list.init(array);
		int pos=list.get(0);
		assertEquals(numb, pos);
	}
	@Test
	public void test_getPos1()
	{
		int numb=3;
		int [] array = {3};

		list.init(array);
		int pos=list.get(0);
		assertEquals(numb, pos);
	}
	@Test
	public void test_getPos2()
	{
		int numb=7;
		int [] array = {3,7};

		list.init(array);
		int pos=list.get(1);
		assertEquals(numb, pos);
	}
	@Test
	public void test_getPosMany()
	{
		int numb=9;
		int [] array = {3,7,5,1,9,2};

		list.init(array);
		int pos=list.get(4);
		assertEquals(numb, pos);
	}
	@Test (expected = NullPointerException.class) 
	public void test_setPos0()
	{
		int [] array = {};
		int [] checkArray = {};
		list.init(array);
		list.set(3,12);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_setPos1()
	{
		int [] array = {3};
		int [] checkArray = {12};
		list.init(array);
		list.set(0,12);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_setPos2()
	{
		int [] array = {3,7};
		int [] checkArray = {3,12};
		list.init(array);
		list.set(1,12);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_setPosMany()
	{
		int [] array = {3,7,5,8,9,2};
		int [] checkArray = {3,7,5,12,9,2};
		list.init(array);
		list.set(3,12);
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test (expected = NullPointerException.class) 
	public void test_min0()
	{
		int numb=1;
		int [] array = {};

		list.init(array);
		int pos=list.min();
		assertEquals(numb, pos);
	}
	@Test
	public void test_min1()
	{
		int numb=3;
		int [] array = {3};

		list.init(array);
		int pos=list.min();
		assertEquals(numb, pos);
	}
	@Test
	public void test_min2()
	{
		int numb=3;
		int [] array = {3,7};

		list.init(array);
		int pos=list.min();
		assertEquals(numb, pos);
	}
	@Test
	public void test_min_Many()
	{
		int numb=1;
		int [] array = {3,7,5,1,9,2};

		list.init(array);
		int pos=list.min();
		assertEquals(numb, pos);
	}
	@Test (expected = NullPointerException.class) 
	public void test_max0()
	{
		int numb=9;
		int [] array = {};

		list.init(array);
		int pos=list.max();
		assertEquals(numb, pos);
	}
	@Test
	public void test_max1()
	{
		int numb=3;
		int [] array = {3};

		list.init(array);
		int pos=list.max();
		assertEquals(numb, pos);
	}
	@Test
	public void test_max2()
	{
		int numb=7;
		int [] array = {3,7};

		list.init(array);
		int pos=list.max();
		assertEquals(numb, pos);
	}
	@Test
	public void test_maxMAny()
	{
		int numb=9;
		int [] array = {3,7,5,1,9,2};

		list.init(array);
		int pos=list.max();
		assertEquals(numb, pos);
	}
	@Test (expected = NullPointerException.class) 
	public void test_minInd0()
	{
		int numb=5;
		int [] array = {};

		list.init(array);
		int pos=list.minInd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_minInd1()
	{
		int numb=0;
		int [] array = {3};

		list.init(array);
		int pos=list.minInd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_minInd2()
	{
		int numb=0;
		int [] array = {3,7};

		list.init(array);
		int pos=list.minInd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_minInd_Many()
	{
		int numb=3;
		int [] array = {3,7,5,1,9,2};
		list.init(array);
		int pos=list.minInd();
		assertEquals(numb, pos);
	}
	@Test (expected = NullPointerException.class) 
	public void test_maxInd0()
	{
		int numb=4;
		int [] array = {};

		list.init(array);
		int pos=list.maxInd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_maxInd1()
	{
		int numb=0;
		int [] array = {3};

		list.init(array);
		int pos=list.maxInd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_maxInd2()
	{
		int numb=1;
		int [] array = {3,7};

		list.init(array);
		int pos=list.maxInd();
		assertEquals(numb, pos);
	}
	@Test
	public void test_maxIndMAny()
	{
		int numb=4;
		int [] array = {3,7,5,1,9,2};

		list.init(array);
		int pos=list.maxInd();
		assertEquals(numb, pos);
	}
	@Test  
	public void test_Rev0()
	{
		int [] array = {};
		int [] checkArray = {};
		list.init(array);
		list.reverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test 
	public void test_Rev1()
	{
		int [] array = {3};
		int [] checkArray = {3};
		list.init(array);
		list.reverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_Rev2()
	{
		int [] array = {3,7};
		int [] checkArray = {7,3};
		list.init(array);
		list.reverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_Rev_MAny()
	{
		int [] array = {3,7,5,1,9,2};
		int [] checkArray = {2,9,1,5,7,3};
		list.init(array);
		list.reverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_halfRev0()
	{
		int [] array = {};
		int [] checkArray = {};
		list.init(array);
		list.halfReverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_halfRev1()
	{
		int [] array = {3};
		int [] checkArray = {3};
		list.init(array);
		list.halfReverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_halfRev2()
	{
		int [] array = {3,7};
		int [] checkArray = {7,3};
		list.init(array);
		list.halfReverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_halfRev_MAny()
	{
		int [] array = {3,7,5,2,8,1,9};
		int [] checkArray = {8,1,9,2,3,7,5};
		list.init(array);
		list.halfReverse();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_sort0()
	{
		int [] array = {};
		int [] checkArray = {};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_sort1()
	{
		int [] array = {3};
		int [] checkArray = {3};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
	@Test
	public void test_sort2()
	{
		int [] array = {8,3};
		int [] checkArray = {3,8};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}

	@Test
	public void test_sort_Many()
	{
		int [] array = {3,7,5,1,9,2};
		int [] checkArray = {1,2,3,5,7,9};
		list.init(array);
		list.sort();
		int[] act = list.toArray();
		assertArrayEquals(checkArray, act);
	}
}
