class Sumadora {
    private int valor1;
    private int valor2;

    public void setValor1(int valor1) { this.valor1 = valor1; }

    public void setValor2(int valor2) { this.valor2 = valor2; }

    public int getValor1() { return this.valor1; }

    public int getValor2() { return this.valor2; }

    public int suma() { return this.getValor1() + this.getValor2(); }
}