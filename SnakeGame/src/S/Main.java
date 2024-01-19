package S;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Main extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton botonStart;
	private JPanel panel;					//ATRIBUTOS
	private JLabel lblManzana;
	private JLabel lblCulebra;
	private JLabel lblSnakeGame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();			//MAIN
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
	public Main() {  //DISEÑO DE LA PORTADA CON WINDOW BUILDER
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);								//PANEL PRINCIPAL
		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(413, 375));
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(5, 0, 469, 440);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 20, true));				//PANEL SECUNDARIO PARA AÑADIR LAS COSAS
		panel.setBackground(new Color(200, 247, 157));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		botonStart = new JButton("");
		botonStart.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));				//BOTON
		botonStart.setIcon(new ImageIcon("start.png"));
		botonStart.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 42));
		botonStart.setBackground(new Color(0, 255, 128));
		botonStart.setBounds(170, 302, 137, 86);
		panel.add(botonStart);
		botonStart.addActionListener(this);
		
		lblCulebra = new JLabel("");
		lblCulebra.setIcon(new ImageIcon("Snake.png"));
		lblCulebra.setHorizontalAlignment(SwingConstants.CENTER);			//SERPIENTE
		lblCulebra.setBounds(182, 145, 143, 132);
		panel.add(lblCulebra);
		
		lblManzana = new JLabel("");
		lblManzana.setIcon(new ImageIcon("manzana.png"));
		lblManzana.setBounds(136, 103, 103, 113);
		panel.add(lblManzana);
		
		lblSnakeGame = new JLabel("Snake Game");
		lblSnakeGame.setForeground(Color.BLACK);
		lblSnakeGame.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 48));				//TITULO DEL JUEGO
		lblSnakeGame.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnakeGame.setBounds(62, 38, 340, 86);
		panel.add(lblSnakeGame);
		
		this.setLocationRelativeTo(null);		//PARA QUE EL PANEL APAREZCA EN EL MEDIO
		
		this.setResizable(false);				//PARA NO PODER CAMBIAR EL TAMAÑO DE LA VENTANA
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if ( o.equals(botonStart)) {
			this.setVisible(false);		//Cuando pulsemos el boton de Start, escondemos el panel de la portada y creamos una nueva clase Snake
			new Snake();
		}
	}


}
