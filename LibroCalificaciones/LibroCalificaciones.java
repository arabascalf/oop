class LibroCalificaciones {
    private String nombreDelCurso;

    LibroCalificaciones(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public void establecerNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

    public String obtenerNombreDelCurso() {
        return this.nombreDelCurso;
    }

    public void mostrarMensaje() {
        System.out.println("Nombre del curso: " + obtenerNombreDelCurso());
    }
}