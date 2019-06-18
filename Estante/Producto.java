

public class Producto{
	private String Sku;
	private int nivel;

	public Producto(String Sku, int nivel){
		this.Sku = Sku;
		this.nivel = nivel;
	}

	public int getNivel(){
		return this.nivel;
	}

	public void mostrarProducto(){
		System.out.println("El Xbox One tiene un SKU: " + this.Sku);
		System.out.println("Esta en el nivel " + this.nivel + " del estante");
	}
}