package root.lib.stack;

public class MyStack {
	private Object[] array;
	
	public MyStack() {
		this.array = new Object[0];
	}
	
	
	public void push(Object key) {
		arrayPlusPlus(key);
	}
	
	public Object pop() {
		if (this.array.length == 0) {
			return "InvalidOperationException";
		} else {
			return arrayMinusMinus();
		}
	}
	
	public void show() {
		for (Object i : this.array) {
			System.out.print(i.toString() + " ");
		}
		System.out.println();
	}
	
	public Object peek() {
		if (this.array.length == 0) {
			return "InvalidOperationException";
			
		} else {
			return this.array[this.array.length - 1];
		}
	}
	
	public int count() {
		return this.array.length;
	}
	
	private void arrayPlusPlus(Object key) {
		Object[] tmp = new Object[this.array.length + 1];
		
		for (int i = 0; i < this.array.length; i++) {
			tmp[i] = this.array[i];
		}
		
		tmp[tmp.length - 1] = key;
		
		this.array = tmp;
	}
	
	private Object arrayMinusMinus() {
		Object result = this.array[this.array.length - 1];
		Object[] tmp = new Object[this.array.length - 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = this.array[i];
		}
		
		array = tmp;
		return result;
	}
}
