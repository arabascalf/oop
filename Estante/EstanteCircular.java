import java.lang.Math;

class EstanteCircular extends Estante {
    private double radio;

    EstanteCircular(double radio,int nivel){
        super.nivel = nivel;
        super.area = 0.0;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        super.area = Math.PI * this.radio * this.radio;
        return super.area;
    }
}