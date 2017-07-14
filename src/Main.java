import root.lib.stack.MyStack;

public class Main {
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		System.out.println(stack.count());
		stack.push(1);
		
		for(int i = 0; i < 10; i++) {
			stack.push(i);
		}
		
		stack.show();
		System.out.println();
		System.out.println(stack.count());
		System.out.println();
		System.out.println(stack.peek());
		
		for (int i = 0; i < 5; i++) {
			stack.pop();
			stack.show();
			System.out.println();
		}
		
		System.out.println(stack.count());
	}
}
