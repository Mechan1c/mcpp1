package AListOps;

public class ArrayListCheck
{
	int[] array;
	int top = 0;

	public void init (int[] arrInp)
	{
		int[] arrTmp = new int [10];

		if(arrInp.length<=10) 
		{
			for(int i = 0;i<arrInp.length;i++)
			{
				arrTmp[i]= arrInp[i];
			}
			top = arrInp.length;
			this.array = arrTmp;
		}

	}

	public void init ()
	{
		int[] arrTmp = new int [10];
		top = 0;
		this.array = arrTmp;
	}

	public void clear()
	{
		int[] arrOut = new int [10];
		this.array = arrOut;
		top=0;
	}
	public int size()
	{
		return top;
	}
	public void print()
	{
		for(int i=0;i<top;i++)
		{
			System.out.print(this.array[i]+", ");
		}
		System.out.println();
	}

	/*public int[] toArray(int[] b) {
		int[] a = this.array;   
		int aLen = a.length;
		int bLen = b.length;
		int[] c= new int[aLen+bLen];
		System.arraycopy(a, 0, c, 0, aLen);
		System.arraycopy(b, 0, c, aLen, bLen);
		return c;
	}*/

	public void addStart(int val)
	{

		for(int i = top-1; i >=0;i--)
		{
			this.array[i+1]=this.array[i];
		}
		this.array[0]=val;
		top++;
	}
	public void addEnd(int val)
	{
		this.array[top]=val;
		top++;
	}
	/*public void addPos(int pos, int val)
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
	}*/

	public void delStart()
	{
		this.array[0] = 0;
		for(int i = 0; i < top;i++)
		{
			this.array[i] = this.array[i+1];
		}
		top--;
	}

	public void delEnd()
	{
		this.array[top-1] = 0;
		top--;
	}
	/*public void delPos(int pos)
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
	}*/

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
		for (int i = 1; i < top; i++)
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
		for (int i = 1; i < top; i++)
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
		for (int i = 1; i < top; i++)
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
		for (int i = 1; i < top; i++)
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
		int[] arrRes= new int [top];

		for (int j = top-1,i = 0; j >=0 && i<top; j--, i++)
		{
			arrRes[i]=this.array[j];
		}
		for(int i = 0; i<top; i++ )
		{
			this.array[i]=arrRes[i];
		}
		
	}
	public void halfRev()
	{
		int[] arrRes= new int [top];

		for (int j = (arrRes.length-1)/2,i = 0; j >=0 && i< arrRes.length/2; j--, i++)
		{
			arrRes[i]=this.array[j];
		}
		for (int j = arrRes.length-1,i = (arrRes.length)/2; j >=(arrRes.length-1)/2 && i< arrRes.length; j--, i++)
		{
			arrRes[i]=this.array[j];
		}
		for(int i = 0; i<top; i++ )
		{
			this.array[i]=arrRes[i];
		}
	}
	
	public void sort()
	{

		int temp;
		for(int i=0; i < top; i++){

			for(int j=1; j < top-i; j++){
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


