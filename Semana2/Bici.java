public class Bici extends Vehiculo {
	private String tamano;
		//Chica para niño 
		//Grande para adulto
	private String tipo;
		//Tipo 1 bicicleta de montaña
		//Tipo 2 bicicleta urbana

	public Bici(int numID, String modelo, Seguro seguro, String cliente, String tamano, int tipo){
		super(numID, modelo, seguro, cliente);
		this.tamano = tamano;
		
		if(tipo == 1) { this.tipo = "Montaña"; }
		else { this.tipo = "Urbana"; }
	}

	@Override
	public void imprimirVehiculo(){
		super.imprimirVehiculo();
		System.out.println("Bicicleta de " + this.tipo);
		System.out.println("Tamaño: " + this.tamano);
	}
}