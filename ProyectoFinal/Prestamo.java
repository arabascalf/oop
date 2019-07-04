import java.util.Calendar;
import java.util.GregorianCalendar;

class Prestamo {
    private int numero_prestamo;
    private Persona solicitante;
    private double valor;
    private Calendar[] fechas_pago;
    private Calendar fecha_autorizacion;
    private Calendar fecha_entrega;
    private int dias;

    Prestamo(int numero_prestamo, Persona solicitante, double valor, Calendar fecha_autorizacion) {
        this.numero_prestamo = numero_prestamo;
        this.solicitante = solicitante;
        this.valor = valor;
        this.fecha_autorizacion = fecha_autorizacion;
        fechas_pago = new GregorianCalendar[6];
        dias = 7;

        if (valor > 100000) { dias = 10; }

        calcularFecha(this.fecha_autorizacion, dias); //Asignar valor a la fecha de entrega
        calcularFecha(this.fecha_entrega); //Asignar valor al arreglo de fechas_pago
        realizarPrestamo();
    }

    public void establecerNumeroPrestamo(int numero_prestamo) { this.numero_prestamo = numero_prestamo; }
    public void establecerSolicitante(Persona solicitante) { this.solicitante = solicitante; }
    public void establecerValor(double valor) { this.valor = valor; }
    public void establecerFechasPago(Calendar[] fechas_pago) { this.fechas_pago = fechas_pago; }
    public void establecerFechaAutorizacion(Calendar fecha_autorizacion) { this.fecha_autorizacion = fecha_autorizacion; }
    public void establecerFechaEntrega(Calendar fecha_entrega) { this.fecha_entrega = fecha_entrega; }

    public int obtenerNumeroPrestamo() { return this.numero_prestamo; }
    public Persona obtenerSolicitante() { return this.solicitante; }
    public double obtenerValor() { return this.valor; }
    public Calendar[] obtenerFechasPago() { return this.fechas_pago; }
    public Calendar obtenerFechaAutorizacion() { return this.fecha_autorizacion; }
    public Calendar obtenerFechaEntrega() { return this.fecha_entrega; }

    public String toString(){
        return "Prestamo número " + this.numero_prestamo + " para " + solicitante.obtenerNombre() +
                "\ncon valor de $" + this.valor + ", entregado el día " + this.fecha_entrega.get(Calendar.YEAR) +
                "/" + this.fecha_entrega.get(Calendar.MONTH) + "/" + this.fecha_entrega.get(Calendar.DAY_OF_MONTH) +
                "\ny fechas de pago " + this.obtenerFechaPago(0);
    }

    // Calcular fecha de entrega
    private void calcularFecha(Calendar fecha_autorizacion, int dias) {
        fecha_entrega = Calendar.getInstance();
        fecha_entrega.set(fecha_autorizacion.get(Calendar.YEAR), fecha_autorizacion.get(Calendar.MONTH), fecha_autorizacion.get(Calendar.DAY_OF_MONTH) + dias);
    }

    // Calcular fechas de pago
    private void calcularFecha(Calendar fecha_entrega) {
        int plazo = 0;

        System.out.println(fecha_entrega.getTime());
        
        for (int i = 0; i < 6; i++) {
            plazo += 30;

            fechas_pago[i] = Calendar.getInstance();
            fechas_pago[i].set(fecha_entrega.get(Calendar.YEAR), fecha_entrega.get(Calendar.MONTH), fecha_entrega.get(Calendar.DAY_OF_MONTH));
            fechas_pago[i].add(Calendar.DAY_OF_MONTH, plazo);
        }
    }

    private String obtenerFechaPago(int index) {
        if(index >= this.fechas_pago.length) {
            return "";
        }

        return fechas_pago[index].get(Calendar.YEAR) + "/" + fechas_pago[index].get(Calendar.MONTH) + "/" +
        fechas_pago[index].get(Calendar.DAY_OF_MONTH) + "\n" + obtenerFechaPago(++index); 
    }

    private void realizarPrestamo() {
        solicitante.establecerValorPrestado(this.valor);
    }
}