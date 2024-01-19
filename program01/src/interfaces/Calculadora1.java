package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Calculadora1 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JTextField textField;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora1 frame = new Calculadora1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setText("0.0");
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		btn1 = new JButton("-");
		panel.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("x2");
		panel.add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("x3");
		panel.add(btn3);
		btn3.addActionListener(this);
		
		btn4 = new JButton("Raiz Cuadrada");
		panel.add(btn4);
		btn4.addActionListener(this);
		
		btn5 = new JButton("1/x");
		panel.add(btn5);
		btn5.addActionListener(this);
		
		btn6 = new JButton("CE");
		panel.add(btn6);
		btn6.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		double num = Double.parseDouble(textField.getText());
		double resultado = 0.0;
		
		if (o == btn1){ // si se ha pulsado -
			resultado = -num;
			
		}
		
		else if (o == btn2){ // si se ha pulsado x2
			resultado = Math.pow(resultado, 2);
			
		}
		
		else if (o == btn3){  // si se ha pulsado x3
			resultado = Math.pow(resultado, 3);
			
		}
		
		else if (o == btn4){ // si se ha pulsado Raiz Cuadrada
			resultado = Math.sqrt(num);
			
		}
		
		else if (o == btn5){  // si se ha pulsado 1/x
			resultado = 1 / num;
		}
		
		else if (o == btn6){ // si se ha pulsado CE
			resultado = 0.0;
		}
		textField.setText(Double.toString(resultado));
	}

}
