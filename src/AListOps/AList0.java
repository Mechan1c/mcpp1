package AListOps;

@SuppressWarnings("rawtypes")
public class AList0 implements EList, Comparable
{
	int[] array;
public static void main(String[]args)
{
	/*int[]arr1 ={14,22,13,0,2,8};
	int[]arr2 ={14,22,13,0,2,7};
	AList0 a1=new AList0(arr1);
	AList0 a2=new AList0(arr2);
	System.out.println(a1.equals(a2));
	System.out.println(a1.equals(a1));
	System.out.println(a1.compareTo(a2));
	System.out.println(a1.compareTo(a1));*/
}
				
	public AList0() 
	{
		array=new int[0];
	}

	public AList0(int[] array)
	{
		init(array);
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this==obj) return true;
		AList0 tmp=(AList0)obj;

		int[] arr1 = array;
		int[] arr2 = tmp.array;
		if (this.size()!=tmp.size()) return false;

		for(int i=0; i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i]) return false;
		}
		return true;
	}
	@Override
	public int compareTo(Object obj)
	{
		if(this==obj) return 0;
		AList0 tmp=(AList0)obj;

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
	@Override
	public void init(int[] ini)
	{
		if (ini == null)
		{
			ini = new int[0];
		}
		array= new int[ini.length];
		for (int i=0; i<ini.length; i++)
		{
			array[i]=ini[i];
		}
	}
	@Override
	public void clear()
	{
		int[] arrOut = {};
		this.array = arrOut;
	}
	@Override
	public int size()
	{
		int res = 0;
		for(int i:this.array)
		{
			res++;
		}

		return res;
	}
	@Override
	public void print()
	{
		int [] arrInp= this.array;
		for(int i=0;i<arrInp.length;i++)
		{
			System.out.print(arrInp[i]+", ");
		}
		System.out.println();
	}

	@Override
	public int[] toArray()
	{
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) 
		{
			newArray[i]=array[i];
		}

		return newArray;
	}
	@Override
	public void addStart(int val)
	{
		int[] arrRes = new int[this.array.length+1];
		arrRes[0]= val;
		for(int i = 1; i < arrRes.length;i++)
		{
			arrRes[i] = this.array[i-1];
		}
		this.array = arrRes;
	}
	@Override
	public void addEnd(int val)
	{
		int[] arrRes = new int[array.length+1];
		for(int i = 0; i < array.length;i++)
		{
			arrRes[i] = array[i];
		}
		arrRes[arrRes.length-1]= val;
		array = arrRes;
	}
	@Override
	public void addPos(int pos, int val)
	{
		int[] arrRes = new int[this.array.length+1];
		if(pos>=0 && pos<arrRes.length)
		{
			for(int i = 0; i <pos;i++)
			{
				arrRes[i] = this.array[i];
			}
			arrRes[pos] = val;
			for(int i = pos+1; i <arrRes.length;i++)
			{
				arrRes[i] = this.array[i-1];
			}
		}
		else throw new IndexOutOfBoundsException("Position out of Array bounds");
		this.array = arrRes;
	}

	@Override
	public int delStart()
	{
		int ret = array[0];
		int[] arrRes = new int[this.array.length-1];
		for(int i = 0; i < arrRes.length;i++)
		{
			arrRes[i] = this.array[i+1];
		}
		this.array = arrRes;
		return ret;
	}

	@Override
	public int delEnd()
	{
		int ret = array[array.length-1];
		int[] arrRes = new int[this.array.length-1];
		arrRes = this.array;
		this.array = arrRes;
		return ret;
	}

	@Override
	public int delPos(int pos)
	{
		int ret = array[pos];
		int[] arrRes = new int[this.array.length-1];
		if(pos>=0 && pos<array.length)
		{
			for(int i = 0; i <pos;i++)
			{
				arrRes[i] = this.array[i];
			}

			for(int i = pos+1; i <arrRes.length;i++)
			{
				arrRes[i] = this.array[i-1];
			}
		}
		else throw new IndexOutOfBoundsException("Position out of Array bounds");
		this.array = arrRes;
		return ret;
	}

	@Override
	public int get(int pos)
	{
		return this.array[pos];
	}

	@Override
	public void set(int pos, int val)
	{
		this.array[pos] = val;
	}
	@Override
	public int min()
	{
		int min = this.array[0];
		for (int i = 1; i < this.array.length; i++)
		{
			if (this.array[i]<min)
			{
				min = this.array[i];
			}
		}
		return min;
	}
	@Override
	public int max()
	{
		int max = this.array[0];
		for (int i = 1; i < this.array.length; i++)
		{
			if (this.array[i]>max)
			{
				max = this.array[i];
			}
		}
		return max;
	}
	@Override
	public int minInd()
	{
		int min = this.array[0];
		int minIn = 0;
		for (int i = 1; i < this.array.length; i++)
		{
			if (this.array[i]<min)
			{
				minIn = i;
			}
		}
		return minIn;
	}
	@Override
	public int maxInd()
	{
		int max = this.array[0];
		int maxIn = 0;
		for (int i = 1; i < this.array.length; i++)
		{
			if (this.array[i]>max)
			{
				maxIn = i;
			}
		}
		return maxIn;
	}
	@Override
	public void reverse()
	{
		int[] arrRes= new int [this.array.length];

		for (int j = arrRes.length-1,i = 0; j >=0 && i<arrRes.length; j--, i++)
		{
			arrRes[i]=this.array[j];
		}

		this.array = arrRes;
	}
	@Override
	public void halfReverse()
	{
		final int len = array.length / 2;
		final int offset = array.length - len;
		for (int i = 0; i < len; i++) {
			int temp = array[i];
			array[i] = array[offset + i];
			array[offset + i] = temp;
		}
	}
	@Override
	public void sort()
	{

		int temp;
		for(int i=0; i < this.array.length-1; i++){

			for(int j=1; j < this.array.length-i; j++){
				if(this.array[j-1] > this.array[j]){
					temp=this.array[j-1];
					this.array[j-1] = this.array[j];
					this.array[j] = temp;
				}
			}
		}

	}

	public int[] getArray()
	{
		return array;
	}


}


