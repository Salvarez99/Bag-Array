package Project01;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Contains helper methods the array-based ADT list. 
 * @author Stephen Alvarez
 * @version 1.0 
 */

public class Helper {
	public static void start() throws FileNotFoundException, ListIndexOutOfBoundsException, ListException{
		
		Bag bagArray = new Bag();
		
		System.out.println("create()");
		create(bagArray);
		display(bagArray);
		
		System.out.println("size()");
		testSize(bagArray);
		
		System.out.println("removeLast()");
		testRemoveLast(bagArray);
		display(bagArray);
		
		System.out.println("size()");
		testSize(bagArray);
		
		System.out.println("get(\"4Fish\")");
		testObjGetO(bagArray);
		
		System.out.println("get(index)");
		testObjGetI(bagArray);
		
		//issues with displaying array after removeRand()
		System.out.println("removeRand()");
		testRemoveRand(bagArray);
		display(bagArray);
		
		System.out.println("size()");
		testSize(bagArray);
		
		System.out.println("isEmpty()");
		testIsEmpty(bagArray);
		
		testMakeEmpty(bagArray);
		
		System.out.println("isEmpty()");
		testIsEmpty(bagArray);

	}
	
	/*
	 * fills passed bag with items from textfile
	 * @param Bag
	 */
	public static void create(Bag bagArray)  throws FileNotFoundException{
		Scanner input = new Scanner(new File("datalist.txt"));
		while(input.hasNext()){
			bagArray.insert(input.next());
	    }
		input.close();
		
	}
	
	/*
	 * displays items in bag
	 * @param Bag
	 */
	public static void display(Bag bagArray) throws ListIndexOutOfBoundsException, ListException{
							
		for(int i = 0; i < bagArray.size(); i++)
		{
			if(bagArray.get(i) != null)//if index has item, print item
			System.out.println(bagArray.get(i));
			
			else if(bagArray.get(bagArray.size()) != null)//if item is null, print last item
			System.out.println(bagArray.get((bagArray.size())));
		}	
		
		System.out.println("\n");
		
		

	}
	
	public static void testRemoveLast(Bag bagArray){
		bagArray.removeLast();
	}
	
	public static void testRemoveRand(Bag bagArray){
		bagArray.removeRandom();
	}
	
	public static void testObjGetO(Bag bagArray){
		System.out.println(bagArray.get("4Fish") + "\n");
	}
	
	public static void testObjGetI(Bag bagArray){
		System.out.println(bagArray.get(10) + "\n");
	}
	
	public static void testSize(Bag bagArray){
		System.out.println(bagArray.size() + "\n");
	}
	
	public static void testIsEmpty(Bag bagArray){
		System.out.println(bagArray.isEmpty() + "\n");
	}
	
	public static void testMakeEmpty(Bag bagArray){
		bagArray.makeEmpty();
	}
}


