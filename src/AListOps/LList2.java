package AListOps;

public class LList2 implements EList
{
	private Node first=null;
	private Node last=null;
	public LList2() 
	{
	}
	public LList2(int[]ini)
	{
		init(ini);
	}
	public boolean isEmpty()
	{
		return(first==null);
	}
	class Node
	{
		public int data;

		public Node next;
		public Node prev;

		public Node(int val)
		{
			data = val;
		}
	}
	@Override
	public void addStart(int val)
	{
		Node nEl = new Node(val);
		if (isEmpty()) 
		{
			last = nEl;
			first = nEl;
		}
		else
		{
			first.prev=nEl;
			nEl.next = first;
			first=nEl;
		}
	}
	@Override
	public void addEnd(int val)
	{
		Node nEl = new Node(val);

		if (first == null)          	
		{                          
			first = nEl;   
			last=nEl;
		} 
		else 
		{
			last.next=nEl;
			nEl.prev=last;
		}
		last=nEl;
	}

	@Override
	public int size()
	{
		int size=0;
		Node current = first;
		while(current!=null)
		{
			size++;
			current = current.next;
		}
		return size;
	}
	@Override
	public int[] toArray()
	{
		int[] ret = new int[size()];
		int i =0;
		Node current = first;
		while(current!=null)
		{
			ret[i]=current.data;
			current=current.next;
			i++;
		}
		return ret;
	}
	@Override
	public void init(int[] inp)
	{
		if(inp==null)
		{
			inp=new int[0];
		}

		for(int i=inp.length-1; i>=0;i--)
		{
			addStart(inp[i]);
		}
	}
	@Override
	public void clear()
	{
		first = null;
		last=null;
	}
	@Override
	public void print()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void addPos(int pos, int val)
	{
		if (pos>=0 && pos<=this.size())
		{
			Node newElement = new Node(val);

			if (first == null&&pos==0)          	
			{                          
				addStart(val);
			} 
			else 
			{
				Node element = first;
				if(pos==0)
				{
					addStart(val);
				}
				else if (pos==this.size())
				{
					addEnd(val);
				}
				else
				{
					for(int i = 1; i<pos; i++)
					{
						element=element.next;
					}
					newElement.next=element.next;
					newElement.prev=element;
					element.next=newElement;
					element.next.next.prev=newElement;
				}
			}
		}
		else throw new NullPointerException();
	}
	@Override
	public int delStart()
	{
		if (isEmpty()) throw new NullPointerException();
		int ret = first.data;
		if (first==last)
		{

			first=null;
			last=null;
		}
		else
		{
			first = first.next;
			first.prev=null;
		}
		return ret;
	}
	@Override
	public int delEnd()
	{
		int ret;
		if (first == null) throw new NullPointerException(); 
		else 
		{
			if (first==last)
			{
				ret = first.data;
				first=null;
				last=null;
			}
			else 
			{
				ret = last.data;
				last=last.prev;
				last.next=null;

			}

		}
		return ret;
	}
	@Override
	public int delPos(int pos)
	{
		int res;
		if (first == null) throw new NullPointerException();
		if(pos<0 && pos>=this.size()) throw new NullPointerException();

		Node element = first;

		if(pos==0)
		{
			res=delStart();
		}
		else if(pos==this.size()-1)
		{
			res=delEnd();
		}
		else
		{
			for(int i = 1; i<pos; i++)
			{
				element=element.next;
			}
			res = element.next.data;
			element.next.next.prev = element;
			element.next=element.next.next;
		}		
		return res;
	}
	@Override
	public int get(int pos) 
	{
		int numb=0;

		Node element = first;
		if (pos<0 && pos>=this.size()) throw new NullPointerException();
		for(int i = 0; i<pos; i++)
		{
			element=element.next;
		}

		numb=element.data;
		return numb;
	}
	@Override
	public void set(int pos, int val)
	{
		Node element = first;
		if (pos<0 && pos>=this.size())throw new NullPointerException();	
		for(int i = 0; i<pos; i++)
		{
			element=element.next;
		}
		element.data=val;		
	}

	@Override
	public int min() 
	{
		int min = 0;
		if (first == null) throw new NullPointerException();
		Node element = first;
		min = element.data;
		while (element.next != null)         
		{
			element = element.next;
			if(element.data < min)
			{
				min=element.data;
			}
		}

		return min;
	}

	@Override
	public int max()
	{
		int max = 0;
		if (first == null) throw new NullPointerException();
		Node element = first;
		max = element.data;
		while (element.next != null)         
		{
			element = element.next;
			if(element.data > max)
			{
				max=element.data;
			}
		}		
		return max;
	}

	@Override
	public int minInd() 
	{
		int minInd=0;
		int min = 0;
		int count=0;
		if (first == null) throw new NullPointerException();
		Node element = first;
		min = element.data;
		while (element.next != null)         
		{
			count++;
			element = element.next;
			if(element.data < min)
			{
				min=element.data;
				minInd=count;
			}
		}
		return minInd;
	}

	@Override
	public int maxInd()
	{
		int maxInd=0;
		int max = 0;
		int count=0;
		if (first == null) throw new NullPointerException();
		Node element = first;
		max = element.data;
		while (element.next != null)         
		{
			count++;
			element = element.next;
			if(element.data > max)
			{
				max=element.data;
				maxInd=count;
			}
		}
		return maxInd;
	}

	@Override
	public void reverse()
	{
		if (first == null) return;
		Node element = first;        

		while (element.next != null)         
		{
			Node temp = element.next;
			element.next=element.next.next;
			temp.next=first;
			first=temp;
		}		
	}

	@Override
	public void halfReverse()
	{
		if (first == null) return;
		if (first == last) return;
		Node element = first;    
		for(int i=0;i<=(this.size()/2-1);i++)
		{
			element=element.next;
		}
		if(this.size()%2==0)
		{		
			first.prev=element.prev;
			element.prev.next=null;
			last.next=first;
			element.prev=null;
			last=element.prev;
			first=element;

		}
		else
		{
			int tmp=delPos(this.size()/2);
			halfReverse();
			addPos(this.size()/2,tmp);
		}
	}

	@Override
	public void sort() 
	{
		if (first == null) return;
		if (first == last) return;
		else
		{
			Node current = first;
			boolean swapDone = true;
			while (swapDone)
			{
				swapDone = false;
				while (current != null)
				{
					if (current.next != null && current.data>current.next.data)
					{
						int tempDat = current.data;
						current.data=current.next.data;
						current.next.data=tempDat;
						swapDone = true;
					}
					current = current.next;
				}
				current = first;
			}
		}
	}	
}
