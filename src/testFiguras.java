
public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Pants", 127);
		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1);
	}//main
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getNombre()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getNombre()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras
