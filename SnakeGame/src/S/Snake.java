package S;

import javax.swing.JFrame;

public class Snake extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Snake() {		//CLASE PRINCIPAL
		
		Panel grafico = new Panel();   //Lo primero que hacemos es crear una nueva ventana mediante la clase "Panel"
		
		getContentPane().add(grafico);  // Lo añadimos al panel principal 
		
		this.setResizable(false);	// Para no poder cambiar el tamaño de la ventana
		
		this.pack(); 			// Para que se adapte al contenido que contiene.
		
		this.setVisible(true);   // La hacemos visible 
		
		this.setLocationRelativeTo(null);	//Para que aparezca en el medio
		
	}
}