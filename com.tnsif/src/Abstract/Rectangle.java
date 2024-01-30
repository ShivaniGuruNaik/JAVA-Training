package Abstract;

public class Rectangle extends Shape{
	private float height,width;

	public Rectangle() {
		width =2.8f;
		height = 4.1f;
	}

	public Rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}
	@Override
	void calArea()
	{
		area= width*height;
	}
}
