import javax.swing.*;
public class Tela_inicial {
    JFrame window = new JFrame("Tela Inicial");
    JButton calc = new JButton("Calculadora");
    JButton notas = new JButton("Notas");
    JButton coversor = new JButton("Conversor");

    Tela_inicial() {
        window.setSize(738, 594);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);

        calc.setBounds(300, 200, 150, 40);
        window.add(calc);
        calc.addActionListener(e -> {
            window.dispose();
            new Tela_calc();
        });

        notas.setBounds(300, 260, 150, 40);
        window.add(notas);
        notas.addActionListener(e -> {
            window.dispose();
            new Tela_media();
        });

        coversor.setBounds(300, 320, 150, 40);
        window.add(coversor);
        coversor.addActionListener(e -> {
            window.dispose();
            new Tela_conv();
        });

        window.setVisible(true);
    }
}
