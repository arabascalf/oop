import java.lang.Math;

class MaquinaCilindro extends MaquinaAgricola {
    private double volumen;

    MaquinaCilindro(String m, String c, int ns) {
        super(m, c, ns);
        this.volumen = 0.0;
    }

    @Override
    public double calcularVolumen(double r, double l) {
        volumen = Math.PI * Math.pow(r, 2) * l;
        return this.volumen;
    }
}