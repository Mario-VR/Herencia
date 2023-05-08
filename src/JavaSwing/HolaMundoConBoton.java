package JavaSwing;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundoConBoton extends JFrame{
    private JButton clickButton;
    private JPanel panel1;
    private JLabel etiqueta;
public HolaMundoConBoton() {
    clickButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            etiqueta.setText("Hola Mundo");
        }
    });
    setContentPane(panel1);
    setTitle("Hola Mundo");
    setVisible(true);
}
    public static void main(String[] args) {
        HolaMundoConBoton holaMundo = new HolaMundoConBoton();
    }
}
