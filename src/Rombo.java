
public class Rombo implements FiguraGeometrica{
	private String nombre;
	private double dMayor;
	private double dMenor;
	private double lado;
	public Rombo(String nombre, double dMayor, double dMenor, double lado) {
		super();
		this.nombre = nombre;
		this.dMayor = dMayor;
		this.dMenor = dMenor;
		this.lado = lado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getdMayor() {
		return dMayor;
	}
	public void setdMayor(double dMayor) {
		this.dMayor = dMayor;
	}
	public double getdMenor() {
		return dMenor;
	}
	public void setdMenor(double dMenor) {
		this.dMenor = dMenor;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", dMayor=" + dMayor + ", dMenor=" + dMenor + ", lado=" + lado + "]";
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (dMayor*dMenor)/2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}
	
	
}
