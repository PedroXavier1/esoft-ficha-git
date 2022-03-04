package main;

import javax.swing.*;

public class Exprimental extends JFrame {
    private JPanel panel1;
    private JLabel lblMensagem;

    public Exprimental(){
        setContentPane(panel1);
        pack();
    }
    public static void main(String[] args) {
        new Exprimental().setVisible(true);
            }
}