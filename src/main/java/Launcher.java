import java.io.IOException;
import java.sql.SQLOutput;

public class Launcher {

	public static void main(String [] args) {
		inicializar();
	}
	public static void inicializar() {
		Tienda Techy = new Tienda();
		Techy.mostrarMenu();
	}

}