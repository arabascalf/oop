class Empresa {
    private String nombre;
    private Empleado empleado;

    Empresa(String nombre, String empleado_nombre) {
        this.nombre = nombre;
        empleado = new Empleado(empleado_nombre);
    }

    public void verEmpresa(){
        System.out.println("Empresa " + this.nombre + " tiene un empleado " + this.empleado.getNombre());
    }
}