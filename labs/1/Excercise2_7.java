//package projects;

import javax.swing.JOptionPane;

public class Excercise2_7 {
public static void main(String args[]) {
		
		
		double min=Double.parseDouble(JOptionPane.showInputDialog("Enter Min"));
		
		int years=(int) (min/525600);
		int days=(int) ((min%525600)/1440);
		
		
		
		System.out.println("Years:"+years+" Days:"+days);
		
		
	}

}
