import javax.swing.JOptionPane;

public class A1_Paper {
	public static void main(String[] args) {
int maxPaperSize= Integer.parseInt(JOptionPane.showInputDialog("Input Smallest Paper Size"));
int[] inputNums=new int[maxPaperSize];
double totHeight=0.0;
double totWidth=0.0;
double x=2;

for(int i=1; i<maxPaperSize; i++) {
	inputNums[i]=Integer.parseInt(JOptionPane.showInputDialog("Input Number Of Papers of Size A"+(i+1)));
}

for(int a=1; a<maxPaperSize; a++) {
	double b= (double) a;
	
	
	
	totHeight=+(1189/(x))*inputNums[a];
	
	
	totWidth=+(841/(x))*inputNums[a];
	
}
	if(totHeight>=1189 && totWidth>=841) {
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	x=x+x;
	}
}
