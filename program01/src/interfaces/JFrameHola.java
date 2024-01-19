package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JFrameHola extends JFrame {
private JPanel contentPane;
// Creo el JFrame
public JFrameHola() {
 setTitle("JFrame Hola");
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setBounds(100, 100, 450, 300);
 contentPane = new JPanel();
 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 contentPane.setLayout(new BorderLayout(0, 0));
 setContentPane(contentPane);
 }

	// Ejecuto la aplicacion
 	public static void main(String[] args) {
 		EventQueue.invokeLater(new Runnable() {
 			public void run() {
 				try {
 				JFrameHola frame = new JFrameHola();
 				frame.setVisible(true);
 			} catch (Exception e) {
 				e.printStackTrace();
 			}
 			}
 		});
 	}
 }