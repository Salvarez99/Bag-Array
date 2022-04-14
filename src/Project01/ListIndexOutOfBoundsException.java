package Project01;

/**
 * Defines an exception that is thrown when an index is out of bound.
 */
public class ListIndexOutOfBoundsException extends IndexOutOfBoundsException {

	/**
	 * Constructs an object with specific message
	 * @param message A string literal specifying the details of this exception
	 */
	public ListIndexOutOfBoundsException(String message){
		super(message);
	}
}
