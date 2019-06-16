class Ciencias extends Facultad {
    private int bono;

    Ciencias(int sueldo, int bono) {
        super(sueldo);
        this.bono = bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    public int getBono() {
        return this.bono;
    }
}