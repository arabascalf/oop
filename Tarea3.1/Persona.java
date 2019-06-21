class Persona {
    protected String name;
    protected String father_surname;
    protected String mother_surname;
    protected int birth_year;
    protected int birth_month;
    protected int birth_day;
    protected boolean female_gender;

    Persona(String n, String fs, String ms, int by, int bm, int bd, boolean fg) {
        this.name = n;
        this.father_surname = fs;
        this.mother_surname = ms;
        this.birth_year = by;
        this.birth_month = bm;
        this.birth_day = bd;
        this.female_gender = fg;
    }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setFaterSurname(String father_surname) { this.father_surname = father_surname; }
    public void setMotherSurname(String mother_surname) { this.mother_surname = mother_surname; }
    public void setBirthYear(int birth_year) { this.birth_year = birth_year; }
    public void setBirthMonth(int birth_month) { this.birth_month = birth_month; }
    public void setBirthDay(int birth_day) { this.birth_day = birth_day; }
    public void setFemaleGender(boolean female_gender) { this.female_gender = female_gender; }

    // Getters
    public String getName() { return this.name; }
    public String getFaterSurname() { return this.father_surname; }
    public String getMotherSurname() { return this.mother_surname; }
    public int getBirthYear() { return this.birth_year; }
    public int getBirthMonth() { return this.birth_month; }
    public int getBirthDay() { return this.birth_day; }
    public boolean getFemaleGender() { return this.female_gender; }

    // ToString
    @Override
    public String toString() {
        return "Nombre: " + this.name + " " + this.father_surname + " " + this.mother_surname +
                "\nNacimiento: " + this.birth_day + "/" + this.birth_month + "/" + this.birth_year +
                "\nGenero femenino: " + this.female_gender;
    }

    public boolean equals(Persona p1, Persona p2) {
        return p1.equals(p2);
    }

    public Persona clone(Persona p) {
        Persona newPersona = new Persona(p.name, p.father_surname, p.mother_surname, p.birth_year, p.birth_month, p.birth_day, p.female_gender);
        return newPersona;
    }
}