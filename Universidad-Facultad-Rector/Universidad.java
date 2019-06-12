class Universidad {
    private String nombre;
    private String campus;
    private Facultad facultad;
    private Rector rector;

    Universidad(String nombre, String campus, Rector rector, String facultad_nombre) {
        this.nombre = nombre;
        this.campus = campus;
        this.rector = rector;
        this.facultad = new Facultad(facultad_nombre);
    }

    public void verUniversidad() {
        System.out.println("Universidad " + this.nombre + " campus " + this.campus);
        System.out.println("tiene un rector " + this.rector.getNombre() + " de zona " + this.rector.getZona());
        System.out.println("y una facultad " + this.facultad.getNombre());
    }
}