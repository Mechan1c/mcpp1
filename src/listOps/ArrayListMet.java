package listOps;

public class ArrayListMet
{
	int[] array;

	public void init (int[] arrInp)
	{
		this.array = arrInp;

	}
	public void init ()
	{
		int[] arr0 = {};
		this.array = arr0;

	}

	public void clear()
	{
		int[] arrOut = {};
		this.array = arrOut;
	}
	public int size()
	{
		int res = 0;
		for(int i:this.array)
		{
			res++;
		}

		return res;
	}
	public void print()
	{
		int [] arrInp= this.array;
		for(int i=0;i<arrInp.length;i++)
		{
			System.out.print(arrInp[i]+", ");
		}
		System.out.println();
	}

	public int[] toArray(int[] b) {
		int[] a = this.array;   
		int aLen = a.length;
		int bLen = b.length;
		int[] c= new int[aLen+bLen];
		System.arraycopy(a, 0, c, 0, aLen);
		System.arraycopy(b, 0, c, aLen, bLen);
		return c;
	}
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
	public void addEnd(int val)
	{
		int[] arrRes = new int[this.array.length+1];
		for(int i = 0; i < arrRes.length;i++)
		{
			arrRes[i] = this.array[i];
		}
		arrRes[arrRes.length-1]= val;
		this.array = arrRes;
	}
	public void addPos(int pos, int val)
	{
		int[] arrRes = new int[this.array.length+1];
		if(pos>=0 && pos<arrRes.length)
		{
			for(int i = 0; i <=pos;i++)
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

	public void delStart()
	{
		int[] arrRes = new int[this.array.length-1];
		for(int i = 0; i < arrRes.length;i++)
		{
			arrRes[i] = this.array[i+1];
		}
		this.array = arrRes;
	}

	public void delEnd()
	{
		int[] arrRes = new int[this.array.length-1];
		arrRes = this.array;
		this.array = arrRes;
	}
	public void delPos(int pos)
	{
		int[] arrRes = new int[this.array.length-1];
		if(pos>=0 && pos<arrRes.length)
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
	}

	public int get(int pos)
	{
		return this.array[pos];
	}

	public void set(int pos, int val)
	{
		this.array[pos] = val;
	}
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
	public void reverse()
	{
		int[] arrRes= new int [this.array.length];

		for (int j = arrRes.length-1,i = 0; j >=0 && i<arrRes.length; j--, i++)
		{
			arrRes[i]=this.array[j];
		}

		this.array = arrRes;
	}
	public void halfRev()
	{
		int[] arrRes= new int [this.array.length];

		for (int j = (arrRes.length-1)/2,i = 0; j >=0 && i< arrRes.length/2; j--, i++)
		{
			arrRes[i]=this.array[j];
		}
		for (int j = arrRes.length-1,i = (arrRes.length)/2; j >=(arrRes.length-1)/2 && i< arrRes.length; j--, i++)
		{
			arrRes[i]=this.array[j];
		}
		this.array = arrRes;
	}
	public void sooort()
	{
		int[] arrRes= new int [this.array.length];
		for (int i = 0; i < this.array.length; i++)
		{
			int max= this.array[0];
			int iter = 0;
			if (this.array[i]>max)
			{

				max = this.array[i];

				arrRes[iter]=max;
				iter++;
				max=arrRes[iter+1];

			}
		}

		this.array=arrRes;
	}
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


