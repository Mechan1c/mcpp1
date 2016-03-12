package AListOps;

public class LList1 implements EList
{
	private Node root=null;
	public LList1() 
	{
	}
	public LList1(int[]ini)
	{
		init(ini);
	}
	public boolean isEmpty()
	{
		return(root==null);
	}
	class Node
	{
		public int data;
		public Node next;
		public Node(int val)
		{
			data = val;
		}
	}
	@Override
	public void addStart(int val)
	{
		Node newElement = new Node(val);
		newElement.next = root;
		root = newElement;

	}
	@Override
	public int delStart()
	{
		if (isEmpty()) throw new NullPointerException();
		int ret = root.data;
		root = root.next;
		return ret;
	}
	@Override
	public int size()
	{
		int size=0;
		Node current = root;
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
		Node current = root;
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
		root = null;
	}
	@Override
	public void print()
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void addEnd(int val)
	{
		Node newElement = new Node(val);

		if (root == null)          	
		{                          
			root = newElement;              
		} 
		else 
		{
			Node element = root;        
			while (element.next != null)           
			{
				element = element.next;                    
			}
			element.next=newElement;
		}
	}
	@Override
	public void addPos(int pos, int val)
	{
		if (pos>=0 && pos<=this.size())
		{
			Node newElement = new Node(val);

			if (root == null&&pos==0)          	
			{                          
				root = newElement;              
			} 
			else 
			{
				Node element = root;
				if(pos==0)
				{
					newElement.next = root;        
					root = newElement;  	
				}
				else
				{
					for(int i = 1; i<pos; i++)
					{
						element=element.next;
					}
					newElement.next=element.next;
					element.next=newElement;
				}
			}
		}
		else throw new NullPointerException();
	}
	@Override
	public int delEnd()
	{
		int ret;
		if (root == null) throw new NullPointerException(); 
		else 
		{
			Node element = root;  
			if (element.next==null)
			{
				ret = root.data;
				root=null;
			}
			else 
			{
				Node p = root;
				while(p.next.next != null)
				{
					p = p.next;
				}
				ret = p.next.data;
				p.next = null;
			}

		}
		return ret;
	}
	@Override
	public int delPos(int pos)
	{
		int delPos=0;

		if (root != null)          	
		{                          
			if(pos>=0 && pos<this.size())
			{
				Node element = root;

				if(pos==0)
				{
					delPos = element.data;
					root=element.next;
				}
				else
				{
					for(int i = 1; i<pos; i++)
					{
						element=element.next;
					}
					delPos = element.next.data;
					element.next=element.next.next;
				}
			}
		}
		return delPos;
	}
	@Override
	public int get(int pos) 
	{
		int numb=0;

		Node element = root;
		if (pos>=0 && pos<this.size())
		{
			for(int i = 0; i<pos; i++)
			{
				element=element.next;
			}

			numb=element.data;
		}

		return numb;
	}
	@Override
	public void set(int pos, int val)
	{
		Node element = root;
		if (pos>=0 && pos<this.size())
		{
			for(int i = 0; i<pos; i++)
			{
				element=element.next;
			}

			element.data=val;
		}
	}

	@Override
	public int min() 
	{
		int min = 0;
		if (root!=null)
		{
			Node element = root;
			min = element.data;
			while (element.next != null)         
			{
				element = element.next;
				if(element.data < min)
				{
					min=element.data;
				}
			}
		}
		return min;
	}

	@Override
	public int max()
	{
		int max = 0;
		if (root!=null)
		{
			Node element = root;
			max = element.data;
			while (element.next != null)         
			{
				element = element.next;
				if(element.data > max)
				{
					max=element.data;
				}
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
		if (root!=null)
		{
			Node element = root;
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
		}
		return minInd;
	}

	@Override
	public int maxInd()
	{
		int maxInd=0;
		int max = 0;
		int count=0;
		if (root!=null)
		{
			Node element = root;
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
		}
		return maxInd;
	}

	@Override
	public void reverse()
	{
		if (root!=null)
		{
			Node element = root;        

			while (element.next != null)         
			{
				Node temp = element.next;
				element.next=element.next.next;
				temp.next=root;
				root=temp;
			}
		}
	}

	@Override
	public void halfReverse()
	{
		if (root!=null)
		{


		}

	}

	@Override
	public void sort() 
	{

	}

}
