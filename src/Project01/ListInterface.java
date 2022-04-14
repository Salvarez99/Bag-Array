package Project01;

/**
 * Specifications on the design of operations of an ADT array. 
 * @author Stephen Alvarez
 * @version 1.0 
 */

public interface ListInterface {

	/*
	 * inserts an item at the end of the list of this bag
	 * @param Object
	 */
	public void insert(Object item);
	
	/*
	 * remove the item at the end of this bag
	 */
	public void removeLast();
	
	/*
	 * remove a random item at a random index in this bag
	 */
	public void removeRandom();
	
	/*
	 * get the index of the first occurrence of the item passed within this bag
	 * @param Object
	 * @return int
	 */
	public int get(Object item);
	
	/*
	 * get a reference to an item at position index of this bag
	 * @param int
	 * @return Object
	 */
	public Object get(int index);
	
	/*
	 * check how many items are in this bag
	 * @return int
	 */
	public int size();
	
	/*
	 * check to see if bag is empty
	 * @return Boolean
	 */
	public Boolean isEmpty();
	
	/*
	 * empty this bag
	 */
	public void makeEmpty();
}
