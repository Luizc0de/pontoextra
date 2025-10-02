import javax.swing.*;
public class Tela_inicial {
    JFrame window = new JFrame("Tela Inicial");
    JButton calc = new JButton("Calculadora",new ImageIcon(getClass().getResource("/calculadora.png")));
    JButton notas = new JButton("Notas",new ImageIcon(getClass().getResource("/bloc.png")));
    JButton coversor = new JButton("Conversor",new ImageIcon(getClass().getResource("/cifrao.png")));
    JButton Imc = new JButton("IMC",new ImageIcon(getClass().getResource("/imc.png")));
    JLabel wallpaper = new JLabel(new ImageIcon(getClass().getResource("/sla2RE.jpg")));

    Tela_inicial() {
        window.setSize(600, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
       

        calc.setBounds(230, 120, 150, 50);
        window.add(calc);
        calc.addActionListener(e -> {
            window.dispose();
            new Tela_calc();
        });

        notas.setBounds(230, 190, 150, 50);
        window.add(notas);
        notas.addActionListener(e -> {
            window.dispose();
            new Tela_media();
        });

        coversor.setBounds(230, 260, 150, 50);
        window.add(coversor);
        coversor.addActionListener(e -> {
            window.dispose();
            new Tela_conv();
        });
        Imc.setBounds(230, 320, 150, 50);
        window.add(Imc);

        wallpaper.setBounds(0, -110, 600, 800);
        wallpaper.setVisible(true);
        window.add(wallpaper);
        window.setVisible(true);
    }
}
