public class Client{
public static void main(String[] args) {
	

	//create a stack
	CharStack stack = new CharStack(40);

	//Create a string to push on the stack;
	String str = "Hello. Where are you from";
	int length = str.length();
	System.out.println("Original string: "+str);

	//push the string char by char onto the stack
	for(int i=0;i<length;i++)
	{
		stack.push(str.charAt(i));
	}

	System.out.println("Reversed string: ");
	//Pop and println each char from the stack
	while(!stack.isEmpty())
	{
		System.out.println(stack.pop());
	}

	System.out.println();
}
}