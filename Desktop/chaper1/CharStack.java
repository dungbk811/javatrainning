public class CharStack{
	//Instance variables
	private char[] stackArray;
	private int topOfStack;

	//Static variables
	private static int counter;

	//contructor
	public CharStack(int capacity)
	{
		stackArray = new char[capacity];
		topOfStack = -1;
		counter++;
	}

	//Instance medthod
	public void push(char element)
	{
		stackArray[++topOfStack] = element;
	}

	public char pop()
	{
		return stackArray[topOfStack--];
	}

	public char peek()
	{
		return stackArray[topOfStack];
	}

	public boolean isEmpty()
	{
		return topOfStack<0;
	}

	public boolean isFull()
	{
		return topOfStack == stackArray.length -1;
	}

	//Static method
	public static int getInstanceCount(){
		return counter;
	}
}