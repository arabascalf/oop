class Student extends Person {
    private String student_id;
    private float gpa;
    private int graduation_year;
    
    Student(String name, int age, String email, String id, float gpa, int g_year) {
        super(name, age, email);
        this.student_id = id;
        this.gpa = gpa;
        this.graduation_year = g_year;
    }

    public void isGoodStudent() {
        if (gpa >= 70) {
            System.out.println("I am a good student");
        } else {
            System.out.println("I am not a good student");
        }
    }

    @Override
    public void printPerson() {
        super.printPerson();
        System.out.println("My student id is " + this.student_id);
        isGoodStudent();
        System.out.println("My expected graduation year is " + this.graduation_year);
    }
}