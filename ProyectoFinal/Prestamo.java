import java.util.Date;
import java.util.Scanner;

class Prestamo {
    
    private int num_prestamo;
    // private Persona solicitante;
    private double valor_prestamo;
    private Date[] fechas_mensuales;
    private Date fecha_autorizacion;
    private Date fecha_tentativa;
    private Scanner sc = new Scanner(System.in);

    Prestamo(int num_prestamo, /*Persona solicitante,*/ double valor_prestamo, Date fecha_autorizacion, Date fecha_tentativa) {
        this.num_prestamo = num_prestamo;
        // this.solicitante = solicitante;
        this.valor_prestamo = valor_prestamo;
        this.fecha_autorizacion = fecha_autorizacion;
        this.fecha_tentativa = fecha_tentativa;
        this.fechas_mensuales = new Date[6];
    }

    private void calcular_pagos(Date fecha_entrega) {
        for(int i = 0; i < fechas_mensuales.length; i++) {
            Date dias = new Date(fecha_entrega.year, fecha_entrega.month, fecha_entrega.date + 30);
            fechas_mensuales[i] = fecha_entrega + dias;
        }
    }
}