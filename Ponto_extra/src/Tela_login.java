import javax.swing.*;
public class Tela_login {
    JFrame window = new JFrame("Login");
    JLabel userLabel = new JLabel("Usuário:");
    JTextField userText = new JTextField(20);
    JLabel passwordLabel = new JLabel("Senha:");
    JPasswordField passwordText = new JPasswordField(20);
    JButton loginButton = new JButton("Login");
    JLabel wallpaper = new JLabel(new ImageIcon(getClass().getResource("/sla1.jpg")));

    Tela_login() {
        window.setSize(738, 654);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        wallpaper.setBounds(0, 0, 738, 854);
        wallpaper.setVisible(true);

        userLabel.setBounds(220, 255, 55, 25);
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userLabel.setOpaque(true);
        userLabel.setBackground(java.awt.Color.WHITE);
        window.add(userLabel);

        userText.setBounds(280, 255, 165, 25);
        window.add(userText);

        passwordLabel.setBounds(220, 340, 42, 25);
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setOpaque(true); 
        passwordLabel.setBackground(java.awt.Color.WHITE);
        window.add(passwordLabel);

        passwordText.setBounds(280, 340, 165, 25);
        window.add(passwordText);

        loginButton.setBounds(280, 410, 80, 25);
        window.add(loginButton);
        loginButton.addActionListener(e -> {
            autenticar();
        });
        
        window.add(wallpaper);
        window.setVisible(true);
       
    }
    private void autenticar() {
        String usuario = userText.getText();
        String senha = new String(passwordText.getPassword());
        if (usuario.equals("admin") && senha.equals("1234")) {
            window.dispose();
            new Tela_inicial();
        } else {
            JOptionPane.showMessageDialog(window, "Usuário ou senha incorretos.");
        }
    }
}
