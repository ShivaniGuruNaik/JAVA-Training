package Abstract;

public class Square extends Shape {
	protected float side;

	public Square() {
		side = 2f;
	}

	public Square(float side) {
		super();
		this.side = side;
	}
	@Override
	void calArea()
	{
		area= side*side;
	}
}