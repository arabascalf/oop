class Carta {
    private int numero;
    private String palo;

    Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getPalo() {
        return this.palo;
    }

    public boolean compararCarta(Carta c) {
        if (c.getNumero() == this.numero && c.getPalo() == this.palo) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Carta: " + this.numero + " " + this.palo;
    }
}