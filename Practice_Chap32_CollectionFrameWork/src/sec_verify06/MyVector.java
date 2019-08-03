package sec_verify06;

import java.util.Arrays;

public class MyVector {

	protected Object[] data = null;	
	protected int capacity = 0;	
	protected int size = 0;		

	public MyVector(int capacity) {
           if (capacity < 0)
               throw new IllegalArgumentException("��ȿ���� ���� ���Դϴ�. :"+ capacity);
	
           this.capacity = capacity;
           data = new Object[capacity];		
	}

	public MyVector() {
		this(10);		
	}

	public void ensureCapacity(int minCapacity) {
		
		int newCapacity = capacity;

		if(minCapacity > capacity) {  
			newCapacity = capacity * 2;
		}

		if(minCapacity > newCapacity) { 
			newCapacity = minCapacity; 
		}

		setCapacity(newCapacity);
	}
	
	
	public void setCapacity(int capacity) {
		
		if(this.capacity == capacity) {
			return;
		}

		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	
	public boolean add(Object obj) {
		ensureCapacity(size+1);
		data[size++] = obj; 
		return true;
	}

	
	public Object get(int index) {
		if(index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("������ ������ϴ�.");

		return data[index];
	}
	

	public Object remove(int index) { 
		
		Object oldObj = null;

		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("������ ������ϴ�.");
		}
		
		oldObj = data[index];

		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		data[size-1] = null;	
		size--;
		return oldObj;
	}

	public boolean remove(Object obj) {
		for(int i=0; i< size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
	}

	public void trimToSize() {
		setCapacity(size);
	}

	public void clear(){ 
		for (int i = 0; i < size; i++)
			data[i] = null;
		size = 0;
	}

	public Object[] toArray(){ 
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size);

		return result;
	}

	public boolean isEmpty() { return size==0;}
	public int capacity() {	return capacity; }
	public int size() {	return size; }
	
	@Override
	public String toString() {
		Object[] temp = new Object[this.size];
		System.arraycopy(data, 0, temp, 0, this.size);
		return Arrays.toString(temp);
	}
	
}
