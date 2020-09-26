package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SerieFibonacci implements ActionListener{
	
	JFrame frame;
	JPanel pnl;
	JTextField tf;
	JLabel lbl;
	JButton btn;
	
	public SerieFibonacci()
	{
		frame = new JFrame("Serie fibonacci");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 150);
		
		pnl = new JPanel();
		tf = new JTextField(10);
		btn = new JButton("Calcular");
		btn.addActionListener(this);
		lbl = new JLabel("Introduzca el número de iteraciones");
		pnl.add(lbl);
		pnl.add(tf);
		pnl.add(btn);
		frame.add(pnl);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {	
		SerieFibonacci fibo = new SerieFibonacci();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()== btn)
		{
			int n1 = 0, n2 = 1, n3 = 0, lim, i = 1;
			String resultado = Integer.toString(n1) + " " + Integer.toString(n2);
			lim = Integer.parseInt(tf.getText());
			do
	        {
	            n3 = n1 + n2;
	            resultado = resultado + " " + Integer.toString(n3);
	            n1 = n2; n2 = n3;
	            i++;
	        } while(i<=lim);
			JOptionPane.showMessageDialog(null, resultado);
		}
	}

}
