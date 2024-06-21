
public class Trapecio implements FiguraGeometrica{
	private String nombre;
	private double baseMayor;
	private double baseMenor;
	private double altura;
	private double ladoUno;
	private double ladoDos;
	private double ladoTres;
	private double ladoCuatro;
	public Trapecio(String nombre, double baseMayor, double baseMenor, double altura, double ladoUno, double ladoDos,
			double ladoTres, double ladoCuatro) {
		super();
		this.nombre = nombre;
		this.baseMayor = baseMayor;
		this.baseMenor = baseMenor;
		this.altura = altura;
		this.ladoUno = ladoUno;
		this.ladoDos = ladoDos;
		this.ladoTres = ladoTres;
		this.ladoCuatro = ladoCuatro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBaseMayor() {
		return baseMayor;
	}
	public void setBaseMayor(double baseMayor) {
		this.baseMayor = baseMayor;
	}
	public double getBaseMenor() {
		return baseMenor;
	}
	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLadoUno() {
		return ladoUno;
	}
	public void setLadoUno(double ladoUno) {
		this.ladoUno = ladoUno;
	}
	public double getLadoDos() {
		return ladoDos;
	}
	public void setLadoDos(double ladoDos) {
		this.ladoDos = ladoDos;
	}
	public double getLadoTres() {
		return ladoTres;
	}
	public void setLadoTres(double ladoTres) {
		this.ladoTres = ladoTres;
	}
	public double getLadoCuatro() {
		return ladoCuatro;
	}
	public void setLadoCuatro(double ladoCuatro) {
		this.ladoCuatro = ladoCuatro;
	}
	@Override
	public String toString() {
		return "Trapecio [nombre=" + nombre + ", baseMayor=" + baseMayor + ", baseMenor=" + baseMenor + ", altura="
				+ altura + ", ladoUno=" + ladoUno + ", ladoDos=" + ladoDos + ", ladoTres=" + ladoTres + ", ladoCuatro="
				+ ladoCuatro + "]";
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (altura*(baseMayor+baseMenor))/2;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return ladoUno+ladoDos+ladoTres+ladoCuatro;
	}
	
	
}
