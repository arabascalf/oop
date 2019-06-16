public class Moto extends Vehiculo{
	private String tipo;
	//Tipo 1 motoneta
	//Tipo 2 Cuatrimoto

	public Moto(int numID, String modelo, Seguro seguro, String cliente, int tipo){
		super(numID, modelo, seguro, cliente);

		if(tipo == 1) { this.tipo = "Motoneta"; }
		else { this.tipo = "Cuatrimoto"; }
	}
	
	@Override
	public void imprimirVehiculo(){
		super.imprimirVehiculo();
		System.out.println("Motocicleta de tipo: " + this.tipo);
	}
}