import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
	JButton button;

	public static void main (String[] args) {
		SimpleGui1B gui = new SimpleGui1B();
		gui.go();
	}
	public void go() {

		JFrame frame = new JFrame();
		button = new JButton("Click Me");
		
		button.AddActionListener(this);


		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);


	}
	public void actionPreformed(ActionEvent event) {
		button.setText("i've been clicked!");
	}
}