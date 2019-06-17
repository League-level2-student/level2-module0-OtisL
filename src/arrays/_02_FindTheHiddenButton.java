/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
	
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener{
	JFrame window;
	JPanel panel;
	Random randy=new Random();
	//1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	//2 create an int variable called hiddenButton
	int hiddenButton=0;
	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}
	
	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//3.  Ask the user to enter a positive number and convert it to an int
		String number = JOptionPane.showInputDialog("Enter a POSITIVE number");
		int number2 = Integer.parseInt(number);
		//4. Initialize the array of JButtons to be the size of the int created in step 3
		buttons=new JButton[number2];
		//5. Make a for loop to iterate through the JButton array
		JOptionPane.showMessageDialog(null, "Now that you have entered a number, you must find the hidden button among them.");
		hiddenButton=randy.nextInt(number2);
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		window.add(panel);
		window.setVisible(true);
		for(int i=0; i<buttons.length; i++) {
			buttons[i]=new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
			if(i==hiddenButton) {
				buttons[i].setText("ME!");
				}
		}
			//6. initialize each JButton in the array
			//7. add the ActionListener to each JButton
			//8. add each JButton to the panel
	
		window.pack();
		//window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//9 add the panel to the window
		
		//10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		
		//11. set the JFrame to visible.
		
		//12. Give the user the instructions for the game.
		
		//13. initialize the hiddenButton variable to a random number less than the int created int step 3
		
		//14. Set the text of the JButton located at hiddenButton the read "ME"
		
		//15. Use Thread.sleep(1000); to pause the program.
		//    Surround it with a try/catch - use Eclipse helper for this
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton)e.getSource();
		
		//17. if the hiddenButton is clicked, tell the user that they win.
		if(e.getSource()==buttons[hiddenButton]) {
			JOptionPane.showMessageDialog(null, "You win");
			start();
		}else {
			JOptionPane.showMessageDialog(null, "You L00SE. You are horrible at this game. You are a complete failiure. \n"
					+ "You shouldn't be playing this game. Go home and get a life. \n"
					+ "\n"
					+ "\n"
					+ "\n"
					+ "(jk don't belive that");
			window.dispose();
			start();
		}
		//18. else tell them to try again
	}
}
