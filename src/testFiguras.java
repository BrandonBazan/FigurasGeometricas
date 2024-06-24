
public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Pants", 127);
		Rectangulo r1 = new Rectangulo("libreta", 20.0, 10.0);
		Rombo ro1=new Rombo("Rombo", 15.0, 10.0, 10.0);
		Romboide rom1 = new Romboide("Romboide", 30.0, 15.0);
		Trapecio tr1 = new Trapecio("Trape", 20.0, 15.0,10.0,20.0, 15.0, 10.0, 10.0);
		imprimirCalculo(t1); imprimirCalculo(t2);
		imprimirCalculo(c1);
		imprimirCalculo(r1);
		imprimirCalculo(ro1);
		imprimirCalculo(rom1);
		imprimirCalculo(tr1);
	}//main
	public static void imprimirCalculo(FiguraGeometrica t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getNombre()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getNombre()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras
