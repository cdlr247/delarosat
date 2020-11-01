package juego;
import javax.swing.*;
import java.awt.event.*;

public class JuegoPuzzle extends JFrame implements ActionListener {
	JButton btnN, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,
	btn21, btn22, btn23, btn24, btn25;
	
	JuegoPuzzle()
	{
		btn1 = new JButton("1");
		btn1.setBounds(50, 50, 50, 50);
		btn1.addActionListener(this);
		btn1.setFocusable(false);
		add(btn1);
		btn2 = new JButton("2");
		btn2.setBounds(100, 50, 50, 50);
		btn2.addActionListener(this);
		btn2.setFocusable(false);
		add(btn2);
		btn3 = new JButton("3");
		btn3.setBounds(150, 50, 50, 50);
		btn3.addActionListener(this);
		btn3.setFocusable(false);
		add(btn3);
		btn4 = new JButton("4");
		btn4.setBounds(200, 50, 50, 50);
		btn4.addActionListener(this);
		btn4.setFocusable(false);
		add(btn4);
		btn5 = new JButton("5");
		btn5.setBounds(250, 50, 50, 50);
		btn5.addActionListener(this);
		btn5.setFocusable(false);
		add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(50, 100, 50, 50);
		btn6.addActionListener(this);
		btn6.setFocusable(false);
		add(btn6);
		btn7 = new JButton("7");
		btn7.setBounds(100, 100, 50, 50);
		btn7.addActionListener(this);
		btn7.setFocusable(false);
		add(btn7);
		btn8 = new JButton("8");
		btn8.setBounds(150, 100, 50, 50);
		btn8.addActionListener(this);
		btn8.setFocusable(false);
		add(btn8);
		btn9 = new JButton("9");
		btn9.setBounds(200, 100, 50, 50);
		btn9.addActionListener(this);
		btn9.setFocusable(false);
		add(btn9);
		btn10 = new JButton("10");
		btn10.setBounds(250, 100, 50, 50);
		btn10.addActionListener(this);
		btn10.setFocusable(false);
		add(btn10);
		
		btn11 = new JButton("11");
		btn11.setBounds(50, 150, 50, 50);
		btn11.addActionListener(this);
		btn11.setFocusable(false);
		add(btn11);
		btn12 = new JButton("12");
		btn12.setBounds(100, 150, 50, 50);
		btn12.addActionListener(this);
		btn12.setFocusable(false);
		add(btn12);
		btn13 = new JButton("13");
		btn13.setBounds(150, 150, 50, 50);
		btn13.addActionListener(this);
		btn13.setFocusable(false);
		add(btn13);
		btn14 = new JButton("14");
		btn14.setBounds(200, 150, 50, 50);
		btn14.addActionListener(this);
		btn14.setFocusable(false);
		add(btn14);
		btn15 = new JButton("15");
		btn15.setBounds(250, 150, 50, 50);
		btn15.addActionListener(this);
		btn15.setFocusable(false);
		add(btn15);
		
		btn16 = new JButton("16");
		btn16.setBounds(50, 200, 50, 50);
		btn16.addActionListener(this);
		btn16.setFocusable(false);
		add(btn16);
		btn17 = new JButton("17");
		btn17.setBounds(100, 200, 50, 50);
		btn17.addActionListener(this);
		btn17.setFocusable(false);
		add(btn17);
		btn18 = new JButton("18");
		btn18.setBounds(150, 200, 50, 50);
		btn18.addActionListener(this);
		btn18.setFocusable(false);
		add(btn18);
		btn19 = new JButton("19");
		btn19.setBounds(200, 200, 50, 50);
		btn19.addActionListener(this);
		btn19.setFocusable(false);
		add(btn19);
		btn20 = new JButton("20");
		btn20.setBounds(250, 200, 50, 50);
		btn20.addActionListener(this);
		btn20.setFocusable(false);
		add(btn20);
		
		btn21 = new JButton("21");
		btn21.setBounds(50, 250, 50, 50);
		btn21.addActionListener(this);
		btn21.setFocusable(false);
		add(btn21);
		btn22 = new JButton("22");
		btn22.setBounds(100, 250, 50, 50);
		btn22.addActionListener(this);
		btn22.setFocusable(false);
		add(btn22);
		btn23 = new JButton("23");
		btn23.setBounds(150, 250, 50, 50);
		btn23.addActionListener(this);
		btn23.setFocusable(false);
		add(btn23);
		btn24 = new JButton("24");
		btn24.setBounds(200, 250, 50, 50);
		btn24.addActionListener(this);
		btn24.setFocusable(false);
		add(btn24);
		btn25 = new JButton(" ");
		btn25.setBounds(250, 250, 50, 50);
		btn25.addActionListener(this);
		btn25.setFocusable(false);
		add(btn25);
		
		
		btnN = new JButton("Empezar de nuevo");
		btnN.setBounds(100, 350, 150, 30);
		btnN.addActionListener(this);
		btnN.setFocusable(false);
		add(btnN);
		
		
		
		setTitle("Juego Puzzle");
		setBounds(700, 400, 370, 470);
		setLayout(null);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		JuegoPuzzle juego = new JuegoPuzzle();
	}
	
