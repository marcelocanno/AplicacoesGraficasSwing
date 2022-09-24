package swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("Robot Alive");
		f.setSize(1240,640);
		f.setLocation(500,300);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		
		
		JLabel l = new JLabel("Digite seu nome");
		p.add(l);
		
		
		JTextField t = new JTextField(15);		
		p.add(t);
		
		JButton b = new JButton("ok");
		BotaoAction action = new BotaoAction(t);
		b.addActionListener(action);
		
		p.add(b);
		
		
		
		f.add(p);
		f.setVisible(true);
		
	}
	
	
	

}
