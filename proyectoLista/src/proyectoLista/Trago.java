package proyectoLista;

public class Trago {
 
	private int codigo;
	private String nombre;
	private double precio;
	
	public Trago(int codigo, String nombre , double precio) {
		this.codigo = codigo;
		this.nombre= nombre;
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecio() {
	return precio;
}
	public void setCodigo(int codigo){
		this.codigo= codigo;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public void set(double precio){
	this.precio= precio;
	}
}