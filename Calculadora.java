import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtResultado;
	Double valor1 , valor2; 
	String sinal;

	public Calculadora() {
		
		super("Calculadora");
		
		contentPane = new JPanel();	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
        
        txtResultado = new JTextField();
		txtResultado.setBackground(new Color(255, 255, 255));
		txtResultado.setEditable(false); // não clicável
		txtResultado.setBounds(25, 18, 270, 30); // definindo o tamanho do campo
		contentPane.add(txtResultado);
		
		JButton botao1 = new JButton("7");
		botao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"7");
			}
		});
		botao1.setBounds(25, 75, 50, 40);
		contentPane.add(botao1);
		
		JButton botao2 = new JButton("8");
		botao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"8");
			}
		});
		botao2.setBounds(80, 75, 50, 40);
		contentPane.add(botao2);
		
		JButton botao3 = new JButton("9");
		botao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"9");
			}
		});
		botao3.setBounds(135, 75, 50, 40);
		contentPane.add(botao3);
		
		JButton botao4 = new JButton("\u221A");
		botao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				sinal = "raiz";
			}
		});
		botao4.setBounds(190, 75, 50, 40);
		contentPane.add(botao4);
		
		JButton botao5 = new JButton("+");
		botao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "soma";
			}
		});
		botao5.setBounds(245, 75, 50, 40);
		contentPane.add(botao5);
		
		JButton botao6 = new JButton("4");
		botao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"4");
			}
		});
		botao6.setBounds(25, 120, 50, 40);
		contentPane.add(botao6);
		
		JButton botao7 = new JButton("5");
		botao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"5");
			}
		});
		botao7.setBounds(80, 120, 50, 40);
		contentPane.add(botao7);
		
		JButton botao8 = new JButton("6");
		botao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"6");
			}
		});
		botao8.setBounds(135, 120, 50, 40);
		contentPane.add(botao8);
		
		JButton botao9 = new JButton("C");
		botao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1=0.0;
				valor2=0.0;
				txtResultado.setText("");
			}
		});
		botao9.setBounds(190, 120, 50, 40);
		contentPane.add(botao9);
		
		JButton botao10 = new JButton("-");
		botao10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "sub";
			}
		});
		botao10.setBounds(245, 120, 50, 40);
		contentPane.add(botao10);
		
		JButton botao11 = new JButton("1");
		botao11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"1");
			}
		});
		botao11.setBounds(25, 165, 50, 40);
		contentPane.add(botao11);
		
		JButton botao12 = new JButton("2");
		botao12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"2");
			}
		});
		botao12.setBounds(80, 165, 50, 40);
		contentPane.add(botao12);
		
		JButton botao13 = new JButton("3");
		botao13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"3");
			}
		});
		botao13.setBounds(135, 165, 50, 40);
		contentPane.add(botao13);
		
		JButton botao14 = new JButton("CE");
		botao14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");
			}
		});
		botao14.setBounds(190, 165, 50, 40);
		contentPane.add(botao14);
		
		JButton botao15 = new JButton("X");
		botao15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "mult";
			}
		});
		botao15.setBounds(245, 165, 50, 40);
		contentPane.add(botao15);
		
		JButton botao16 = new JButton("0");
		botao16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+"0");
			}
		});
		botao16.setBounds(25, 210, 105, 40);
		contentPane.add(botao16);
		
		JButton botao17 = new JButton(".");
		botao17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText(txtResultado.getText()+".");
			}
		});
		botao17.setBounds(135, 210, 50, 40);
		contentPane.add(botao17);
		
		JButton botao19 = new JButton("/");
		botao19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtResultado.getText());
				txtResultado.setText("");
				sinal = "div";
			}
		});
		botao19.setBounds(245, 210, 50, 40);
		contentPane.add(botao19);
		
		JButton botao20 = new JButton("Sair");
		botao20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		botao20.setBounds(215, 275, 80, 25);
		contentPane.add(botao20);
		
		JButton botao18 = new JButton("=");	
		botao18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(sinal.equals("soma")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1+valor2));
					valor1 = valor1+valor2;
				}
				else if (sinal.equals("sub")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1-valor2));
					valor1 = valor1-valor2;
				}
				else if (sinal.equals("mult")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1*valor2));
					valor1 = valor1*valor2;
				}
				else if (sinal.equals("div")) {
					valor2 = Double.parseDouble(txtResultado.getText());
					txtResultado.setText(String.valueOf(valor1/valor2));
					valor1 = valor1/valor2;
				}
				else if (sinal.equals("raiz")) {
					valor1 = Math.sqrt(valor1);
					txtResultado.setText(String.valueOf(valor1));
				}
			}
		});
		
		botao18.setBounds(190, 210, 50, 40);
		contentPane.add(botao18);
		
		setSize(340, 400);
        setVisible(true);   
        
        ButtonHandler handler = new ButtonHandler();
    	botao20.addActionListener(handler);
	}
	
	// criando a classe de evento do botao 
		private class ButtonHandler implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("Sair")) {
					dispose();
				}	
			}	
		}
	
	public static void main(String[] args) {
		new Calculadora();
	}
}
