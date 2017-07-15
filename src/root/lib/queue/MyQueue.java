package root.lib.queue;



public class MyQueue {
	private static Object[] array;
	
	public MyQueue() {
		array = new Object[0];
	}
	
	public void enqueue(Object key) {
		arrayPlusPlus(key);
	}
	
	private void arrayPlusPlus(Object key) {
		Object[] tmp = new Object[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		}
		
		tmp[tmp.length - 1] = key;
		array = tmp;
	}
	
	public Object dequeue() {
		if (array.length == 0) {
			return "InvalidOperationException";
		} else {
			Object result = array[0];
			Object[] tmp = new Object[array.length - 1];
			for (int i = 0; i < tmp.length; i++) {
				tmp[i] = array[i + 1];
			}
			array = tmp;
			return result;
		}	
	}
	
	public Object peek() {
		if (array.length == 0) {
			return "InvalidOperationException";
		} else {
			if (array.length == 1) {
				return array[0];
			} else {
				return array[1];
			}
		}
	}
	
	public int count() {
		return array.length;
	}
		
	public void show() {
		for (Object object : array) {
			System.out.print(object.toString() + " ");
		}
		System.out.println();
	}
	
}