	public void Comprobar()
	{
		if (btn1.getText()=="1" && btn2.getText()=="2" && btn3.getText()=="3" && btn4.getText()=="4" && btn5.getText()=="5" && btn6.getText()=="6" && btn7.getText()=="7" && btn8.getText()=="8" && btn9.getText()=="9" && btn10.getText()=="10" && 
				btn11.getText() == "11" && btn12.getText()=="12" && btn13.getText()=="13" && btn14.getText()=="14" && btn15.getText()=="15" && btn16.getText() == "16" && 
				btn17.getText() == "17" && btn18.getText()=="18" && btn19.getText()=="19" && btn20.getText() == "20" && btn21.getText()=="21" && btn22.getText()=="22" &&
				btn23.getText() == "23" && btn24.getText() == "24" && btn25.getText()==" ")
		{
			JOptionPane.showMessageDialog(JuegoPuzzle.this, "¡Felicitaciones! Haz terminado el juego:)", "Juego Puzzle", JOptionPane.DEFAULT_OPTION);
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == btnN)
		{
			JOptionPane.showMessageDialog(JuegoPuzzle.this, "Nuevo juego");
			this.hide();
			JuegoPuzzle juego2 = new JuegoPuzzle();
		}
		
		if (e.getSource() == btn1)
		{
			String txt = btn1.getText();
			if (btn2.getText()==" ")
			{
				btn2.setText(txt);
				btn1.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn6.getText()==" ")
				{
					btn6.setText(txt);
					btn1.setText(" ");
					Comprobar();
				}
			}
		}
		
