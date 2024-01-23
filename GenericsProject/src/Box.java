public class Box<T>{
	T length;
	T width;
	T height;
	
	public Box(T length, T width, T height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}
}



//public class Box {
//	Integer length;
//	Integer width;
//	Integer height;
//	
//	public Box(Integer length, Integer width, Integer height) {
//		super();
//		this.length = length;
//		this.width = width;
//		this.height = height;
//	}
//
//	public Integer getLength() {
//		return length;
//	}
//
//	public void setLength(Integer length) {
//		this.length = length;
//	}
//
//	public Integer getWidth() {
//		return width;
//	}
//
//	public void setWidth(Integer width) {
//		this.width = width;
//	}
//
//	public Integer getHeight() {
//		return height;
//	}
//
//	public void setHeight(Integer height) {
//		this.height = height;
//	}
//}
