class Profesor extends Persona {
    private int nomina;
    private String departamento;

    Profesor(String n, String fs, String ms, int by, int bm, int bd, boolean fg, int nom, String d) {
        super(n, fs, ms, by, bm, bd, fg);
        this.nomina = nom;
        this.departamento = d; 
    }

    public void setNomina(int nomina) { this.nomina = nomina; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public int getNomina() { return this.nomina; }
    public String getDepartamento() { return this.departamento; }

    @Override
    public String toString() {
        return "Nombre: " + this.name + " " + this.father_surname + " " + this.mother_surname +
                "\nNacimiento: " + this.birth_day + "/" + this.birth_month + "/" + this.birth_year +
                "\nGenero femenino: " + this.female_gender +
                "\nNomina y departamento: " + this.nomina + " " + this.departamento;
    }

    public boolean equals(Profesor p1, Profesor p2) {
        return p1.equals(p2);
    }

    @Override
    public Profesor clone() {
        Profesor newProfesor = new Profesor(this.name, this.father_surname, this.mother_surname, this.birth_year, this.birth_month, this.birth_day, this.female_gender, this.nomina, this.departamento);
        return newProfesor;
    }
}