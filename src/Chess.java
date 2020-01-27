import javax.swing.*;
public class Chess {

    public static void main(String[] args) {
        // Create frame
	    JFrame f = new JFrame("My Title Goes Here!");
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // when click exit, close
        UserInterface ui = new UserInterface();
        f.add(ui);
        f.setSize(666, 666);
        f.setResizable(false);
        f.setVisible(true); // make sure it's visible when created
    }
}