		if (e.getSource() == btn2)
		{
			String txt = btn2.getText();
			if (btn1.getText()==" ")
			{
				btn1.setText(txt);
				btn2.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn3.getText()==" ")
				{
					btn3.setText(txt);
					btn2.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn7.getText() == " ")
					{
						btn7.setText(txt);
						btn2.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn3)
		{
			String txt = btn3.getText();
			if (btn2.getText() == " ")
			{
				btn2.setText(txt);
				btn3.setText(" ");
				Comprobar();
			}
			else
			{
				if(btn4.getText()==" ")
				{
					btn4.setText(txt);
					btn3.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn8.getText() == " ")
					{
						btn8.setText(txt);
						btn3.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn4)
		{
			String txt = btn4.getText();
			if (btn3.getText()==" ")
			{
				btn3.setText(txt);
				btn4.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn5.getText()==" ")
				{
					btn5.setText(txt);
					btn4.setText(" ");
					Comprobar();
				}
				else
				{
					if(btn9.getText() == " ")
					{
						btn9.setText(txt);
						btn4.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn5)
		{
			String txt = btn5.getText();
			if (btn4.getText()==" ")
			{
				btn4.setText(txt);
				btn5.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn10.getText()==" ")
				{
					btn10.setText(txt);
					btn5.setText(" ");
					Comprobar();
				}
			}
		}
		
		if (e.getSource() == btn6)
		{
			String txt = btn6.getText();
			if (btn1.getText()==" ")
			{
				btn1.setText(txt);
				btn6.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn7.getText()==" ")
				{
					btn7.setText(txt);
					btn6.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn11.getText() == " ")
					{
						btn11.setText(txt);
						btn6.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn7)
		{
			String txt = btn7.getText();
			if (btn6.getText() == " ")
			{
				btn6.setText(txt);
				btn7.setText(" ");
				Comprobar();
			}
			else
			{
				if(btn8.getText()==" ")
				{
					btn8.setText(txt);
					btn7.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn2.getText() == " ")
					{
						btn2.setText(txt);
						btn7.setText(" ");
						Comprobar();
					}
					else
					{
						if (btn12.getText()==" ")
						{
							btn12.setText(txt);
							btn7.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		if (e.getSource() == btn8)
		{
			String txt = btn8.getText();
			if (btn7.getText()==" ")
			{
				btn7.setText(txt);
				btn8.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn9.getText()==" ")
				{
					btn9.setText(txt);
					btn8.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn3.getText()==" ")
					{
						btn3.setText(txt);
						btn8.setText(" ");
						Comprobar();
					}
					else
					{
						if(btn13.getText()=="")
						{
							btn13.setText(txt);
							btn8.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		
		if (e.getSource() == btn9)
		{
			String txt = btn9.getText();
			if (btn10.getText()==" ")
			{
				btn10.setText(txt);
				btn9.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn8.getText()==" ")
				{
					btn8.setText(txt);
					btn9.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn4.getText() == " ")
					{
						btn4.setText(txt);
						btn9.setText(" ");
						Comprobar();
					}
					else
					{
						if(btn14.getText() == " ")
						{
							btn14.setText(txt);
							btn9.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		if (e.getSource() == btn10)
		{
			String txt = btn10.getText();
			if (btn9.getText()==" ")
			{
				btn9.setText(txt);
				btn10.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn5.getText()==" ")
				{
					btn5.setText(txt);
					btn10.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn15.getText() == " ")
					{
						btn15.setText(txt);
						btn10.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn11)
		{
			String txt = btn11.getText();
			if (btn6.getText()==" ")
			{
				btn6.setText(txt);
				btn11.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn12.getText()==" ")
				{
					btn12.setText(txt);
					btn11.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn16.getText() == " ")
					{
						btn16.setText(txt);
						btn11.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn12)
		{
			String txt = btn12.getText();
			if (btn7.getText() == " ")
			{
				btn7.setText(txt);
				btn12.setText(" ");
				Comprobar();
			}
			else
			{
				if(btn13.getText()==" ")
				{
					btn13.setText(txt);
					btn12.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn11.getText() == " ")
					{
						btn11.setText(txt);
						btn12.setText(" ");
						Comprobar();
					}
					else
					{
						if (btn17.getText()==" ")
						{
							btn17.setText(txt);
							btn12.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		if (e.getSource() == btn13)
		{
			String txt = btn13.getText();
			if (btn12.getText()==" ")
			{
				btn12.setText(txt);
				btn13.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn14.getText()==" ")
				{
					btn14.setText(txt);
					btn13.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn8.getText()==" ")
					{
						btn8.setText(txt);
						btn13.setText(" ");
						Comprobar();
					}
					else
					{
						if(btn18.getText()=="")
						{
							btn18.setText(txt);
							btn13.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		
		if (e.getSource() == btn14)
		{
			String txt = btn14.getText();
			if (btn13.getText()==" ")
			{
				btn13.setText(txt);
				btn14.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn15.getText()==" ")
				{
					btn15.setText(txt);
					btn14.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn9.getText() == " ")
					{
						btn9.setText(txt);
						btn14.setText(" ");
						Comprobar();
					}
					else
					{
						if(btn19.getText() == " ")
						{
							btn19.setText(txt);
							btn14.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		if (e.getSource() == btn15)
		{
			String txt = btn15.getText();
			if (btn14.getText()==" ")
			{
				btn14.setText(txt);
				btn15.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn10.getText()==" ")
				{
					btn10.setText(txt);
					btn15.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn20.getText() == " ")
					{
						btn20.setText(txt);
						btn15.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn16)
		{
			String txt = btn16.getText();
			if (btn11.getText()==" ")
			{
				btn11.setText(txt);
				btn16.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn17.getText()==" ")
				{
					btn17.setText(txt);
					btn16.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn21.getText() == " ")
					{
						btn21.setText(txt);
						btn16.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn17)
		{
			String txt = btn17.getText();
			if (btn16.getText() == " ")
			{
				btn16.setText(txt);
				btn17.setText(" ");
				Comprobar();
			}
			else
			{
				if(btn18.getText()==" ")
				{
					btn18.setText(txt);
					btn17.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn12.getText() == " ")
					{
						btn12.setText(txt);
						btn17.setText(" ");
						Comprobar();
					}
					else
					{
						if (btn22.getText()==" ")
						{
							btn22.setText(txt);
							btn17.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		if (e.getSource() == btn18)
		{
			String txt = btn18.getText();
			if (btn17.getText()==" ")
			{
				btn17.setText(txt);
				btn18.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn19.getText()==" ")
				{
					btn19.setText(txt);
					btn18.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn13.getText()==" ")
					{
						btn13.setText(txt);
						btn18.setText(" ");
						Comprobar();
					}
					else
					{
						if(btn23.getText()=="")
						{
							btn23.setText(txt);
							btn18.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		
		if (e.getSource() == btn19)
		{
			String txt = btn19.getText();
			if (btn18.getText()==" ")
			{
				btn18.setText(txt);
				btn19.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn20.getText()==" ")
				{
					btn20.setText(txt);
					btn19.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn14.getText() == " ")
					{
						btn14.setText(txt);
						btn19.setText(" ");
						Comprobar();
					}
					else
					{
						if(btn24.getText() == " ")
						{
							btn24.setText(txt);
							btn19.setText(" ");
							Comprobar();
						}
					}
				}
			}
		}
		
		if (e.getSource() == btn20)
		{
			String txt = btn20.getText();
			if (btn19.getText()==" ")
			{
				btn19.setText(txt);
				btn20.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn15.getText()==" ")
				{
					btn15.setText(txt);
					btn20.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn25.getText() == " ")
					{
						btn25.setText(txt);
						btn20.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn21)
		{
			String txt = btn21.getText();
			if (btn16.getText()==" ")
			{
				btn16.setText(txt);
				btn21.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn22.getText()==" ")
				{
					btn22.setText(txt);
					btn21.setText(" ");
					Comprobar();
				}
			}
		}
		
		if (e.getSource() == btn22)
		{
			String txt = btn22.getText();
			if (btn21.getText()==" ")
			{
				btn21.setText(txt);
				btn22.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn23.getText()==" ")
				{
					btn23.setText(txt);
					btn22.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn17.getText() == " ")
					{
						btn17.setText(txt);
						btn22.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn23)
		{
			String txt = btn23.getText();
			if (btn22.getText() == " ")
			{
				btn22.setText(txt);
				btn23.setText(" ");
				Comprobar();
			}
			else
			{
				if(btn24.getText()==" ")
				{
					btn24.setText(txt);
					btn23.setText(" ");
					Comprobar();
				}
				else
				{
					if (btn18.getText() == " ")
					{
						btn18.setText(txt);
						btn23.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn24)
		{
			String txt = btn24.getText();
			if (btn23.getText()==" ")
			{
				btn23.setText(txt);
				btn24.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn25.getText()==" ")
				{
					btn25.setText(txt);
					btn24.setText(" ");
					Comprobar();
				}
				else
				{
					if(btn19.getText() == " ")
					{
						btn19.setText(txt);
						btn24.setText(" ");
						Comprobar();
					}
				}
			}
		}
		
		if (e.getSource() == btn25)
		{
			String txt = btn25.getText();
			if (btn24.getText()==" ")
			{
				btn24.setText(txt);
				btn25.setText(" ");
				Comprobar();
			}
			else
			{
				if (btn20.getText()==" ")
				{
					btn20.setText(txt);
					btn25.setText(" ");
					Comprobar();
				}
			}
		}
	}
}
