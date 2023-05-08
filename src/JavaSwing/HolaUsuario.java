package JavaSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaUsuario extends JFrame{
    private JTextField textField1;
    private JButton clickButton;
    private JPanel panel1;
    private JLabel etiqueta;

public HolaUsuario() {
    clickButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name=textField1.getText();
            etiqueta.setText("Hola "+name);
        }
    });
    setContentPane(panel1);
    setTitle("Hola Usuario");
    setVisible(true);
}
    public static void main(String[] args) {
        HolaUsuario holaUsuario = new HolaUsuario();
    }
}
