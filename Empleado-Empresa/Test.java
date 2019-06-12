class Test {
    
    public static void main(String[] agrs) {
        Empleado empleado = new Empleado("Amauri");
        Empresa empresa = new Empresa("MEXabat", empleado);

        empresa.verEmpresa();
    }
}