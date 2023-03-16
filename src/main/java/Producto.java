public class Producto {
	private String nombre;
	private String descripcion;
	private int precio;
	private int stock;
	private String categoria;

	public void getAttribute() {
		throw new UnsupportedOperationException();
	}

	public void setAttribute(Object attribute) {
		throw new UnsupportedOperationException();
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}