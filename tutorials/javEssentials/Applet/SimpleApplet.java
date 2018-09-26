// Simple java Applet
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

// Make SimpleApplet class public Inherits Applet Class
public class SimpleApplet extends Applet {

	String text; 

	// One-time operation applet
	// Initializes applet
	public void init() {
		text = "I'm simple applet";
		setBackground(Color.cyan);
	}

	// Start method is starts the the applet when visited
	public void start() { System.out.println("Starting..."); }
	// Stop method stops the applet when not inneed anymore
	public void stop() { System.out.println("Stopping..."); }
	// Destroy method when the appletviewer or browser exits
	public void destroy() { System.out.println("preparing to unload..."); }

	public void paint(Graphics g) {

		System.out.println("Paint");
		// Set drawing width and height of Rectangle 
		g.drawRect(0, 0, getSize().width -1, getSize().height -1);
		g.setColor(Color.red);
		g.drawString(text, 15, 25);
	}
}
