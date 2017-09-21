import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SwingDie extends JFrame implements ActionListener, Rollable
{
	private JTextField textfield = new JTextField("Enter new roll value here.");
	private JButton button = new JButton("OK");
	private int lastRoll;

	public void setLastRoll(int newRoll)
	{
		this.lastRoll = newRoll;
	}

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void roll() // Lab 5-3: make this abstract
	{
		setLastRoll((int) (Math.random() * 6 + 1));
	}

	public SwingDie()
	{
		super("SwingDie"); // call JFrame(String) constructor to set title

		this.setPreferredSize(new Dimension(200, 100)); // size of the window
		this.setLayout(new FlowLayout()); // how the controls are laid out

		textfield.setPreferredSize(new Dimension(100, 20)); // size of textfield

		add(textfield); // add the textfield to the window

		button.addActionListener(this); // register this SwingDie to handle
										// clicks

		add(button); // add the button to the window

		pack(); // adjust the layout

	}

	public static void main(String[] args)
	{
		SwingDie die = new SwingDie();
		die.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// what should you do when the button is clicked?

		StdOut.println("OK button clicked.");
		StdOut.println("You entered: " + textfield.getText());

	}

}
