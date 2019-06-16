class MaquinaRectangulo extends MaquinaAgricola {
    private double volumen;

    MaquinaRectangulo(String m, String c, int ns) {
        super(m, c, ns);
        this.volumen = 0.0;
    }

    @Override
    public double calcularVolumen(double r, double ancho, double alto) {
        volumen = r * ancho * alto;
        return this.volumen;
    }
}