import java.math.BigInteger; 

class Vehiculo{
	private int numID;
	private String modelo;
	private Seguro seguro;
	private Reservacion reservacion;

	public Vehiculo(int numID, String modelo, Seguro seguro, String cliente) {
		this.numID = numID;
		this.modelo = modelo;
		this.seguro = seguro;
		reservacion = new Reservacion(cliente);
	}

	public void imprimirVehiculo(){
		System.out.println("Su vehículo tiene las siguientes características:");
		System.out.println("ID: " + this.numID);
		System.out.println("Modelo: " + this.modelo);
		seguro.mostrarDatosSeguro();
		reservacion.imprimirReservacion();
	}

	public void pagar(double efectivo){
		System.out.println("El pago fue en efectivo con $" + efectivo);

	}
	public void pagar(int numTarjeta){
		System.out.println("El pago fue con la tarjeta " + numTarjeta);
	}
}