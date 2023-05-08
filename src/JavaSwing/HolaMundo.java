package JavaSwing;
import javax.swing.*;

public class HolaMundo extends JFrame {
    private JPanel panel1;
    public HolaMundo(){
        setContentPane(panel1);
        setTitle("Hola Mundo");
        setVisible(true);
    }
    public static void main(String[] args) {
        HolaMundo holaMundo = new HolaMundo();
    }
}