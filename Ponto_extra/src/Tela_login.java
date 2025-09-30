import javax.swing.*;
public class Tela_login {
    JFrame window = new JFrame("Login");
    JLabel userLabel = new JLabel("Usuário:");
    JTextField userText = new JTextField(20);
    JLabel passwordLabel = new JLabel("Senha:");
    JPasswordField passwordText = new JPasswordField(20);
    JButton loginButton = new JButton("Login");
    JLabel wallpaper = new JLabel(new ImageIcon("src/wallpaper_misuriuredimencionado.jpg"));
    Tela_login() {
        window.setSize(738, 594);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        wallpaper.setBounds(0, 0, 738, 594);
        userLabel.setBounds(150, 200, 80, 25);
        window.add(userLabel);
        window.add(wallpaper);
        window.setVisible(true);
       
    }
}
