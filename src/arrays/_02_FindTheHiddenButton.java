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

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] JBlist;
	// 2 create an int variable called hiddenButton
	int hb;
	int a;
	int h;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();

	}

	public void start() {

		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. Ask the user to enter a positive number and convert it to an int
		String answer = JOptionPane.showInputDialog("Pick any positve number for your number of buttons");
		int a = Integer.parseInt(answer);
		if (a>84) {
			a=84;
		}
		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3

		JBlist = new JButton[a];
		for (int i = 0; i < JBlist.length; i++) {
			JBlist[i] = new JButton();
			JBlist[i].addActionListener(this);
			panel.add(JBlist[i]);
		}
		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.

		window.setSize(500, 500);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random r = new Random();
		h = r.nextInt(a);
		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		JBlist[h].setText("ME");
		// 15. Use Thread.sleep(100); to pause the program.
		// Surround it with a try/catch
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 16. Set the text of the JButton located at hiddenButton to be blank.
JBlist[h].setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
if (buttonClicked==JBlist[h]) {
	JOptionPane.showMessageDialog(null, "YIPPY");
}
		// 18. else tell them to try again
else {
	JOptionPane.showMessageDialog(null, "WRONG");
}
	}
}
