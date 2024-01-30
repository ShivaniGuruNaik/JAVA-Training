package Abstract;

public class main {

	public static void main(String[] args) {
		Shape s1= new Rectangle();
		s1.calArea();
		s1.show();
		
		s1= new Square();
		s1.calArea();
		s1.show();

	}

}
