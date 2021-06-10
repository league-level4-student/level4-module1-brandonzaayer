package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arrayT;
	public ArrayList() {
		arrayT = (T[]) new Object[0];
	}
	
	public T[] get(int loc) throws IndexOutOfBoundsException {
		T[] pos = (T[]) new Object[loc];
		return pos;
	}
	
	public void add(T val) {
		T[] nums = (T[]) new Object[arrayT.length+1];
		nums[nums.length-1] = val;
		for(int i = 0; i < arrayT.length; i++) {
			nums[i] = arrayT[i];
		}
		arrayT = nums;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] longer = (T[]) new Object[arrayT.length+1];
		for(int i = 0; i < longer.length; i++) {
			if(i < loc) {
				longer[i] = arrayT[i];
			}
			else if(i > loc) {
				longer[i] = arrayT[i-1];
			}
			else {
				longer[i] = val; 
			}
		}
		arrayT = longer;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] change = (T[]) new Object[loc];
		change[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] small = (T[]) new Object[arrayT.length-1];
		for(int i = 0; i < arrayT.length; i++) {
			if(i < loc) {
				small[i] = arrayT[i];
			}
			else if(i > loc) {
				small[i - 1] = arrayT[i];
			}
			else {
				continue;
			}
		}
		arrayT = small;
	}
	
	public boolean contains(T val) {
		
		return false;
	}
	public int size() throws IndexOutOfBoundsException{
		return arrayT.length;

	}
}