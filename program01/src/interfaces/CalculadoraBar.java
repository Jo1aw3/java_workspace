package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import java.awt.Dimension;

public class CalculadoraBar extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JTextField textField;
	private JLabel lblOperando;
	private JLabel lblOperacion;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn;
	private JButton btnIgual;
	private JButton btnPunto;
	private JButton btnSuma;
	private JButton btnResta;
	private JButton btnDividir;
	private JButton btnMultiplicar;
	private JButton btnCE;
//	private JMenuBar bar;
//	private JMenu menu_archivo;
//	private JMenu menu_operaciones;
//	private JMenuItem item_nuevo;
//	private JMenuItem item_salir;
//	private JMenuItem item_sumar;
//	private JMenuItem item_restar;
//	private JMenuItem item_multiplicar;
//	private JMenuItem item_dividir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBar frame = new CalculadoraBar();
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
	public CalculadoraBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		bar = new JMenuBar();
		setJMenuBar(bar);
		
		menu_archivo = new JMenu("Archivo");
		bar.add(menu_archivo);
		
		item_nuevo = new JMenuItem("Nuevo");
		menu_archivo.add(item_nuevo);
		item_nuevo.addActionListener(this);
		
		separator_0 = new JSeparator();
		menu_archivo.add(separator_0);
		
		item_salir = new JMenuItem("Salir");
		menu_archivo.add(item_salir);
		item_salir.addActionListener(this);
		
		menu_operaciones = new JMenu("Operaciones");
		bar.add(menu_operaciones);
		
		item_sumar = new JMenuItem("Sumar");
		menu_operaciones.add(item_sumar);
		item_sumar.addActionListener(this);
		
		separator_1 = new JSeparator();
		menu_operaciones.add(separator_1);
		
		item_restar = new JMenuItem("Restar");
		menu_operaciones.add(item_restar);
		item_restar.addActionListener(this);
		
		separator_2 = new JSeparator();
		menu_operaciones.add(separator_2);
		
		item_multiplicar = new JMenuItem("Multiplicar");
		menu_operaciones.add(item_multiplicar);
		item_multiplicar.addActionListener(this);
		
		separator_3 = new JSeparator();
		menu_operaciones.add(separator_3);
		
		item_dividir = new JMenuItem("Dividir");
		menu_operaciones.add(item_dividir);
		item_dividir.addActionListener(this);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setText("0");
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblOperando = new JLabel("");
		panel_1.add(lblOperando);
		
		lblOperacion = new JLabel("");
		panel_1.add(lblOperacion);
		
		tool = new JToolBar();
		panel.add(tool, BorderLayout.NORTH);
		
		btool_nuevo = new JButton("");
		btool_nuevo.setIcon(new ImageIcon(CalculadoraBar.class.getResource("/iconos/nuevo.gif")));
		tool.add(btool_nuevo);
		btool_nuevo.addActionListener(this);
		
		btool_salir = new JButton("");
		btool_salir.setIcon(new ImageIcon(CalculadoraBar.class.getResource("/iconos/salir.gif")));
		tool.add(btool_salir);
		btool_salir.addActionListener(this);
		
		btool_sumar = new JButton("+");
		btool_sumar.setFont(new Font("Tahoma", Font.PLAIN, 33));
		tool.add(btool_sumar);
		btool_sumar.addActionListener(this);
		
		btool_restar = new JButton("-");
		btool_restar.setFont(new Font("Tahoma", Font.PLAIN, 33));
		tool.add(btool_restar);
		btool_restar.addActionListener(this);
		
		btool_multiplicar = new JButton("*");
		btool_multiplicar.setFont(new Font("Tahoma", Font.PLAIN, 33));
		tool.add(btool_multiplicar);
		btool_multiplicar.addActionListener(this);
		
		btool_dividir = new JButton("/");
		btool_dividir.setFont(new Font("Tahoma", Font.PLAIN, 33));
		tool.add(btool_dividir);
		btool_dividir.addActionListener(this);
		
		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 3, 0, 0));
		
		btn7 = new JButton("7");
		btn7.setForeground(Color.BLUE);
		btn7.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn7);
		btn7.addActionListener(this);
		
		btn8 = new JButton("8");
		btn8.setForeground(Color.BLUE);
		btn8.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn8);
		btn8.addActionListener(this);
		
		btn9 = new JButton("9");
		btn9.setForeground(Color.BLUE);
		btn9.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn9);
		btn9.addActionListener(this);
		
		btn4 = new JButton("4");
		btn4.setForeground(Color.BLUE);
		btn4.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn4);
		btn4.addActionListener(this);
		
		btn5 = new JButton("5");
		btn5.setForeground(Color.BLUE);
		btn5.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn5);
		btn5.addActionListener(this);
		
		btn6 = new JButton("6");
		btn6.setForeground(Color.BLUE);
		btn6.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn6);
		btn6.addActionListener(this);
		
		btn1 = new JButton("1");
		btn1.setForeground(Color.BLUE);
		btn1.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn1);
		btn1.addActionListener(this);
		
		btn2 = new JButton("2");
		btn2.setForeground(Color.BLUE);
		btn2.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn2);
		btn2.addActionListener(this);
		
		btn3 = new JButton("3");
		btn3.setForeground(Color.BLUE);
		btn3.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn3);
		btn3.addActionListener(this);
		
		btn0 = new JButton("0");
		btn0.setForeground(Color.BLUE);
		btn0.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btn0);
		btn0.addActionListener(this);
		
		btnIgual = new JButton("=");
		btnIgual.setForeground(Color.BLUE);
		btnIgual.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btnIgual);
		btnIgual.addActionListener(this);
		
		btnPunto = new JButton(".");
		btnPunto.setForeground(Color.BLUE);
		btnPunto.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_2.add(btnPunto);
		btnPunto.addActionListener(this);
		
		panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		panel_4 = new JPanel();
		panel_3.add(panel_4, BorderLayout.WEST);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnSuma = new JButton("+");
		btnSuma.setForeground(Color.BLUE);
		btnSuma.setFont(new Font("Calibri", Font.BOLD, 22));
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_4.add(btnSuma);
		btnSuma.addActionListener(this);
		
		btnResta = new JButton("-");
		btnResta.setForeground(Color.BLUE);
		btnResta.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_4.add(btnResta);
		btnResta.addActionListener(this);
		
		btnMultiplicar = new JButton("*");
		btnMultiplicar.setForeground(Color.BLUE);
		btnMultiplicar.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_4.add(btnMultiplicar);
		btnMultiplicar.addActionListener(this);
		
		btnDividir = new JButton("/");
		btnDividir.setForeground(Color.BLUE);
		btnDividir.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_4.add(btnDividir);
		btnDividir.addActionListener(this);
		
		panel_5 = new JPanel();
		panel_3.add(panel_5, BorderLayout.EAST);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		btnCE = new JButton("CE");
		btnCE.setForeground(Color.BLUE);
		btnCE.setFont(new Font("Calibri", Font.BOLD, 22));
		panel_5.add(btnCE, BorderLayout.WEST);
		btnCE.addActionListener(this);
	}
	boolean haySeparadorDecimal = false;
	private JMenuBar bar;
	private JMenu menu_archivo;
	private JMenu menu_operaciones;
	private JMenuItem item_nuevo;
	private JSeparator separator_0;
	private JMenuItem item_salir;
	private JMenuItem item_sumar;
	private JSeparator separator_1;
	private JMenuItem item_restar;
	private JSeparator separator_2;
	private JMenuItem item_multiplicar;
	private JSeparator separator_3;
	private JMenuItem item_dividir;
	private JToolBar tool;
	private JButton btool_nuevo;
	private JButton btool_salir;
	private JButton btool_sumar;
	private JButton btool_restar;
	private JButton btool_multiplicar;
	private JButton btool_dividir;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		String texto = "";
		if ( (o == btn1 ) || ( o == btn2 ) || ( o == btn3 ) || ( o == btn4 ) || ( o == btn5 ) || ( o == btn6 ) || ( o == btn7 ) || ( o == btn8 ) || ( o == btn9 ) ) {
			if (textField.getText().equals("0")) {
				texto = ((JButton)o).getText();
			}
			else {
				texto = textField.getText() + ((JButton)o).getText();
			}
			this.textField.setText(texto);
			
			
			
			
		} else if ( ( o == btnSuma) || ( o == btnResta ) || ( o == btnMultiplicar ) || ( o == btnDividir ) ) {
			texto = ((JButton)o).getText();
			this.lblOperacion.setText(texto);
			texto = this.textField.getText();
			this.lblOperando.setText(texto);
			this.textField.setText("0");
			haySeparadorDecimal = false;
		
			
		} else if ( ( o == btnIgual) || ( o == textField)) {
			if(!this.textField.getText().equals("")) {
			double resultado = 0.0;
			double num1 = Double.parseDouble(this.lblOperando.getText());
			double num2 = Double.parseDouble(this.textField.getText());
			if ( this.lblOperacion.getText() == "+" ) {
				resultado = num1 + num2;
			} else if ( this.lblOperacion.getText() == "-") {
				resultado = num1 - num2;
			} else if ( this.item_restar.getText() == "-") {
				resultado = num1 - num2;
			} else if ( this.lblOperacion.getText() == "*") {
				resultado = num1 * num2;
			} else if ( this.lblOperacion.getText() == "/") {
				resultado = num1 * num2;
			}
				this.lblOperacion.setText("");
				this.lblOperando.setText("");
				this.textField.setText(Double.toString(resultado));
				haySeparadorDecimal = true;
			}
		} else if (( o == btnPunto)) {
			if(!haySeparadorDecimal) {
				this.textField.setText(this.textField.getText() + ".");
				haySeparadorDecimal = true;
			}
				
		} else if ( ( o == btnCE ) ) {
			this.textField.setText("0");
			haySeparadorDecimal = false;
			this.lblOperacion.setText("");
			this.lblOperando.setText("");
		} 
		
		else if ((o == item_nuevo)) {
			btnCE.doClick();
		}
		else if ((o == btool_nuevo)) {
			btnCE.doClick();
		}
		else if ((o == item_sumar)) {
			btnSuma.doClick();
		}
		else if ((o == item_restar)) {
			btnSuma.doClick();
		}
		else if ((o == item_multiplicar)) {
			btnSuma.doClick();
		}
		else if ((o == item_dividir)) {
			btnSuma.doClick();
		}
		else if ((o == btool_sumar)) {
			btnSuma.doClick();
		}
		else if ((o == btool_restar)) {
			btnSuma.doClick();
		}
		else if ((o == btool_multiplicar)) {
			btnSuma.doClick();
		}
		else if ((o == btool_dividir)) {
			btnSuma.doClick();
		}
		else if ((o == item_salir)) {
			System.exit(0);
		}
		else if ((o == btool_salir)) {
			System.exit(0);
		}
		
	}

}

