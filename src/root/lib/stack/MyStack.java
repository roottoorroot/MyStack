package root.lib.stack;

public class MyStack {
	private static Object[] array;
	
	public MyStack() {
		array = new Object[0];
	}
	
	
	public void push(Object key) {
		arrayPlusPlus(key);
	}
	
	public Object pop() {
		if (array.length == 0) {
			return "InvalidOperationException";
		} else {
			return arrayMinusMinus();
		}
	}
	
	public void show() {
		for (Object i : array) {
			System.out.print(i.toString() + " ");
		}
		System.out.println();
	}
	
	public Object peek() {
		if (array.length == 0) {
			return "InvalidOperationException";
			
		} else {
			return array[array.length - 1];
		}
	}
	
	public int count() {
		return array.length;
	}
	
	private void arrayPlusPlus(Object key) {
		Object[] tmp = new Object[array.length + 1];
		
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		}
		
		tmp[tmp.length - 1] = key;
		
		array = tmp;
	}
	
	private Object arrayMinusMinus() {
		Object result = array[array.length - 1];
		Object[] tmp = new Object[array.length - 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = array[i];
		}
		
		array = tmp;
		return result;
	}
}
