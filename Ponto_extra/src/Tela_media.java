import javax.swing.*;

public class Tela_media {
    JFrame window = new JFrame("Média de Notas");
    JLabel label1 = new JLabel("Nota 1:");
    JTextField text1 = new JTextField();
    JLabel label2 = new JLabel("Nota 2:");  
    JTextField text2 = new JTextField();
    JLabel label3 = new JLabel("Nota 3:");
    JTextField text3 = new JTextField();
    JButton calcular = new JButton("Calcular");
    JLabel resultado = new JLabel("Resultado:");
    JButton back = new JButton("Voltar");
    public Tela_media() {
        window.setSize(300, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        label1.setBounds(20, 20, 100, 25);
        window.add(label1);
        text1.setBounds(120, 20, 100, 25);
        window.add(text1);

        label2.setBounds(20, 60, 100, 25);
        window.add(label2);
        text2.setBounds(120, 60, 100, 25);
        window.add(text2);

        label3.setBounds(20, 100, 100, 25);
        window.add(label3);
        text3.setBounds(120, 100, 100, 25);
        window.add(text3);

        calcular.setBounds(90, 140, 100, 30);
        window.add(calcular);
        calcular.addActionListener(e -> calcular_media());

        resultado.setBounds(20, 180, 200, 25);
        window.add(resultado);

        back.setBounds(90, 220, 100, 30);
        window.add(back);
        back.addActionListener(e -> {
            window.dispose();
            new Tela_inicial();
        });
        window.setVisible(true);
    }
    void calcular_media() {
        try {
            double n1 = Double.parseDouble(text1.getText());
            double n2 = Double.parseDouble(text2.getText());
            double n3 = Double.parseDouble(text3.getText());
            double media = (n1 + n2 + n3) / 3;
            resultado.setText("Resultado: " + String.format("%.2f", media));
        } catch (NumberFormatException e) {
            resultado.setText("Por favor, insira números válidos.");
        }
    }
}