package OCP;

public class Square implements Figure {
	float length;

	public Square(float d) {
		length=d;
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Karratua marraztu");
		
	}

	@Override
	public double getArea() {
		return length*length;
		
	}
}
