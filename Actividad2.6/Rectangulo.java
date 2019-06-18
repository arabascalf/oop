class Rectangulo {
    private double base;
    private double altura;
    private double area;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = 0.0;
    }

    private void calcularArea() {
        this.area = base * altura;
    }

    public double obtenerArea() {
        return this.area;
    }
}