class EstanteRectangular extends Estante {
    private double base;
    private double altura;

    EstanteRectangular(double base, double altura, int nivel) {
        super.nivel = nivel;
        super.area = 0.0;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        super.area = this.base * this.altura;
        return super.area;
    }
}