package AListOps;

import java.util.Iterator;

public class LList1SA
{

	class Node
	{
		int data;
		Node next = null;

		public Node (int val)
		{
			data = val;
		}

	}

	Node root = null;

	public Iterator iterator() {
		return new XIter();
	}


	/////////////////////
	// CLASS ITERATOR
	/////////////////////


	class XIter implements Iterator <Integer>
	{

		Node index;

		public XIter ()
		{
			index = root;
		}

		@Override
		public Integer next() 
		{	
			int data = index.data;
			index = index.next;
			return data;				
		}

		@Override
		public boolean hasNext()
		{	
			return (index!=null);
		}
	}

	/////////////////////
	// END OF ITERATOR
	/////////////////////








	// OK
	@Override
	public void addStart(int val) {
		if (root == null)
		{
			root = new Node (val);
			//	System.out.println("ROOT: "+root);
			return;
		}

		Node tmp = new Node(val);
		// вставляем нашу ноду Н между началом и первой
		// значение некст вставляемой ноды приравниваем рут, так как он ссылается на первую ноду
		tmp.next = root;
		//	System.out.println("NEXT: "+tmp.next);

		// рут приравниваем адрес нашей вставляемой ноды
		root = tmp;

	}
	// OK
	@Override
	public void addEnd(int val) {

		// созздаем объект без привязки к месту
		Node tmp = new Node(val);

		// если рут = нулл, то это значт, что объектов вообще нет и наша емп
		// будет единственной, поэтому приравниваем рут ссылку на нашу емп
		if(root == null)
		{
			root = tmp;
			return;
		}


		// создаем ноду для перебора
		Node rez = root;

		// пока некст текущен не равен нулю ( это значит что текущая будет
		// последней )
		while (rez.next != null)
		{
			// адрес ноды = следующая нода
			rez = rez.next;
		}
		// циклом дошли до последней ноды у которой next == null
		// приравниваем rez.next значение нашей созданной ноды tmp
		rez.next = tmp;
	}

	// OK 
	@Override
	public void init(int[] ar) {

		if(ar == null)
		{
			ar = new int[0];
		}

		clear();
		// 5,48,0,-8,17,24,70
		// len = 7
		//  i = 6
		for (int i = ar.length-1; i >= 0 ; i--)
		{
			//System.out.print(ar[i]+" ");
			addStart(ar[i]);
		}

	}

	// OK
	@Override
	public int size() 
	{
		int ret = 0;
		Node tmp = root;
		while (tmp != null)
		{
			ret++;
			tmp = tmp.next;
		}
		return ret;
	}

	// OK
	@Override
	public int[] toArray() {
		/*int ret = 0;

		Node tmp = root;

		while (tmp.next != null)
		{
			ret++;
			tmp = tmp.next;
		}
		 */

		int[] arr = new int[size()]; 

		Node tmp2 = root;

		int i = 0;
		while (tmp2 != null)
		{
			arr[i] = tmp2.data;
			tmp2 = tmp2.next;
			i++;
		}
		return arr;
	}

	// OK
	@Override
	public void clear() {
		root = null;

	}

	// OK
	@Override
	public void print() {
		System.out.println("\nOBJECT IS: ");

		Node tmp = root;
		//System.out.println(root);

		while (tmp!=null)
		{
			//System.out.println(tmp);
			System.out.print(tmp.data+" ");
			tmp = tmp.next;
		}
		System.out.println("\n");
	}

	/*@Override
	public void addEnd(int val) {

	}
	 */



	@Override
	public void addPos(int pos, int val) {

		if (root == null || pos > size() || pos < 0)
			throw new IllegalArgumentException();


		Node x = new Node(val);
		Node tmp = null;
		Node n = root;
		int index = 0;

		if (pos == 0)
		{
			addStart(val);
			return;
		}

		while (n != null)
		{
			if (index == pos-1)
			{

				tmp = n.next;
				n.next = x;
				x.next = tmp;

			}
			index++;
			n = n.next;
		}


	}

	/// OK 
	@Override
	public int delEnd() {

		if (root == null )
			throw new IllegalArgumentException();

		int ret = 0;

		Node n = root;

		// проверяем если у нас 1 элемент то 
		if (n.next == null)
		{
			ret = n.data;
			// берем его дата и обнуляем рут
			root=null;
			return ret;
		}

		while (n != null)
		{
			if (n.next.next == null)
			{
				ret = n.data;
				n.next = null;
			}
			n = n.next;
		}

		return ret;
	}

	// OK
	@Override
	public int delStart() {

		if (root == null)
			throw new IllegalArgumentException();

		Node per = root;
		Node ttmp = per.next;
		root = ttmp;

		return 0;
	}

	// OK
	@Override
	public int delPos(int pos) {

		if (root == null || pos > size() || pos < 0)
			throw new IllegalArgumentException();

		Node n = root;
		int index = 0;
		while (n != null)
		{
			if(n.next == null)
			{
				int ret = n.data;
				root = null;
				return ret;

			}

			if (index == pos-1)
			{
				/*	System.out.println("N: "+n.data);
				System.out.println("N NEXT: "+n.next.data);*/
				n.next = n.next.next;
				return n.data;
			}
			index++;
			n=n.next;
		}


		return 0;
	}

