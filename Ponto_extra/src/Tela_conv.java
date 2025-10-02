import javax.swing.*;
public class Tela_conv {
    double dolar = 5.20;
    double euro = 6.10;
    JFrame window = new JFrame("Conversor de Moedas");
    JLabel label1 = new JLabel("Valor em Reais:");
    JTextField text1 = new JTextField();
    JButton toDolar = new JButton("Converter para Dólar");
    JButton toEuro = new JButton("Converter para Euro");
    JLabel resultado = new JLabel("Resultado:");
    JButton back = new JButton("Voltar");
    public Tela_conv() {
        window.setSize(300, 270);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        label1.setBounds(20, 20, 100, 25);
        window.add(label1);
        text1.setBounds(120, 20, 100, 25);
        window.add(text1);

        toDolar.setBounds(50, 60, 200, 30);
        window.add(toDolar);
        toDolar.addActionListener(e -> {
            
            double reais = Double.parseDouble(text1.getText());
            double dolares = reais / dolar;
            resultado.setText("Resultado: " + String.format("%.2f", dolares) + " USD");
                     
        });

        toEuro.setBounds(50, 100, 200, 30);
        window.add(toEuro);
        toEuro.addActionListener(e -> {
            double reais = Double.parseDouble(text1.getText());
            double euros = reais / euro;
            resultado.setText("Resultado: " + String.format("%.2f", euros) + " EUR");   
        });

        resultado.setBounds(20, 140, 250, 25);
        window.add(resultado);

        back.setBounds(90, 180, 100, 30);
        window.add(back);
        back.addActionListener(e -> {
            window.dispose();
            new Tela_inicial();
        });
        window.setVisible(true);
    }
}