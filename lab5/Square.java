package lab5;

public class Square {
	Point A;
	Point B;
	Point C;
	Point D;

	public Square(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

	public double perimeter() {
		return 4 * A.distance(B);
	}

	public double area() {
		return A.distance(B) * A.distance(B);
	}

}
