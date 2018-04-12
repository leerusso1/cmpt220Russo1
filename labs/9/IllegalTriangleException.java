

public class IllegalTriangleException(double side1, double side2, double side3) {
		throws IllegalTriangleException{
	if (side1 >= side2 + side3 || side1 <= Math.abs(side3-side2))
		throw new IllegalTriangleException(yourMessage);
}

