
public class Cuadrado implements FiguraGeometrica{
	private String nombre;
	private double lado;
	
	
	
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}
	
	
	
	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	


	public String getNombre() {
		return nombre;
	}



	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}



}
