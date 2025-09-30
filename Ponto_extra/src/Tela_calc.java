import javax.swing.*;
public class Tela_calc {
    JFrame window = new JFrame("Calculadora");
    JButton B9 = new JButton("9");
    JButton B8 = new JButton("8");
    JButton B7 = new JButton("7");
    JButton B6 = new JButton("6");
    JButton B5 = new JButton("5");
    JButton B4 = new JButton("4");
    JButton B3 = new JButton("3");
    JButton B2 = new JButton("2");
    JButton B1 = new JButton("1");
    JButton B0 = new JButton("0");
    JButton Bmais = new JButton("+");
    JButton Bmenos = new JButton("-");
    JButton Bvezes = new JButton("*");
    JButton Bdividido = new JButton("/");
    JButton Bigual = new JButton("=");
    JButton Bclear = new JButton("C");
    JLabel display = new JLabel("00");
    JButton back = new JButton("Voltar");
    char operador;
    String valor1;  

    public Tela_calc() {
        window.setSize(350, 470);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new java.awt.Font("Segoe UI", 0, 24));
        display.setBounds(20, 50, 290, 50);
        window.add(display);

        B9.setBounds(160, 150, 60, 50);
        window.add(B9);
        B9.addActionListener(e -> preecher_visor("9"));

        B8.setBounds(20, 220, 60, 50);
        window.add(B8);
        B8.addActionListener(e -> preecher_visor("8"));

        B7.setBounds(90, 220, 60, 50);
        window.add(B7);
        B7.addActionListener(e -> preecher_visor("7"));

        B6.setBounds(160, 220, 60, 50);
        window.add(B6);
        B6.addActionListener(e -> preecher_visor("6"));

        B5.setBounds(20, 290, 60, 50);
        window.add(B5);
        B5.addActionListener(e -> preecher_visor("5"));

        B4.setBounds(90, 290, 60, 50);
        window.add(B4);
        B4.addActionListener(e -> preecher_visor("4"));

        B3.setBounds(160, 290, 60, 50);
        window.add(B3);
        B3.addActionListener(e -> preecher_visor("3"));

        B2.setBounds(20, 360, 60, 50);
        window.add(B2);
        B2.addActionListener(e -> preecher_visor("2"));

        B1.setBounds(90, 360, 60, 50);
        window.add(B1);
        B1.addActionListener(e -> preecher_visor("1"));

        B0.setBounds(90, 150, 60, 50);
        window.add(B0);
        B0.addActionListener(e -> preecher_visor("0"));

        Bmais.setBounds(230, 150, 60, 50);
        window.add(Bmais);
        Bmais.addActionListener(e -> {
            valor1 = display.getText();
            operador = '+';
            display.setText("");
        });

        Bmenos.setBounds(230, 220, 60, 50);
        window.add(Bmenos);
        Bmenos.addActionListener(e -> {
            valor1 = display.getText();
            operador = '-';
            display.setText("");
        }); 

        Bvezes.setBounds(230, 290, 60, 50);
        window.add(Bvezes);
        Bvezes.addActionListener(e -> {
            valor1 = display.getText();
            operador = '*';
            display.setText("");
        });

        Bdividido.setBounds(230, 360, 60, 50);
        window.add(Bdividido);
        Bdividido.addActionListener(e -> {
            valor1 = display.getText();
            operador = '/';
            display.setText("");
        });
        Bigual.setBounds(160, 360, 60, 50);
        window.add(Bigual);
        Bigual.addActionListener(e -> calcular());

        Bclear.setBounds(20, 150, 60, 50);
        window.add(Bclear);
        Bclear.addActionListener(e -> display.setText(""));

        back.setBounds(10, 10, 80, 30);
        window.add(back);
        back.addActionListener(e -> {
            window.dispose();
            new Tela_inicial();
        });
        window.setVisible(true);
    }
    private void preecher_visor(String valor){
        String valor_atual = display.getText(); // pega o texto atual do visor
        display.setText(valor_atual + valor); // adiciona o texto ao valor atual
    }
    private void calcular(){
        String valor2 = display.getText();
        double resultado = 0;
        switch(operador){
            case '+':
                resultado = Double.parseDouble(valor1) + Double.parseDouble(valor2);
                break;
            case '-':
                resultado = Double.parseDouble(valor1) - Double.parseDouble(valor2);
                break;
            case '*':
                resultado = Double.parseDouble(valor1) * Double.parseDouble(valor2);
                break;
            case '/':
                resultado = Double.parseDouble(valor1) / Double.parseDouble(valor2);
                break;
        }
        display.setText(String.valueOf(resultado));
    }
}