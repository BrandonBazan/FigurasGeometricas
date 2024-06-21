
public class Rectangulo implements FiguraGeometrica{
	private String nombre;
	private double base;
	private double altura;
	private double lado;
	public Rectangulo(String nombre, double base, double altura, double lado) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String toString() {
		return "Rectangulo [nombre=" + nombre + ", base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}
	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return base * altura;
	}
	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (2*base+2*altura);
	}
	
	
}
