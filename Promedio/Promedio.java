class Promedio {
    private int num_materias = 3;
    private int min_promedio = 70;
    private double promedio = 0;

    public void calcularPromedio(double calificacion) {
        promedio = calificacion / num_materias;

        System.out.print("Promedio: " + promedio + ". ");
        if (promedio >= min_promedio) { System.out.println("Aprobó el curso"); }
        else { System.out.println("Reprobó el curso."); }
    }
}