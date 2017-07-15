package root.lib.queue;



public class MyQueue {
	private Object[] array;
	
	public MyQueue() {
		this.array = new Object[0];
	}
	
	public void enqueue(Object key) {
		arrayPlusPlus(key);
	}
	
	private void arrayPlusPlus(Object key) {
		Object[] tmp = new Object[this.array.length + 1];
		for (int i = 0; i < this.array.length; i++) {
			tmp[i] = this.array[i];
		}
		
		tmp[tmp.length - 1] = key;
		this.array = tmp;
	}
	
	public Object dequeue() {
		if (this.array.length == 0) {
			return "InvalidOperationException";
		} else {
			Object result = this.array[0];
			Object[] tmp = new Object[this.array.length - 1];
			for (int i = 0; i < tmp.length; i++) {
				tmp[i] = this.array[i + 1];
			}
			this.array = tmp;
			return result;
		}	
	}
	
	public Object peek() {
		if (this.array.length == 0) {
			return "InvalidOperationException";
		} else {
			if (this.array.length == 1) {
				return this.array[0];
			} else {
				return this.array[1];
			}
		}
	}
	
	public int count() {
		return this.array.length;
	}
		
	public void show() {
		for (Object object : this.array) {
			System.out.print(object.toString() + " ");
		}
		System.out.println();
	}
	
}
