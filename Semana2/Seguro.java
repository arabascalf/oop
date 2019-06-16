class Seguro {
    private String nombreAseguradora;
    private int numeroPoliza;

    Seguro(String nombreAseguradora, int numeroPoliza) {
        this.nombreAseguradora = nombreAseguradora;
        this.numeroPoliza = numeroPoliza;
    }

    public void mostrarDatosSeguro() {
        System.out.println("Su vehículo cuenta con seguro de " + this.nombreAseguradora);
        System.out.println("Con número de póliza " + this.numeroPoliza);
    }
}