package AListOps;

public class AList1 implements EList
{
	int[] array = new int[10];
	int top = 0;

	public AList1() 
	{

	}

	public AList1(int[] array)
	{
		init(array);
	}

	@Override
	public void init(int[] ini)
	{
		if(ini==null)
		{
			ini=new int[0];
		}

		for (int i=0; i<ini.length && i<array.length; i++)
		{
			array[i]=ini[i];
			top++;
		}
	}

	@Override
	public void clear()
	{
		top=0;
	}

	@Override
	public int size()
	{
		int sizeArray=0;

		sizeArray=top;

		return sizeArray;
	}

	@Override
	public void print()
	{
		for (int i=0;i<top;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("");
	}

	@Override
	public int[] toArray()
	{
		int [] newArray = new int[top];

		for(int i=0; i<top; i++)
		{
			newArray[i]=array[i];
		}

		return newArray;
	}

	@Override
	public void addStart(int val)
	{
		for (int i = top; i > 0 && i<array.length; i--) 
		{
			array[i]=array[i-1];
		}
		array[0]=val;

		top++;
	}

	@Override
	public void addEnd(int val)
	{
		array[top++]=val;
	}

	@Override
	public void addPos(int pos, int val)
	{
		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		else if (pos<=top && pos>=0)
		{
			top++;
			for (int i = top-1; i>pos; i--)
			{
				array[i]=array[i-1];
			}
			array[pos]=val;
		}
	}

	@Override
	public int delStart()
	{
		
		int start=0;
		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		else
		{
			start=array[0];
			top--;		
			for(int i=0; i<top;i++)
			{
				array[i]=array[i+1];
			}
		}
		return start;
	}

	@Override
	public int delEnd()
	{
		int end=0;

		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		else
		{
			top--;
			end=array[top];
		}

		return end;
	}

	@Override
	public int delPos(int pos)
	{
		int retPos=0;

		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		else
		{
			if(pos<top && pos>=0)
			{
				top--;
				retPos=array[pos];

				for(int i=pos; i<top; i++)
				{
					array[i]=array[i+1];
				}			
			}
		}

		return retPos;
	}

	@Override
	public int get(int pos)
	{
		int numb=0;
		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		if (pos<top && pos>=0)
		{
			numb=array[pos];
		}

		return numb;
	}

	@Override
	public void set(int pos, int val)
	{

		if(pos<top && pos>=0)
		{
			array[pos]=val;
		}
	}

	@Override
	public int min()
	{
		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		int min=0;
		min = array[0];

		for (int i=0; i<top; i++) 
		{
			if (array[i]<min)
			{
				min=array[i];
			}
		}
		return min;
	}

	@Override
	public int max()
	{
		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		int max=0;
		max = array[0];

		for (int i=0; i<top; i++) 
		{
			if (array[i]>max)
			{
				max=array[i];
			}
		}

		return max;
	}
	@Override
	public int minInd()
	{
		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		int minInd=0;
		int min=array[0];
		
		for (int i = 0; i<top;i++) 
		{			
			if (array[i]<min)
			{
				min=array[i];
				minInd=i;
			}
		}
		return minInd;
	}

	@Override
	public int maxInd()
	{
		if (top == 0) throw new ArrayIndexOutOfBoundsException();
		int maxInd=0;
		int max=0;
		max = array[0];

		for (int i = 0; i<top;i++) 
		{
			if (array[i]>max)
			{
				max=array[i];
				maxInd=i;
			}
		}
		return maxInd;
	}

	@Override
	public void reverse()
	{
		int [] newArray = new int[array.length];

		for (int i = 0, j = top-1; i < top; i++,j--)
		{
			newArray[i]=array[j];
		}
		array=newArray;
	}

	@Override
	public void halfReverse()
	{
		int temp=0;
		
		for (int i=0, j=top-top/2; i<top/2; j++, i++)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
	}

	@Override
	public void sort()
	{
		int perem=0;
		for(int i = 0; i <top - 1; i++)
		{
			for(int j = 0; j < top - i - 1; j++)
			{
				if(array[j] > array[j + 1])
				{
					perem=array[j];
					array[j]=array[j+1];
					array[j+1]=perem;		    		
				}
			}
		}
	}





}
