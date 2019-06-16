public class Auto extends Vehiculo{
	private int numPasajeros;
	private String tipo;
	//Tipo 1 Auto sedán
	//Tipo 2 Camioneta SUV

	public Auto(int numID, String modelo, Seguro seguro, String cliente, int numPasajeros, int tipo){
		super(numID, modelo, seguro, cliente);
		this.numPasajeros = numPasajeros;
        
        if(tipo == 1) { this.tipo = "Sedán"; }
        else { this.tipo = "SUV"; }
	}
    
    @Override
	public void imprimirVehiculo(){
        super.imprimirVehiculo();
        System.out.println("Tipo de auto: " + this.tipo);
        System.out.println("Número de pasajeros: "+this.numPasajeros);
	}
}