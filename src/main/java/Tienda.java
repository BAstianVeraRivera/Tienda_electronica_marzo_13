import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tienda {
	private String nombreTienda;
	public ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	Producto productoNuevo;

	public ArrayList<Producto> getProductos() {
		return listaDeProductos;
	}

	public String getNombreTienda() {
		return this.nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public Tienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public Producto mostrarProductos() {

		for (int i = 0; i < listaDeProductos.size(); i++) {

			System.out.println(listaDeProductos.get(i).toString() + "\n");
		}
		return null;
	}
	public Producto buscarProductoPorNombre(String nombre) {
		for (Producto producto : this.listaDeProductos) {
			if (producto.getNombre().equals(nombre)) {
				return producto;
			}
		}
		return null;
	}
	public Producto buscarProductoPorCategoria(String categeria) {
		for (Producto producto : this.listaDeProductos) {
			if (producto.getCategoria().equals(categeria)) {
				return producto;
			}
		}
		return null;
	}
	public Producto agregarProducto(Producto productoNuevo) {
		listaDeProductos.add(productoNuevo);
		System.out.println("Producto agregado");
		return null;
	}
	public void quitarProducto(Producto productoExistente) {
		this.listaDeProductos.remove(productoExistente);
		System.out.println("Producto eliminado");
	}
	public Producto modificarInfo() {
		Scanner teclado = new Scanner(System.in);
		Tienda techy = new Tienda("Techy");
		int opcion = 0;
		do {
			try {
				mostrarOpcionesDeModificacion();
				opcion = teclado.nextInt();
				if (opcion < 1 || opcion > 5) {
					teclado.nextLine();
					System.err.println("La opción ingresada no válida, por favor intente nuevamente");
				}
				switch (opcion) {
					case 1: {
						//POR HACER
					}
					case 2: {
						//POR HACER
					}
					case 3: {
						//POR HACER
					}
					case 4: {
						//POR HACER
					}
					case 5: {
						//POR HACER
					}

				}
			} catch (InputMismatchException e) {
				teclado.nextLine();
				System.err.println("Opción ingresada no valida, por favor intente de nuevo");
			}
		} while (opcion != 2);
		return null;
	}


	public int mostrarOpcionesPrincipales() {
		Scanner teclado = new Scanner(System.in);
		int numero;
		numero = 0;
		while (numero < 1 || numero > 6) {
			System.out.println("Presione 1 si desea Mostrar todos los productos.");
			System.out.println("Presione 2 si desea Buscar producto por nombre.");
			System.out.println("Presione 3 si desea Buscar producto por categoría.");
			System.out.println("Presione 4 si desea Agregar un nuevo producto.");
			numero = teclado.nextInt();
			if (numero < 1 || numero > 4) {
				System.out.println("La opción ingresada no es válido, intente de nuevo");
			}
		}
		return numero;
	}
	public int mostrarQuitarOModificar() {
		Scanner teclado = new Scanner(System.in);
		int numero;
		numero = 0;
		while (numero < 1 || numero > 2) {
			System.out.println("Presione 1 si desea quitar el producto existente.");
			System.out.println("Presione 2 si desea modificar información del producto.");
			numero = teclado.nextInt();
			if (numero < 1 || numero > 4) {
				System.out.println("La opción ingresada no es válido, intente de nuevo");
			}
		}
		return numero;
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
	public void opcionesMenu() {
		Scanner teclado = new Scanner(System.in);
		Tienda techy = new Tienda("Techy");
		int opcion = 0;
		do {
			try {
				mostrarOpcionesPrincipales();
				opcion = teclado.nextInt();
				if (opcion < 1 || opcion > 4) {
					teclado.nextLine();
					System.err.println("La opción ingresada no válida, por favor intente nuevamente");
				}
				switch (opcion) {
					case 1: {
						mostrarProductos();
					}
					case 2: {
						System.out.println("Ingrese nombre del producto");
						String nombre = teclado.nextLine();
						Producto productoBuscadoPorNombre = techy.buscarProductoPorNombre(nombre);
						System.out.println(productoBuscadoPorNombre.toString());
						do {
							try {
								mostrarQuitarOModificar();
								opcion = teclado.nextInt();
								if (opcion < 1 || opcion > 2) {
									teclado.nextLine();
									System.err.println("La opción ingresada no válida, por favor intente nuevamente");
								}
								switch (opcion) {
									case 1: {
										quitarProducto(productoBuscadoPorNombre);
									}
									case 2: {
										modificarInfo();
									}
								}
							} catch (InputMismatchException e) {
								teclado.nextLine();
								System.err.println("Opción ingresada no valida, por favor intente de nuevo");
							}
						} while (opcion !=100);
					}
					case 3: {
						System.out.println("Ingrese categoría del producto");
						String categoria = teclado.nextLine();
						Producto productoBuscado = techy.buscarProductoPorCategoria(categoria);
						System.out.println(productoBuscado.toString());
						do {
							try {
								mostrarQuitarOModificar();
								opcion = teclado.nextInt();
								if (opcion < 1 || opcion > 2) {
									teclado.nextLine();
									System.err.println("La opción ingresada no válida, por favor intente nuevamente");
								}
								switch (opcion) {
									case 1: {
										quitarProducto(productoBuscado);
									}
									case 2: {
										modificarInfo();
									}
								}
							} catch (InputMismatchException e) {
								teclado.nextLine();
								System.err.println("Opción ingresada no valida, por favor intente de nuevo");
							}
						} while (opcion !=100);
					}
					case 4: {
						añadirProductoAlInventario();
					}
				}
			} catch (InputMismatchException e) {
				teclado.nextLine();
				System.err.println("Opción ingresada no valida, por favor intente de nuevo");
			}
		} while (opcion != 100);
	}
	public void añadirProductoAlInventario(){
		String[] options = {"Sí", "No"};
		int seleccion;
		JOptionPane.showMessageDialog(null, "Introduce los datos");

		productoNuevo.setNombre(JOptionPane.showInputDialog("Nombre del Producto"));
		productoNuevo.setDescripcion(JOptionPane.showInputDialog("Descripción del producto"));
		productoNuevo.setPrecio(JOptionPane.showInputDialog("Precio del producto"));
		productoNuevo.setStock(JOptionPane.showInputDialog("Stock del producto"));
		productoNuevo.setCategoria(JOptionPane.showInputDialog("Categoría del producto"));
		productoNuevo = new Producto(productoNuevo.getNombre(), productoNuevo.getDescripcion(), productoNuevo.getPrecio(), productoNuevo.getStock(), productoNuevo.getCategoria());
		listaDeProductos.add(productoNuevo);
	}
}