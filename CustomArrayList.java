
public class CustomArrayList <E> implements StorageI {
	
	private int inititalSize = 10;
	private static int currentSize;	
	private Object[] CustomArrayList = new Object[inititalSize];
	private E temp ;
	int count=0;

	
	
	public void changeSize(int currentSize)
	{
		
		/** Size
		 *   Dynamically increases the size of an array List.
		 *   
		 *   @param - Currentsize of the list
		 *   
		 */

		
		temp=(E) CustomArrayList.clone();
		CustomArrayList = new CustomArrayList[2 * currentSize];
		System.arraycopy(temp,0,CustomArrayList,0,currentSize);		
	}

	public int size() {

		/** Size
		 *   returns size.
		 */
		return count;
	}
	
	public Object get(int index) {

		/** get
		 *  
		 * Iterates over the list and
		 * returns the element at the index
		 *   
		 *   @index = The index value from which the data is to be obtained
		 *   returns size.
		 */
		int iterator=0;

		while(iterator<index) {
			iterator++;
		}
		return CustomArrayList[iterator];
	}

	
	public E get() {

		/** get
		 *  
		 * Iterates over the list and
		 * returns the element at the index
		 *    
		 *   returns size.
		 */
		return (E) this.toString();
	}

	
	
	public boolean contains(Object e) {

		/** contains
		 *  
		 * Iterates over the list and
		 * returns the element at the index
		 *    
		 *  @param - Object e that is to be found out.
		 */
		int iterator=0;
		
		while(iterator<count && CustomArrayList[iterator]!=e) {
			iterator++;
		}
		if (iterator>count)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public void Clear(){


		/** Clear
		 *  
		 *Clears the List
		 *    
		 */

		
		if(isEmpty())
		{
			System.out.println("Empty List");
			
		}
			else
		{
				CustomArrayList =null;
				System.out.println("Array List is cleared");
			
		}
		
	}
	
	public boolean isEmpty() {

		   /**
			 *    isEmpty
			 *   Checks if the current list is empty     
			 */

		if (CustomArrayList[0]==null)
			return true;
		else
			return false;
	}

	
	public void sort(){
		
		/** return the sorted list.
		 */
		if(this.getClassName().equals("Integer") || this.getClassName().equals("Float") || this.getClassName().equals("Double"))
		System.out.println("Sorted array is" + this);
		else
			System.out.println("String List cannot be sorted");
			
		
	}

	public String getClassName(){

		   /**
			 *    getClassName
			 *   returns the class's simple name i.e. Integer/String/Double/Float
			 *       
			 */

		
		String Classname = CustomArrayList[0].getClass().getSimpleName();
		return Classname; 
	}

	
	
	public boolean add (Object value)


	   /**
		 *    add
		 *   Checks if the object type, in case of String
		 *   the element will be appended at the end
		 *   or else the element will be inserted in the
		 *   ascending order.
		 *       
		 */

	
	{
		int index=0;

		currentSize = CustomArrayList.length;
		
		if(count==CustomArrayList.length)
		{
			changeSize(currentSize);
		}
					
		if(count==0)
		{
		CustomArrayList[index] = value;
		count = count + 1;
		}
		else if(count>0)
		{
		String Classname = CustomArrayList[0].getClass().getSimpleName(); 
		if (Classname.equals("Integer") || Classname.equals("Float") || Classname.equals("Double"))
			{
			index = count;
			int first = 0;
			
			while(index>first && ( Integer.valueOf(value.toString()) < Integer.valueOf(CustomArrayList[index-1].toString())))				
			{
				CustomArrayList[index] = CustomArrayList[index-1];
				index=index-1;
			}
				CustomArrayList[index] = value;
				count = count + 1;
			}
			else
			{
				CustomArrayList[count] = value;
				count = count + 1;
			}
		}	
		return true;	
	}	
	
	public String toString(){
		
		/** toString
		 *  
		 *  Overrides tostring method of Java class
		 *  to print he list instead of object reference. 
		 *    
		 *   return Strings with all data of the list.
		 */
		
		if(isEmpty())
		{
			System.out.println("The List is empty");
			return null;
		}
		else
		{
		String Listdata="";
		for (int i =0;i<CustomArrayList.length;i++)
		{
			if(CustomArrayList[i]!=null)
			Listdata = Listdata + " -- > " + CustomArrayList[i];
			
		}
		return Listdata;
		}
	}
	
	
}