	// OK
	@Override
	public int max() {

		if (root == null)
			throw new IllegalArgumentException();

		Node n = root;
		int max = n.data;

		while (n.next != null)
		{
			if (n.data > max)
			{
				max = n.data;
			}
			n = n.next;
		}
		return max;
	}

	// OK
	@Override
	public int min() {

		if (root == null)
			throw new IllegalArgumentException();

		Node n = root;
		int max = n.data;

		while (n.next != null)
		{
			if (n.data < max)
			{
				max = n.data;
			}
			n = n.next;
		}
		return max;
	}

	// OK
	@Override
	public int maxIndex() {
		if (root == null)
			throw new IllegalArgumentException();

		// {5,48,0,-8,17,24,70}; 
		Node n = root;
		int max = n.data;
		int index = 0;
		int maxIndex = 0;
		do 
		{
			if (n.data > max)

			{
				/*System.out.println("MAX:"+max);
				System.out.println("N.NATA: "+n.data);*/
				maxIndex = index;
				max = n.data;
				/*System.out.println("NEW MAX:"+max);*/
			}
			index++;
			n = n.next;
		} 
		while (n != null);
		return maxIndex;
	}

	// OK
	@Override
	public int minIndex() {

		if (root == null)
			throw new IllegalArgumentException();

		Node n = root;
		int min = n.data;
		int index = 0;
		int minIndex = 0;
		do 
		{
			if (n.data < min)
			{
				minIndex = index;
			}
			index++;
			n = n.next;
		} 
		while (n != null);
		return minIndex;
	}

	@Override
	public void sort() {

		/*Node n = root;

		while (n!= null)
		{
			while (n.next!= null)
			{
				if (n.data > n.next.data)
				{
					System.out.println(n.data+" > "+n.next.data);
					int tmp = n.data;
					n.data = n.next.data;
					n.next.data = tmp;
				}
				n=n.next;
			}
			n=n.next;
		}*/


		if ( size() == 0 || size()==1 ) return;
		Node i = root;
		while (i.next != null) /*находим последний элемент*/
		{
			i=i.next;
		}

		Node j, temp;
		while( i != root )//пока i не первый элемент
		{
			if(root.data > root.next.data)
			{
				temp = root;
				root = root.next;
				temp.next = root.next;
				root.next = temp;
				if (root == i)
				{
					i = root.next;
				}
			}

			j = root;
			while( i != j && j.next != i )//сравниваются +1 и +2 элементы
			{
				if(j.next.data > j.next.next.data)
				{
					temp = j.next.next.next;
					j.next.next.next = j.next;
					j.next = j.next.next;
					j.next.next.next = temp;//смещение, это бывший следующий элемент
					if ( j.next == i )
					{
						i = j.next.next;
					}
				}
				j=j.next;
			}

			j = root;
			while (j.next != i) /*ищем j, который предшествует i */
			{
				j=j.next;
			}
			i = j; // сдвигаем i на 1 ближе к root /
		}
	}





	@Override
	public void reverse() {

		Node n= root;
		Node tmp = null;

		while (n!=null)
		{
			addStart(n.data);
			tmp=n;
			n=n.next;

		}
		int index =0;
		Node m= root;
		while (m!=null)
		{
			if (index == size()/2-1)
			{
				m.next = null;
			}
			index++;
			m = m.next;


		}





	}

	@Override
	public void halfReverse() {

		int[] ar = toArray();
		int[] tmp = new int[ar.length];

		for (int i = 0, j = ar.length/2; i < ar.length/2; i++, j++)
		{
			tmp[i] = ar[j];
		}

		for (int i = ar.length/2, j =0; i < ar.length; i++, j++)
		{
			tmp[i] = ar[j];
		}


		ar = tmp;		
		init(ar);

		//		Node n = root;

		/*
		int size = size()/2;
		int i = 0;

		while (i < size) 
		{
			addEnd(n.data);
			i++;
			n = n.next;
		}

		int j = 0;
		while (j < size)
		{
			addPos(size, n.data);
			j++;
			size--;
		}*/




	}

	@Override
	public int get(int pos) {

		if (root == null || pos <0 || pos > size())
			throw new IllegalArgumentException();

		int ret = 0; 
		Node n = root;
		int index = 0;

		do 
		{
			if (index == pos)
			{
				ret = n.data;
				//System.out.println("catched!");
			}
			n = n.next;
			index++;
		}
		while (n != null);


		return ret;
	}

	@Override
	public void set(int pos, int val) {

		if (root == null || pos <0 || pos > size())
			throw new IllegalArgumentException();

		Node n = root;
		int index = 0;



		while (n!= null)
		{
			if (index == pos)
			{
				n.data = val;
			}
			n = n.next;
			index++;
		}

	}


}
