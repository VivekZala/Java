class generic_demo {

	public static void main(String ...args) {

		Data<Integer> d = new Data<>();
		d.setData(10);
		//d.setData(new Integer(10));

		System.out.println(d.getData());

	}
}

class Data<T> {

	private T obj;
	public void setData(T value) {
		obj = value;
	}
	public T getData() {
		return obj;
	}
}
