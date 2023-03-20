import java.io.IOException;
import java.sql.SQLOutput;

public class Launcher {

	public static void main(String [] args) {
		inicializar();
	}
	public static void inicializar() {
		Tienda Techy = new Tienda();
		Producto carcasa = new Producto("Carcasa Iphone 11", " Color: rojo", " 5.000 CLP", " 5 en stock", " Categoría: Carcasas");
		Producto audifono = new Producto("Sony WH1000XM-4", " Color: negro mate", " 300.000 CLP", " 3 en stock", " Categoría: Audifonos");
		Techy.mostrarMenu();
	}

}