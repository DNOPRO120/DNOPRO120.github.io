import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIUX extends JFrame {
    public UIUX(){
        setTitle("Quản lí sinh viên");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);

        setResizable(false);
        setMaximumSize(new Dimension(800,600));
        setMinimumSize(new Dimension(800,600));
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        add(panel);

        JLabel label = new JLabel("Quản Lí Sinh Viên");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label,BorderLayout.NORTH);




    }
}
