package AWT;

import javax.swing.*;
import java.awt.*;
public class SudokuGrid extends JFrame {

    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    int fontSize = 30;

    private static final String FILE = "/home/dineshkumar.anandan@zucisystems.com/Downloads/generate.pdf";

    public static void main(String[] args) {

        SudokuGrid makeSudokuGrid = new SudokuGrid();




    }
    public SudokuGrid() {

        JTextField[][] inputBoxes = new JTextField[ROWS][COLUMNS];
        Font font = new Font("Helvetica", Font.BOLD, fontSize);

        setLayout(new GridLayout(ROWS, COLUMNS));
        // set frame size
        setSize(210, 297);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // outer loop to create the rows
        for (int rows = 0 ; rows < ROWS ; rows++) {

            // inner loop to create the columns
            for (int columns = 0 ; columns < COLUMNS ; columns++) {

                // make text fields empty
                inputBoxes[rows][columns] = new JTextField("");
                // add text fields to the frame
                JTextField inputBox = inputBoxes[rows][columns];
                add(inputBox);
                // center text in each text box
                inputBox.setHorizontalAlignment(JTextField.CENTER);
                // apply font to each text box
                inputBox.setFont(font);
                inputBox.setText("Key:Value");
                inputBox.setBorder(null);

            }
        }
        // make frame visible
        getContentPane().setBackground(Color.RED);
        setVisible(true);

    }
}