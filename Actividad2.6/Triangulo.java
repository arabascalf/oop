class Triangulo {
    private double base;
    private double altura;
    private double area;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.area = 0.0;
    }

    private void calcularArea() {
        this.area = this.base * this.altura / 2;
    }

    public double obtenerArea() {
        return this.area;
    }
}