import javax.swing.*;

public class Wsq08{
	
	public static void main(String finn[]){
		int lowbound = Integer.parseInt(JOptionPane.showInputDialog("What is the lower bound?"));
		int	upbound = Integer.parseInt(JOptionPane.showInputDialog("What is the upper bound?"));
		RangeToCheck range1 = new RangeToCheck(lowbound,upbound);
		range1.findLych();
		
	}
}