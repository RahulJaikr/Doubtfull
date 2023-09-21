import java.util.AbstractCollection;
import java.util.Iterator;

interface Collection
{
	//boolean add(object obj);
	
	boolean addAll(Collection c);
	boolean remove(Object obj);
	boolean removeAll(AbstractCollection c);
	void clear();
	
	//boolean contains(object obj);
	boolean containsAll (Collection c);
	
	boolean isEmpty();
	
	int Size();
	
	Iterator iterator();

//interface List extneds Collection
//{
//	void add (int index,Object obj);
//	void addAll(int index, Colllcetion c);
//	
//	get (int index);
//	Object remove (int index);
//	object set(int index, Object newobj);
//	
//	int indexOf(Object obj);
//	int lastIndexOf(Object obj);
//}
//public class MethodCollection 
//{
//// Contain collection, List and Dequeue methods
//	void addFirst(Object obj);
//	void addLast(Object obj);
//	
//	object getFirst();
//	Object getLast();
//	
//	Object removeFirst();
//	Object removeLast();
	
}
