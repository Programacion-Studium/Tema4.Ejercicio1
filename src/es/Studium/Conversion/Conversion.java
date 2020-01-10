package es.Studium.Conversion;
import java.awt.*;
/**
 * @author alvaro
 *
 */

public class Conversion extends Frame
{
	private static final long serialVersionUID = 1L; 
	Label lblCelcius = new Label("Celcius"); //Etiqueta que queremos poner.
	TextField txtCelcius = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Label lblFahrenheit = new Label("Fahrenheit");
	TextField txtFahrenheit = new TextField(20);//Tamaño visual del campo, ojo no es el tamaño de los datos.
	Button btnCelFah = new Button("Celcius a Fahrenheit");
	Button btnFahCel = new Button("Fahrenheit a Celcius");
	//Creamos el panel
	Panel pnlPanel1 = new Panel();
	Panel pnlPanel2 = new Panel();
	Panel pnlPanel3 = new Panel();
	Panel pnlPanel4 = new Panel();
	Panel pnlPanel5 = new Panel();
	Panel pnlPanel6 = new Panel();
	public Conversion() {
		// Establecer la distribución con 3 filas y 2 columnas 
		setLayout( new GridLayout( 3,2 ) );
		setTitle("Conversion de temperaturas");
		//añadimos los botones dentro del panel
		pnlPanel1.add(lblCelcius);
		pnlPanel2.add(txtCelcius);
		pnlPanel3.add(lblFahrenheit); 
		pnlPanel4.add(txtFahrenheit); 
		pnlPanel5.add(btnCelFah); 
		pnlPanel6.add(btnFahCel);
		add(pnlPanel1);
		add(pnlPanel2);
		add(pnlPanel3);
		add(pnlPanel4);
		add(pnlPanel5);
		add(pnlPanel6);
		setSize(300,200); 
		setLocationRelativeTo(null); 
		setVisible(true);
	}
	// Fin del Constructor
	public static void main(String[] args) {
		new Ejercicio1(); }
	// Fin del main 
}