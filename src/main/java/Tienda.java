import java.util.ArrayList;

public class Tienda {
	private String nombreTienda;
	public Menu unnamed_Menu_;
	public ArrayList<Producto> producto = new ArrayList<Producto>();

	public String getNombreTienda() {
		return this.nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public Producto buscar(String nombre, String descripcion, int precio, int stock, String categoria) {
		throw new UnsupportedOperationException();
	}

	public Producto agregar(String nombre, String descripcion, int precio, int stock, String categoria) {
		throw new UnsupportedOperationException();
	}

	public Producto modificar(String nombre, String descripcion, int precio, int stock, String categoria) {
		throw new UnsupportedOperationException();
	}

	public Producto eliminar(String nombre, String descripcion, int precio, int stock, String categoria) {
		throw new UnsupportedOperationException();
	}
}