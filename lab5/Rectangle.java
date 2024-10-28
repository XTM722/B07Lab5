package lab5;

public class Rectangle {
    Point A;
    Point B;
    Point C;
    Point D;

    public Rectangle(Point A, Point B, Point C, Point D) {
        if (!isValidRectangle(A, B, C, D)) {
            throw new IllegalArgumentException("Go back to grade school. Not a valid rectangle!");
        }
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    private boolean isValidRectangle(Point A, Point B, Point C, Point D) {
        double AB = A.distance(B);
        double BC = B.distance(C);
        double CD = C.distance(D);
        double DA = D.distance(A);

         return AB == CD && BC == DA;
    }

    public double area() {
        return A.distance(B) * A.distance(C);
    }

    public double perimeter() {
        return 2 * (A.distance(B) + A.distance(C));
    }
}
