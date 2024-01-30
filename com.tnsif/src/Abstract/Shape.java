package Abstract;

public abstract class Shape {
	protected float area;
	abstract void calArea();
	// concrete method
	void show()
	{
		System.out.println("Area is:" +area);
	}

}
