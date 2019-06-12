class Rector {
    private String nombre;
    private String zona;

    Rector(String nombre, String zona) {
        this.nombre = nombre;
        this.zona = zona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getZona() {
        return this.zona;
    }
}