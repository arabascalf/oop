class Alumno extends Persona {
    private String id_number;
    private int semester;

    Alumno(String n, String fs, String ms, int by, int bm, int bd, boolean fg, String in, int s) {
        super(n, fs, ms, by, bm, bd, fg);
        this.id_number = in;
        this.semester = s; 
    }

    public void setIdNumber(String id_number) { this.id_number = id_number; }
    public void setSemester(int semester) { this.semester = semester; }

    public String getIdNumber() { return this.id_number; }
    public int getSemester() { return this.semester; }

    @Override
    public String toString() {
        return "Nombre: " + this.name + " " + this.father_surname + " " + this.mother_surname +
                "\nNacimiento: " + this.birth_day + "/" + this.birth_month + "/" + this.birth_year +
                "\nGenero femenino: " + this.female_gender +
                "\nMatricula y semestre: " + this.id_number + " " + this.semester;
    }

    public boolean equals(Alumno a1, Alumno a2) {
        return a1.equals(a2);
    }

    @Override
    public Alumno clone() {
        Alumnos newAlumno = new Alumno(this.name, this.father_surname, this.mother_surname, this.birth_year, this.birth_month, this.birth_day, this.female_gender, this.id_number, this.semester);
        return newAlumno;
    }
}