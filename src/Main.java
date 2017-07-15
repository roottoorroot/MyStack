import java.util.Random;

import root.lib.queue.MyQueue;
import root.lib.stack.MyStack;

public class Main {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		MyQueue queue = new MyQueue();
		
		
		stack.push(133);
		stack.push("dsd");
		stack.push("folow");
		stack.push("thesun");
		stack.show();
		System.out.println(stack.pop().toString());
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		stack.pop();
		stack.show();
		System.out.println(stack.pop().toString());

		
	}
}
