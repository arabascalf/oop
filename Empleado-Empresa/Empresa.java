class Empresa {
    private String nombre;
    private Empleado empleado;

    Empresa(String nombre, Empleado empleado) {
        this.nombre = nombre;
        this.empleado = empleado;
    }

    public void verEmpresa(){
        System.out.println("Empresa " + this.nombre + " tiene un empleado " + this.empleado.getNombre());
    }
}