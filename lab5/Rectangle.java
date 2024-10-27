package lab5;

import javax.xml.namespace.QName;

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	

	public double area() {
		return A.distance(B)*A.distance(C);
	}

	public double perimeter() {
		return 2* (A.distance(B) + A.distance(C));
	}

}
