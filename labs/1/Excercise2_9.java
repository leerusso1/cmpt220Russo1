package projects;



import javax.swing.JOptionPane;

public class Excercise2_9 {
	public static void main(String args[]) {
		
		
		double v1=Double.parseDouble(JOptionPane.showInputDialog("Enter V1"));
		double v0=Double.parseDouble(JOptionPane.showInputDialog("Enter V0"));
		double t=Double.parseDouble(JOptionPane.showInputDialog("Enter t"));
		
		System.out.println(((v1-v0)/t));
		
		
	}
}
