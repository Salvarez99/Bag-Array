package Project01;
import java.util.Random;

/**
 * Implementations of operations of an ADT list.
 * @author Stephen Alvarez
 * @version 1.0 
 *
 */

public class Bag {

	private Object[] bagArray;
	
	public Bag(){
		bagArray = new Object[100];
	};
	
	/*
	 * inserts an item at the end of the list of this bag
	 * @param Object
	 */
	public void insert(Object item) throws ListIndexOutOfBoundsException{
		if (this.isEmpty() == true){//bag is empty
				bagArray[0] = item;
			}

		else if(bagArray[this.size()] == null)
			//this.size() < bagArray.length - 1 &&
			bagArray[this.size()] = item;
		
		else
			throw new ListIndexOutOfBoundsException("The bag is full or index has an item already. item cannot be added.");
	}
	
	/*
	 * remove the item at the end of this bag
	 */
	public void removeLast() throws ListException{
		if(this.isEmpty() == true)
			throw new ListException("Bag is empty, no elements to remove.");
		else
			bagArray[this.size() - 1] = null;
	}
	
	/*
	 * remove a random item at a random index in this bag
	 */
	public void removeRandom(){
		Random rand = new Random();
		int limit = this.size();
		int rand_num = rand.nextInt(limit); 
		
		if(rand_num == 0)
			bagArray[rand_num] = null;
		else
			bagArray[rand_num - 1] = null;
		
	}
	
	/*
	 * get the index of the first occurrence of the item passed within this bag
	 * @param Object
	 * @return int
	 */
	public int get(Object item)throws ListException{
		
		for(int i = 0; i < this.size(); i++)
		{			
			 if(bagArray[i].equals(item))
	                return i;
	         
			
		}
		throw new ListException("Item is not in bag");
		
	}
	
	/*
	 * get a reference to an item at position index of this bag
	 * @param int
	 * @return Object
	 */
	public Object get(int index) throws ListIndexOutOfBoundsException, ListException{
		
		if(this.isEmpty() == true)
			throw new ListException("The list is empty, and no elements can be retrieved.");
		else if(index < 0 || index > this.size() || index > bagArray.length - 1)
			throw new ListIndexOutOfBoundsException("The index value must be between 0 and " + (this.size()));
		//else if(bagArray[index] == null)
			//throw new ListException("No element in this position " + index);
		else
			return bagArray[index];
			  
	}
	
	/*
	 * check how many items are in this bag
	 * @return int
	 */
	public int size(){
		
		int count = 0;
		
		for(int i = 0; i < bagArray.length; i++)
		{
			//if first index is null return 0
			if(bagArray[i] != null)
				count++;
		}
		
		return count;
	}
	
	/*
	 * check to see if bag is empty
	 * @return Boolean
	 */
	public Boolean isEmpty(){
		if(this.size() == 0)
			return true;
		
		return false;
	}
	
	/*
	 * empty this bag
	 */
	public void makeEmpty(){
		this.bagArray = new Object[100];
	}
	
}