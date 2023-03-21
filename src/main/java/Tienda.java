import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tienda {
	public ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	public ArrayList<Producto> getProductos() {
		return listaDeProductos;
	}
	public String input(String text) {
		return JOptionPane.showInputDialog(text);
	}
	public void mostrarProductos() {
		String string="";
		for (int i=0;i<listaDeProductos.size () ;i++) {
			string+="Artículo "+(i+1)+"\n";
			string+="Nombre: "+listaDeProductos.get (i).getNombre() +" \n" ;
			string+="Descripción: "+listaDeProductos.get (i).getDescripcion() +" \n" ;
			string+="Precio: "+listaDeProductos.get (i).getPrecio() +" \n" ;
			string+="Stock: "+listaDeProductos.get (i).getStock() +" \n" ;
			string+="Categoría: "+listaDeProductos.get (i).getCategoria() +" \n" ;
		}
		JOptionPane.showMessageDialog (null, string);
	}
	public Producto buscarProductoPorNombre() {
		String nombreProductoBuscado = input("Nombre del producto: ");
		for(Producto producto : listaDeProductos){
			if(producto.getNombre().equals(nombreProductoBuscado)){
				JOptionPane.showMessageDialog (null, producto);
			}
		}
		return null;
	}
	public Producto buscarProductoPorCategoria() {
		String categoríaProductoBuscado = input("Categoría del producto: ");
		for(Producto producto : listaDeProductos){
			if(producto.getCategoria().equals(categoríaProductoBuscado)){
				JOptionPane.showMessageDialog (null, producto);
			}
		}
		return null;
	}
	public void addProducto() {
		String nombreProductoNuevo = input("Nombre del producto: ");
		String descripcionProductoNuevo = input("Descripción del produtcto: ");
		String precioProductoNuevo = input("Precio del produtcto: ");
		String stockProductoNuevo = input("Stock del produtcto: ");
		String categoriaProductoNuevo = input("Categoría del produtcto: ");
		Producto productoNuevo = new Producto(nombreProductoNuevo, descripcionProductoNuevo, precioProductoNuevo, stockProductoNuevo, categoriaProductoNuevo);
		listaDeProductos.add(productoNuevo);
	}

	public void mostrarMenu() {
		Tienda techy = new Tienda();
		byte opcion;

		do{
			opcion = Byte.parseByte(JOptionPane.showInputDialog(
					"Menu Principal\n"
							+"1. Mostrar todos los productos\n"
							+"2. Buscar productos por nombre\n"
							+"3. Buscar Productos por categoria\n"
							+"4. Agregar producto nuevo\n"
							+"5. Salir"));

			switch(opcion){
				case 1:
					techy.mostrarProductos();
					break;
				case 2:
					techy.buscarProductoPorNombre();
					techy.mostrarQuitarOModificar();
					break;
				case 3:
					techy.buscarProductoPorCategoria();
					techy.mostrarQuitarOModificar();
					break;
				case 4:
					techy.addProducto();
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "good bye");
					break;

				default:
					JOptionPane.showMessageDialog(null, "not found");
					break;

			}


		}while(opcion!=5);

	}
	public void mostrarQuitarOModificar() {
		Tienda techy = new Tienda();
		byte opcion;
		do {
			opcion = Byte.parseByte(JOptionPane.showInputDialog(
					"Menu Principal\n"
							+ "1. Mostrar todos los productos\n"
							+ "2. Buscar productos por nombre\n"
							+ "5. Salir"));
			switch (opcion) {
				case 1:
					techy.mostrarMenu();
					break;
				case 2:
					techy.mostrarProductos();
					break;

				case 3:
					techy.mostrarProductos();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "good bye");
					break;

				default:
					JOptionPane.showMessageDialog(null, "not found");
					break;
			}
		}while(opcion!=3);
	}
	public int mostrarOpcionesDeModificacion() {
		Scanner teclado = new Scanner(System.in);
		int numero;
		numero = 0;
		while (numero < 1 || numero > 2) {
			System.out.println("Presione 1 si desea modificar el nombre del producto.");
			System.out.println("Presione 2 si desea modificar la descripción del producto.");
			System.out.println("Presione 3 si desea modificar el precio del producto.");
			System.out.println("Presione 4 si desea actualizar el stock del producto.");
			System.out.println("Presione 5 si desea modificar la categoria del producto.");
			numero = teclado.nextInt();
			if (numero < 1 || numero > 5) {
				System.out.println("La opción ingresada no es válido, intente de nuevo");
			}
		}
		return numero;
	}

}