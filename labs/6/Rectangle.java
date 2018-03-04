
public class Rectangle {
	
	double width = 1; 
	double height = 1; 
	
	Rectangle(){
		
	}
	
	Rectangle(double newwidth, double newheight){
		width = newwidth; 
		height = newheight; 
		
	}
	
	double getArea() {
		return height * width; 
	}
	
	double getPerimeter() {
		return (width*2) + (height*2); 
	}
	public static void main (String[] args) {
		Rectangle Rec1 = new Rectangle(4, 40); 
		Rectangle Rec2 = new Rectangle(3.5, 39);
		
		System.out.println("Rec1"); 
		System.out.println("height: " + Rec1.height);
		System.out.println("width: " + Rec1.width);
		System.out.println("Area: " + Rec1.getArea());
		System.out.println("Perimeter " + Rec1.getPerimeter());
		
		System.out.println("Rec2");
		System.out.println("height: " + Rec2.height);
		System.out.println("width: " + Rec2.width);
		System.out.println("Area: " + Rec2.getArea());
		System.out.println("Perimeter " + Rec2.getPerimeter());
	}
	
}
