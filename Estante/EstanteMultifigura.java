public class EstanteMultifigura{
	
	private int numNiveles;
	private double areaTotal;
	private EstanteRectangular rectangulo;
	private EstanteCircular circulo;
	private EstanteTriangular triangulo;

	public EstanteMultifigura(int numNiveles){
		this.numNiveles = numNiveles;
		areaTotal = 0.0;
	}

	public void agregarRectangulo(double b, double a, int nivel){
		rectangulo = new EstanteRectangular(b,a,nivel);
	}

	public void agregarCirculo(double r, int nivel){
		circulo = new EstanteCircular(r,nivel);	
	}

	public void agregarTriangulo(double b, double a, int nivel){
		triangulo = new EstanteTriangular(b,a,nivel);
	}

	public void calcularAreaTotal(){
		areaTotal = rectangulo.calcularArea() + circulo.calcularArea() + triangulo.calcularArea();

	}

	public double getAreaTotal(){
		return areaTotal;
	}
}