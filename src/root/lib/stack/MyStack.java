package root.lib.stack;

public class MyStack {
	private static int[] array;
	
	public MyStack() {
		array = new int[0];
	}
	
	
	public void push(int key) {
		arrayPlusPlus(key);
	}
	
	public void pop() {
		if (array.length != 0) {
			arrayMinusMinus();
		} else {
			System.out.println("Stack is empty");
		}
	}
	
	public void show() {
		for (int i : array) {
			System.out.print(i + " ");
		}
	}
	
	public int peek() {
		if (array.length != 0) {
			return array[array.length - 1];
		} else {
			return -1;
		}
	}
	
	public int count() {
		return array.length;
	}
	
	private void arrayPlusPlus(int key) {
		int[] tmp = new int[array.length + 1];
		
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		}
		
		tmp[tmp.length - 1] = key;
		
		array = tmp;
	}
	
	private void arrayMinusMinus() {
		int[] tmp = new int[array.length - 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = array[i];
		}
		
		array = tmp;
	}
}
