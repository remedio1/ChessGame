package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // class to open a window
        JFrame window = new JFrame("Chess Game");
        // method to close the window after exiting the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //method to not allow resizing the window
        window.setResizable(false);
        // add game panel to the window
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();
        // method to open the window in the center 
        window.setLocationRelativeTo(null);
        // method to make the window visible
        window.setVisible(true);

        gp.launchGame();
    }
}
