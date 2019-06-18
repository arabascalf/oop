import java.lang.Math;

class Circulo {
    private double radio;
    private double area;

    Circulo(double radio) {
        this.radio = radio;
        this.area = 0.0;
    }

    private void calcularArea() {
        this.area = Math.PI * this.radio * this.radio;
    }

    public double obtenerArea() {
        return this.area;
    }
}