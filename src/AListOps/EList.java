package AListOps;


public interface EList
{
	 void init(int[] ini);
	 void clear();
	 int size();
	 void print();
	 int[] toArray();

	 void addStart(int val);
	 void addEnd(int val);
	 void addPos(int pos, int val);
	 int delStart();
	 int delEnd();
	 int delPos(int pos);
	
	 int get(int pos);
	 void set(int pos, int val);

	 int min();
	 int max();
	 int minInd();
	 int maxInd();

	 void reverse();
	 void halfReverse();
	 void sort();
}
