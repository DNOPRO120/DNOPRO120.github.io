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

        JLabel menu = new JLabel();
        menu.setLayout(new GridLayout(0,1));
        panel.add(menu, BorderLayout.CENTER);

        String[] choice = {"Xem tất cả thông tin", "Nhập vào một sinh viên", "Sắp xếp sinh viên", "Tìm kiếm sinh viên", "In thông tin", "Xóa thông tin", "Sửa thông tin", "Xóa tất cả dữ liệu", "Thoát chương trình"};
        for (String sw : choice){
            JButton nutbam = new JButton(sw);
            nutbam.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Lựa chọn của bạn" + sw);
                }
            });
            menu.add(nutbam);
        }
    }
}
