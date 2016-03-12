package listOps;

public class AList2
{
	

	public static void main(String[] args)
	{
		ArrayListMet nobj = new ArrayListMet();
		
		int[] someArr = {1,4,7,23,66,2};
		int[] Arr = {11,22,33,44,55,66,77,88,99};
		
		nobj.init(someArr);
		nobj.print();
		System.out.println(nobj.size());
		//nobj.addEnd(8);;
		nobj.print();
	
	}
	
}
