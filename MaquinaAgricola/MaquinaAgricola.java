class MaquinaAgricola {
    private String marca;
    private String color;
    private int numSerie;

    MaquinaAgricola(String m, String c, int ns) {
        this.marca = m;
        this.color = c;
        this.numSerie = ns;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getColor() {
        return this.color;
    }

    public void setNumSerie(int ns) {
        this.numSerie = ns;
    }

    public int getNumSerie() {
        return this.numSerie;
    }

    public double calcularVolumen(double r, double l) {
        return 0.0;
    }

    public double calcularVolumen(double r, double ancho, double alto) {
        return 0.0;
    }
}