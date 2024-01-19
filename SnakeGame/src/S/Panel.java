
package S;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Panel extends JPanel implements ActionListener {

	// ATRIBUTOS

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ANCHO = 500; 	// Dimensiones
	private int ALTO = 500;
	private int CUADRADO = 20; 	// Borde de un cuadrado
	private int CUADRADOS = (ANCHO * ALTO) / (CUADRADO * CUADRADO); // Cant. Cuadrados ( dimensiones / n.cuadrados )
	private int tamaño = 5; // num.cuadrados de la serpiente al iniciar el juego
	private int numManzanas; // Manzanas comidas
	private int manzanaX; // Coordenada X de la manzana random
	private int manzanaY; // Coordenada Y de la manzana random
	private String direccion = "ABAJO"; // Direccion de la serpiente. Empezamos el juego yendo hacia abajo
	private boolean jugando = false; // Variable booleana para saber cuando está el juego en marcha.

	
	// Dos arrays para el cuerpo de la serpiente.
	// Uno de ellos cogerá los numeros de la coordenada X ( ancho ) y otro los de la
	// coordenada Y ( alto )
	private int x[] = new int[CUADRADOS];
	private int y[] = new int[CUADRADOS];

	private Random random; // Para generar un numero random
	private Timer timer; // Temporizador ( dependiendo del valor del delay la serpiente irá más rápido o despacio )

	
	
	// Creamos el constructor ( con las dimensiones, el color de fondo 
	public Panel() {
		this.setPreferredSize(new Dimension(ANCHO, ALTO));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());   // Sistema que controla la pulsacion de las teclas
		jugar();
	}

	// Mediante el metodo graphics ( si jugando está en true ), pintamos la comida,
	// la cabeza, la cola y el score
	// En caso contrario, llamamos al metodo "fin" que hace dibujar el fin de la
	// partida

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		dibujar(g);
	}

	public void dibujar(Graphics g) {

		if (jugando) {
			g.setColor(new Color(210, 115, 90)); 	// COMIDA
			g.fillOval(manzanaX, manzanaY, CUADRADO, CUADRADO);

			g.setColor(Color.white); 	// CABEZA
			g.fillRect(x[0], y[0], CUADRADO, CUADRADO);

			for (int i = 1; i < tamaño; i++) {
				g.setColor(new Color(108, 202, 37)); 	// COLA
				g.fillRect(x[i], y[i], CUADRADO, CUADRADO);
			}

			g.setColor(Color.white);
			g.setFont(new Font("Sans serif", Font.ROMAN_BASELINE, 25)); // SCORE
			getFontMetrics(g.getFont());
			g.drawString("Puntuacion: " + numManzanas, 180, 25);

		} else {
			fin(g); // llamamos al metodo "fin"
		}
	}

	// Utilizamos el metodo graphics de nuevo para dibujar el texto final y la
	// puntuacion de la partida cuando "jugando" está en false

	public void fin(Graphics g) {
		g.setColor(Color.red);
		g.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 50));
		g.drawString("¡Has Perdido!", 85, 250);

		g.setColor(Color.white);
		g.setFont(new Font("Sans serif", Font.ROMAN_BASELINE, 25));
		g.drawString("Puntuación final: " + numManzanas, 150, 25);
	}

	// Creamos las coordenadas de la comida mediante random
	public void añadir_manzana() {
		random = new Random(); // Creamos un nuevo objeto random para que no salte error de null
		manzanaX = random.nextInt((int) (ANCHO / CUADRADO)) * CUADRADO;
		manzanaY = random.nextInt((int) (ALTO / CUADRADO)) * CUADRADO;
	}

	// Si las coordenadas de la cabeza coinciden con la manzana generada, sumamos 1 al tamaño de la serpiente y al score
	// y generamos otra random con el metodo "añadir_manzana"
	public void comer() {
		if (x[0] == manzanaX && y[0] == manzanaY) {
			tamaño++;
			numManzanas++;
			añadir_manzana();
		}
	}

	// Comenzamos la partida poniendo la variable "jugando" en true y llamando al
	// metodo de "añadir_manzana" para generar
	// una nuea. A su vez ponemos un delay con "Timer" y le decimos que empiece.
	public void jugar() {
		añadir_manzana();
		jugando = true;
		timer = new Timer(100, this);
		timer.start();
	}

	public void moverse() {
		// la cola de la serpiente sigue a la cabeza y coge las coordenadas anteriores.
		// Para ello, desde
		for (int i = tamaño; i > 0; i--) {
			x[i] = x[i - 1];
			y[i] = y[i - 1];
		}
		// y aqui movemos la cabeza dependiendo de la tecla que presionemos y el valor
		// que coja la direccion
		if (direccion.equals("IZQUIERDA")) {
			x[0] = x[0] - CUADRADO;
		} else if (direccion.equals("DERECHA")) {
			x[0] = x[0] + CUADRADO;
		} else if (direccion.equals("ARRIBA")) {
			y[0] = y[0] - CUADRADO;
		} else {
			y[0] = y[0] + CUADRADO;
		}
	}

	//Comprobamos si la serpiente se choca o no. Para ello, comprobamos que la cabeza "x[0]" y "y[0]" 
	//tenga algun valor del cuerpo o cola de la serpiente y también si se choca contra alguna de las paredes
	
	public void comprobar() {
		for (int i = tamaño; i > 0; i--) {
			if (x[0] == x[i] && y[0] == y[i]) {
				jugando = false;
			}
		}
		if (x[0] < 0 || x[0] >= ANCHO || y[0] < 0 || y[0] >= ALTO) {
			jugando = false;
		}
		if (!jugando) {
			timer.stop();
		}
	}

	/*
	 * Con el siguiente metodo hacemos mover la serpiente con las teclas
	 * right,left,up y down. La direccion va a tener constantemente un valor (
	 * DERECHA, IZQUIERDA, ARRIBA o ABAJO ) y dependiendo de la tecla que pulsemos,
	 * esta variable cambiará de valor a alguno de los otros 2 valores, o seguirá
	 * con el mismo valor.
	 * 
	 * Por poner un ejemplo, si tenemos la direccion en "DERECHA":
	 * 
	 * 1.-Si pulsamos LEFT seguirá siendo "DERECHA" 
	 * 
	 * 2.-Si pulsamos RIGHT seguirá siendo "DERECHA"
	 * 
	 * 3.-Si pulsamos DOWN la cambiará a "ABAJO" 
	 * 
	 * 4.-Si pulsamos UP la cambiara a "ARRIBA"
	 * 
	 * es decir, solo la cambiamos en 2 casos!
	 * 
	 */
	public class MyKeyAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if (!direccion.equals("DERECHA")) {
					direccion = "IZQUIERDA";
				}
				break;

			case KeyEvent.VK_RIGHT:
				if (!direccion.equals("IZQUIERDA")) {
					direccion = "DERECHA";
				}
				break;

			case KeyEvent.VK_UP:
				if (!direccion.equals("ABAJO")) {
					direccion = "ARRIBA";
				}
				break;

			case KeyEvent.VK_DOWN:
				if (!direccion.equals("ARRIBA")) {
					direccion = "ABAJO";
				}
				break;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		e.getSource();
		if (jugando) { // Si jugando está en true
			moverse(); // Movemos la serpiente
			comer(); // Hacemos un check de si hay comida y si la comemos
			comprobar(); // Hacemos un check de si se choca
		}
		repaint(); // va pintando todo
	}
}
