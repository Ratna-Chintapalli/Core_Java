package task;

import java.util.Stack;
/* LIFO-LAST IN FIRST OUT 
 * Satck is a class in java which is implements the list interface and  extends the vector class and also 
 * represents the LIFO principles 
 * (push,pop,peek,search operations in stack ) 
 * -- we can create only empty stack initially we can't create a stack with values (or) objects 
 * default capacity = 10
 * initial capacity = 10
 * it allows duplicate & null values 
 * stack is synchronized 
 * it will work well in LIFO applications 
 * 
 */
public class StackPractice {

	public static void main(String[] args) {
		Stack<String> books=new  Stack<>();
		books.push("Red"); // push() like add() -- adding the elements in the stack
		books.push("black");
		books.push("Red");
		books.push(null);
		books.add("white");
		//books.remove(0);
		books.set(1, "Yellow");
		System.out.println(books);
		//System.out.println(books.peek());// it removes the last means 0 index position element
		//System.out.println(books.pop());
		System.out.println(books.search("Red")); // gives number --- indexOf() & search() both are sligthly different
		System.out.println(books.indexOf("Red")); // gives index 
		System.out.println(books.isEmpty()); // is from vector -- tells the vector is empty or not 
		System.out.println(books.empty()); // is from stack -- tells the stack is empty or not -- if yes return true or false
		//System.out.println(books.contains("Yellow"));
	}

}
