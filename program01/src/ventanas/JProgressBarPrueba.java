package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.JButton;

public class JProgressBarPrueba extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblProgreso;
	private JProgressBar progressBar;
	private JButton btnStart;
	private JLabel lblEstado;
	private Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBarPrueba frame = new JProgressBarPrueba();
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
	public JProgressBarPrueba() {
		setTitle("JProgressBarPrueba");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		lblProgreso = new JLabel("Prorgeso");
		panel.add(lblProgreso);

		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		panel.add(progressBar);

		timer = new Timer(10,this);

		btnStart = new JButton("Start");
		panel.add(btnStart);
		btnStart.addActionListener(this);

		lblEstado = new JLabel(". . .");
		contentPane.add(lblEstado, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		if (o == btnStart) {
			// Si se pulsa start
			// inicializo el valor de la barra de progreso a su valor minimo
			progressBar.setValue(progressBar.getMinimum());
			timer.start();
		} else {
			// si el evento lo genera el timer
			int valor;
			valor = progressBar.getValue();
			valor = valor + 1;
			progressBar.setValue(valor);
			lblEstado.setText("Procesando...");
			if (valor == progressBar.getMaximum()) {
				// si la barra de progreso alcanza su valor maximo
				// paro el timer
				timer.stop();
				lblEstado.setText("Finalizado");
			}
		}
	}
}