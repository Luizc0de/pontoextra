import javax.swing.*;
public class Tela_imc {
    JFrame window = new JFrame("Calculadora IMC");
    JLabel label1 = new JLabel("Digite seu peso (kg):");
    JTextField peso = new JTextField();
    JLabel label2 = new JLabel("Digite sua altura (m):");
    JTextField altura = new JTextField();
    JButton calc = new JButton("Calcular IMC");
    JLabel resultado = new JLabel("");
    JButton voltar = new JButton("Voltar");

    Tela_imc() {
        window.setSize(600, 360);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setResizable(false);
        window.setLocationRelativeTo(null);

        label1.setBounds(50, 100, 200, 30);
        window.add(label1);

        peso.setBounds(250, 100, 200, 30);
        window.add(peso);

        label2.setBounds(50, 150, 200, 30);
        window.add(label2);

        altura.setBounds(250, 150, 200, 30);
        window.add(altura);

        calc.setBounds(200, 200, 150, 30);
        window.add(calc);
        calc.addActionListener(e -> {
            try {
                double p = Double.parseDouble(peso.getText());
                double a = Double.parseDouble(altura.getText());
                double imc = p / (a * a);
                String classificacao;
                if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc < 24.9) {
                    classificacao = "Peso normal";
                } else if (imc < 29.9) {
                    classificacao = "Sobrepeso";
                } else if (imc < 34.9) {
                    classificacao = "Obesidade grau I";
                } else if (imc < 39.9) {
                    classificacao = "Obesidade grau II";
                } else {
                    classificacao = "Obesidade grau III";
                }
                resultado.setText(String.format("IMC: %.2f - %s", imc, classificacao));
            } catch (NumberFormatException ex) {
                resultado.setText("Por favor, insira valores válidos.");
            }
        });
        resultado.setBounds(50, 250, 500, 30);
        window.add(resultado);
        voltar.setBounds(10, 10, 100, 30);
        window.add(voltar);
        voltar.addActionListener(e -> {
            window.dispose();
            new Tela_inicial();
        });
        window.setVisible(true);

    }    
}
