package ventanas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ventana02 extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JMenu mnHelp;
	private JMenuItem ItemNew;
	private JMenuItem ItemOpen;
	private JMenuItem ItemExit;
	private JMenuItem ItemCopy;
	private JMenuItem ItemPaste;
	private JMenuItem ItemHelp;
	private JMenuItem ItemMore;
	private JLabel lblEstado;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana02 frame = new Ventana02();
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
	public Ventana02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		ItemNew = new JMenuItem("New");
		mnFile.add(ItemNew);
		ItemNew.addActionListener(this);
		
		ItemOpen = new JMenuItem("Open");
		mnFile.add(ItemOpen);
		ItemOpen.addActionListener(this);
		
		ItemExit = new JMenuItem("Exit");
		mnFile.add(ItemExit);
		ItemExit.addActionListener(this);
		
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		ItemCopy = new JMenuItem("Copy");
		mnEdit.add(ItemCopy);
		ItemCopy.addActionListener(this);
		
		ItemPaste = new JMenuItem("Paste");
		mnEdit.add(ItemPaste);
		ItemPaste.addActionListener(this);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		ItemHelp = new JMenuItem("Help Content");
		ItemHelp.setIcon(new ImageIcon(Ventana02.class.getResource("/iconos/acercade.gif")));
		mnHelp.add(ItemHelp);
		ItemHelp.addActionListener(this);
		
		ItemMore = new JMenuItem("More Infor...");
		mnHelp.add(ItemMore);
		ItemMore.addActionListener(this);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblEstado = new JLabel(". . .");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblEstado, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		
		if (o == ItemOpen) {
			JFileChooser fileChooser = new JFileChooser();
			int opcion = fileChooser.showOpenDialog(this);
			if (opcion == JFileChooser.APPROVE_OPTION){
				// si ha pulsado Aceptar
				lblEstado.setText("Ha elegido el archivo "+fileChooser.getSelectedFile());
				}
				else if (opcion == JFileChooser.CANCEL_OPTION){
				// si ha pulsado Cancelar
				lblEstado.setText("Ha pulsado Cancelar");
				}
				else if (opcion == JFileChooser.ERROR_OPTION){
				// si ha producido un Error
				lblEstado.setText("Se ha producido un Error.");
				}
		}
		
	}

}
