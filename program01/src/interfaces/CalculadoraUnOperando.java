package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraUnOperando extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texto;
	private JPanel panel;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraUnOperando frame = new CalculadoraUnOperando();
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
	public CalculadoraUnOperando() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		texto = new JTextField();
		contentPane.add(texto, BorderLayout.NORTH);
		texto.setColumns(10);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		bt1 = new JButton("-");
		panel.add(bt1);
		bt1.addActionListener(this);
		
		bt2 = new JButton("x2");
		panel.add(bt2);
		bt2.addActionListener(this);
		
		bt3 = new JButton("x3");
		panel.add(bt3);
		bt3.addActionListener(this);
		
		bt4 = new JButton("Raíz");
		panel.add(bt4);
		bt4.addActionListener(this);
		
		bt5 = new JButton("1/x");
		panel.add(bt5);
		bt5.addActionListener(this);
		
		bt6 = new JButton("CE");
		panel.add(bt6);
		bt6.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		
		String txt = texto.getText();
		Double operando;
		operando = Double.parseDouble(txt);
		
		Double resultado = 0.0;
		
		if (o == this.bt1){
			resultado = -operando;
		}
		else if (o == this.bt2){
			resultado = operando * operando;
		}
		else if (o == this.bt3){
			resultado = operando * operando * operando;
		}
		else if (o == this.bt4){
			resultado = Math.sqrt(operando);
		}
		else if (o == this.bt5){
			resultado = 1/operando;
		}
		
		/* 
		else if (o == this.bt6){
		} 
		*/
		
		txt = resultado.toString();
		texto.setText(txt);
	}

}
