import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

// Class Declaration 
class SwingUI extends JFrame implements ActionListener {

	// Instance variables
	JLabel text, clicked;
	JButton button;
	JPanel panel;
	private boolean _clickMeMode = true;

	// Constructor
	SwingUI() {
		// Begin Constructor
		text = new JLabel("I'm a Simple program");
		button = ne JButton("Click Me");
		button.addActionListener(this);
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.white);
		getContentPane().add(panel);
		panel.add(BorderLayout.CENTER, text);
		panel.add(BorderLayout.SOUTH, button);
	} // End Contructor


	/* Event Handling */
	public void actionPerformed(ActionEvent event) {

		Object source = event.getSource();

		if(source == button) {

			if(_clickMeMode) {
				text.setText("Button Clicked");
				button.setText("Click Again");
				_clickMeMode = false;
			} else {

				text.setText("I'm a Simple Program");
				button.setText("Click Me");
				_clickMeMode = true;
			}
		}
	}
	/* Main Method */
	public static void main(String[] args) {

		SwingUI
	}
}
