

/**
 * FastSort.java
 *FastSort uses Custom Array list to implement the below functions
 *	public boolean add(E e);	// 2
 *	public E get();		
 *	public void clear();		// 2 3
 *	public boolean contains(E e);
 *	public boolean isEmpty();
 *	public void sort();		// 3
 *	public int size();		// 2 3
 *	public String getClassName();
  * Version:
 *     1.0
 *
 * Revisions:
 *     1st edition
 */

/**
 *
 * @author      Prakash Suresh Mishra
 * @author      Jaideep Bhide
 */



public class FastSort {

	public static void main(String[] args) {
		
		CustomArrayList<String> arrList = new CustomArrayList<String>();
		CustomArrayList<Integer> arrListInt = new CustomArrayList<Integer>();
		CustomArrayList<Float> arrListfloat = new CustomArrayList<Float>();
		CustomArrayList<Double> arrListDouble = new CustomArrayList<Double>();

		arrList.add("String1");
		System.out.println("After adding String1 "+arrList);

		
		arrList.add("String2");
		System.out.println("After adding String2 "+arrList);
		
		arrList.add("String3");
		System.out.println("After adding String3 "+arrList);
		
		System.out.println();
		System.out.println("Use Get with no paramters to get complete list "+arrList.get());
		System.out.println("Use Get with index paramter to get value at index position "+arrList.get(1));

		
		arrListInt.add(30);
		System.out.println(""+arrListInt);

		arrListInt.add(4);
		System.out.println(""+arrListInt);

		arrListInt.add(20);
		System.out.println(""+arrListInt);

		arrListInt.add(10);
		System.out.println(""+arrListInt);
		
		int position = 2;
		Object getElement = arrListInt.get(position);
		System.out.println("Element at index " +position+ " is " +getElement );
		
		System.out.println("Checks if the list contains a particular value is : T/F" + arrListInt.contains(30));

		System.out.println("Checks if the list is Empty : T/F" + arrListInt.isEmpty());
		
		arrListInt.sort();
		System.out.println("Sorted list is "+arrListInt);

		int Size = arrListInt.size();
		System.out.println("Size of the list is "+Size);

		String Classname = arrList.getClassName();
		System.out.println("Class name is " + Classname);
		
		arrList.Clear();
		
    }


}
