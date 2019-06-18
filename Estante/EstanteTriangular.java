class EstanteTriangular extends Estante {
    private double base;
    private double altura;

    EstanteTriangular(double base, double altura, int nivel) {
        super.nivel = nivel;
        this.base = base;
        this.altura = altura;
        super.area = 0.0;
    }

    @Override
    public double calcularArea() {
        super.area = this.base * this.altura;
        return super.area;
    }
}