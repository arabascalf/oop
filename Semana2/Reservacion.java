class Reservacion {
    private String cliente;
    
    Reservacion(String cliente) {
        this.cliente = cliente;
    }

    public void imprimirReservacion() {
        System.out.println("Reservación hecha a nombre de " + this.cliente);
    }
}