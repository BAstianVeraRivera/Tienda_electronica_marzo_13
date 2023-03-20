public class Producto {
	private String nombre;
	private String descripcion;
	private String precio;
	private String stock;
	private String categoria;

	public String toString(){
		return this.nombre+"\n"+this.descripcion+"\n"+this.precio+"\n"+this.stock+"\n"+this.categoria;
	}
	public Producto (String nombre, String descripcion, String precio, String stock, String categoria){
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precio=precio;
		this.stock=stock;
		this.categoria=categoria;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getStock() {
		return this.stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}