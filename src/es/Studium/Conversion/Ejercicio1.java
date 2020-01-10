package es.Studium.Conversion;
import java.awt.*;
/**
 * @author alvaro
 *
 */

public class Ejercicio1 extends Frame
{
	private static final long serialVersionUID = 1L; 
	Label lblCelcius = new Label("Celcius"); //Etiqueta que queremos poner.
	TextField txtCelcius = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtFahrenheit = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Button btnCelFah = new Button("Celcius a Fahrenheit");
	Button btnFahCel = new Button("Fahrenheit a Celcius");
	public Ejercicio1() {
		// Establecer la distribución con 3 filas y 2 columnas 
		setLayout( new GridLayout( 3,2 ) );
		setTitle("Conversion de temperaturas");
		//añadimos los botones dentro del panel
		add(lblCelcius);
		add(txtCelcius);
		add(lblFahrenheit); 
		add(txtFahrenheit); 
		add(btnCelFah); 
		add(btnFahCel);
		setSize(300,200); 
		setLocationRelativeTo(null); 
		setVisible(true);
	}
	// Fin del Constructor
	public static void main(String[] args) {
		new Conversion(); }
	// Fin del main 
}