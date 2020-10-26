package proyectoLista;

public class TragoPreparado extends Trago{
	private String composicion;
	
	public TragoPreparado(int codigo, String nombre, double precio, String composicion) 
	{
		super(codigo,nombre,precio);
		this.composicion= composicion;
	}
	public void setComposicion(String composicion) {
		this.composicion= composicion;
	}
	public String getComposicion(){
		return composicion;
	}
}
