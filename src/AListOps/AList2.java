package AListOps;

public class AList2 implements EList
{
	int[] array;
	int start;
	int end;

	public AList2() 
	{
		array=new int[10];
		start = 15;
		end = 15;
	}

	public AList2(int[] array)
	{
		start = 15;
		end = 15;
		init(array);
	}

	@Override
	public void init(int[] ini)
	{
		if (ini == null)
		{
			ini = new int[0];
		}
		if(ini.length == 1)
		{
			end+=1;
		}
		array = new int[30];
		end+=ini.length/2;
		start= end -ini.length;


		for (int i=start,j=0; i<end; i++,j++)
		{
			array[i]=ini[j];
		}
	}
	@Override
	public void clear()
	{
		end=5;
		start = 5;
		array = new int[30];
	}
	@Override
	public int size()
	{
		return end-start;
	}
	@Override
	public void print()
	{
		int [] arrInp= array;
		for(int i=0;i<arrInp.length;i++)
		{
			System.out.print(arrInp[i]+", ");
		}
		System.out.println();
	}

	@Override
	public int[] toArray()
	{
		int[] newArray = new int[this.size()];
		for (int i = start,j=0; i < end; i++,j++) 
		{
			newArray[j]=array[i];
		}
		return newArray;
	}
	@Override
	public void addStart(int val)
	{
		start--;
		array[start] = val;

	}
	@Override
	public void addEnd(int val)
	{
		end++;
		array[end-1]=val;
	}
	@Override
	public void addPos(int pos, int val)
	{
		if (end-start == 0)
		{
			end++;
			array[start] = val;
		}
		else if(start+pos>=start && start+pos<end)
		{
			end++;
			for(int i=end-1; i>start+pos; i--)
			{
				array[i]= array[i-1];
			}

		}
		else throw new IndexOutOfBoundsException("Position out of Array bounds");
		array[start+pos] = val;

	}

	@Override
	public int delStart()
	{
		if (end-start == 0) throw new ArrayIndexOutOfBoundsException();
		int res= array[start];
		array[start] =0;
		start++;
		return res;
	}

	@Override
	public int delEnd()
	{
		if (end-start == 0) throw new ArrayIndexOutOfBoundsException();
		int res= array[end-1];
		array[end-1] =0;
		end--;
		return res;
	}

	@Override
	public int delPos(int pos)
	{
		if (end-start == 0) throw new ArrayIndexOutOfBoundsException();
		int posA=start+pos;
		int res = array[posA];
		if(posA>=0 && posA<end)
		{
			for(int i = posA; i <end;i++)
			{
				array[i] = array[i+1];
			}
		}
		else throw new IndexOutOfBoundsException("Position out of Array bounds");
		array[end-1] = 0;
		end--;
		return res;
	}

	@Override
	public int get(int pos)
	{
		if (end-start==0) throw new ArrayIndexOutOfBoundsException();
		return array[start+pos];
	}

	@Override
	public void set(int pos, int val)
	{
		if (this.size()==0) throw new ArrayIndexOutOfBoundsException();
		array[start+pos] = val;
	}

	@Override
	public int min()
	{
		if (end-start == 0) throw new ArrayIndexOutOfBoundsException();
		int min = array[start];
		for (int i = start+1; i < end; i++)
		{
			if (array[i]<min)
			{
				min = array[i];
			}
		}
		return min;
	}
	@Override
	public int max()
	{
		if (end-start == 0) throw new ArrayIndexOutOfBoundsException();
		int max = array[start];
		for (int i = start+1; i < end; i++)
		{
			if (array[i]>max)
			{
				max = array[i];
			}
		}
		return max;
	}
	@Override
	public int minInd()
	{
		if (end-start == 0) throw new ArrayIndexOutOfBoundsException();
		int min = array[start];
		int minIn = start;
		for (int i = start+1; i < end; i++)
		{
			if (array[i]<min)
			{
				minIn = i;
				min = array[i];
			}
		}
		return minIn-start;
	}
	@Override
	public int maxInd()
	{
		if (end-start == 0) throw new ArrayIndexOutOfBoundsException();
		int max = array[start];
		int maxIn = start;
		for (int i = start+1; i < end; i++)
		{
			if (array[i]>max)
			{
				maxIn = i;
				max = array[i];
			}
		}
		return maxIn-start;
	}
	@Override
	public void reverse()
	{
		int[] arrRes= new int [this.size()];

		for (int j = end-1,i = 0; j >=0 && i<arrRes.length; j--, i++)
		{
			arrRes[i]=array[j];
		}
		for(int i =0,j=start;i<arrRes.length;i++,j++)
		{
			array[j] = arrRes[i];
		}
	}

	@Override
	public void halfReverse()
	{

		final int len = start+this.size() / 2;
		final int offset = start+this.size() - len;
		for (int i = start; i < len; i++) {
			int temp = array[i];
			array[i] = array[offset + i];
			array[offset + i] = temp;
		}
	}
	@Override
	public void sort()
	{
		int temp;
		for(int i=start; i < end-1; i++){

			for(int j=start+1; j < end; j++){
				if(array[j-1] > array[j]){
					temp=array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}


