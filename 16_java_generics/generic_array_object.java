class generic_array_object {

	public static void main(String ...args) {

		MyArray<Integer> ma = new MyArray<>();

		ma.append(10);
		ma.append(20);
		ma.append(30);
		ma.display();

	}
}

@SuppressWarnings("unchecked")
class MyArray<T> {

	T A[] = (T[]) new Object[10];
	int length = 0;

	public void append(T value) {
		A[length++] = value;
	}
	public void display() {
		for(int i = 0; i < length; i++) {
			System.out.println(A[i]);
		}
	}
}
