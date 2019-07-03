import java.util.Calendar;
import java.util.Scanner;

class Prestamo {
    
    private int num_prestamo;
    private Persona solicitante;
    private double valor_prestamo;
    private Calendar[] fechas_mensuales;
    private Calendar fecha_autorizacion;
    private Calendar fecha_tentativa;

    Prestamo(int num_prestamo, Persona solicitante, double valor_prestamo, Calendar fecha_autorizacion, Calendar fecha_tentativa) {
        this.num_prestamo = num_prestamo;
        this.solicitante = solicitante;
        this.valor_prestamo = valor_prestamo;
        this.fecha_autorizacion = fecha_autorizacion;
        this.fecha_tentativa = fecha_tentativa;
        this.fechas_mensuales = new Calendar[6];
    }

    public void calcular_pagos(Calendar fecha_entrega) {
        for(int i = 0; i < fechas_mensuales.length; i++) {
            int dias = 30 * (i + 1);
            fechas_mensuales[i] = Calendar.getInstance();
            fechas_mensuales[i].set(fecha_entrega.YEAR, fecha_entrega.MONTH, fecha_entrega.DAY_OF_MONTH + dias);
        }
    }

    public void calcular_pagos(int anio, int mes, int dia) {
        for(int i = 0; i < fechas_mensuales.length; i++) {
            int dias = 30 * (i + 1);
            fechas_mensuales[i] = Calendar.getInstance();
            fechas_mensuales[i].set(anio, mes, dia + dias);
        }
    }

    public void calcular_entrega(Calendar fecha_autorizacion, int dias) {
        fecha_tentativa.set(fecha_autorizacion.YEAR, fecha_autorizacion.MONTH, fecha_autorizacion.DAY_OF_MONTH + dias);
    }

    public void calcular_entrega(int anio, int mes, int dia, int dias) {
        fecha_tentativa.set(anio, mes, dia + dias);
    }

    public String getFechasMensualesString(){
        String fechas = "";

        for(int i = 0; i < fechas_mensuales.length; i++){
            fechas += fechas_mensuales.toString() + "\n";
        }

        return fechas;
    }

    @Override
    public String toString() {
        return "Prestamo: " + this.num_prestamo + "por $" + this.valor_prestamo +
                "\nSolicitante: " + this.solicitante +
                "\nFecha de autorizacion: " + this.fecha_autorizacion +
                "\nFecha de entrega: " + this.fecha_tentativa +
                "\nPagos mensuales: " + getFechasMensualesString();
    }

    // Setters
    public void setNumPrestamo(int num_prestamo) { this.num_prestamo = num_prestamo; }
    public void setSolicitante(Persona solicitante) { this.solicitante = solicitante; }
    public void setValorPrestamo(double valor_prestamo) { this.valor_prestamo = valor_prestamo; }
    public void setFechasMensuales(Calendar[] fechas_mensuales) { this.fechas_mensuales = fechas_mensuales; }
    public void setFechaAutorizacion(Calendar fecha_autorizacion) { this.fecha_autorizacion = fecha_autorizacion; }
    public void setFechaEntrega(Calendar fecha_tentativa) { this.fecha_tentativa = fecha_tentativa; }

    // Getters
    public int getNumPrestamo() { return this.num_prestamo; }
    public Persona getSolicitante() { return this.solicitante; }
    public double getValorPrestamo() { return this.valor_prestamo; }
    public Calendar[] getFechasMensuales() { return this.fechas_mensuales; }
    public Calendar getFechaAutorizacion() { return this.fecha_autorizacion; }
    public Calendar getFechaEntrega() { return this.fecha_tentativa; }
}