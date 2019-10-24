
public interface StorageI <E>  {

	public boolean add (E value);
	public E get();		
	public void Clear();		// 2 3
	public boolean contains(E e);
	public boolean isEmpty();
	public void sort();		// 3
	public int size();		// 2 3
	public String getClassName();

}

