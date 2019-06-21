import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int student_number;
        String name;
        String father_surname;
        String mother_surname;
        int birth_year;
        int birth_month;
        int birth_day;
        boolean female_gender;
        String id_number;
        int semester;

        int professor_number;
        int nomina;
        String departamento;

        System.out.println("Ingrese el numero de alumnos:");
        student_number = Integer.parseInt(sc.nextLine());
        Alumno students[] = new Alumno[student_number];

        for(int i = 0; i < student_number; i++) {
            System.out.println("Ingrese nombre: ");
            name = sc.nextLine();

            System.out.println("Ingrese apellido paterno: ");
            father_surname = sc.nextLine();

            System.out.println("Ingrese apellido materno: ");
            mother_surname = sc.nextLine();

            System.out.println("Ingrese año de nacimiento: ");
            birth_year = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese mes de nacimiento: ");
            birth_month = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese dia de nacimiento: ");
            birth_day = Integer.parseInt(sc.nextLine());

            System.out.println("¿Es niña? false/true: ");
            female_gender = Boolean.parseBoolean(sc.nextLine());

            System.out.println("Ingrese matricula de estudiante:");
            id_number = sc.nextLine();

            System.out.println("Ingrese semestre de estudiante:");
            semester = Integer.parseInt(sc.nextLine());

            students[i] = new Alumno(name, father_surname, mother_surname, birth_year, birth_month, birth_day, female_gender, id_number, semester);
            System.out.println();
        }
        
        System.out.println("Ingrese el numero de profesores:");
        professor_number = Integer.parseInt(sc.nextLine());
        Profesor professors[] = new Profesor[professor_number];

        for(int i = 0; i < professor_number; i++) {
            System.out.println("Ingrese nombre: ");
            name = sc.nextLine();

            System.out.println("Ingrese apellido paterno: ");
            father_surname = sc.nextLine();

            System.out.println("Ingrese apellido materno: ");
            mother_surname = sc.nextLine();

            System.out.println("Ingrese año de nacimiento: ");
            birth_year = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese mes de nacimiento: ");
            birth_month = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese dia de nacimiento: ");
            birth_day = Integer.parseInt(sc.nextLine());

            System.out.println("¿Es niña? false/true: ");
            female_gender = Boolean.parseBoolean(sc.nextLine());

            System.out.println("Ingrese nomina de profesor:");
            nomina = Integer.parseInt(sc.nextLine());

            System.out.println("Ingrese departamento de profesor:");
            departamento = sc.nextLine();

            professors[i] = new Profesor(name, father_surname, mother_surname, birth_year, birth_month, birth_day, female_gender, nomina, departamento);
            System.out.println();
        }

        Alumno newPersona = students[0].clone();
        System.out.println("Clonando Alumno\nIngrese nuevo nombre: ");
        newPersona.setName(sc.nextLine());
        System.out.println();

        System.out.println("Ingrese nueva matricula: ");
        newPersona.setIdNumber(sc.nextLine());
        System.out.println();

        Profesor newProfesor = professors[0].clone();
        System.out.println("Clonando Profesor\nIngrese nuevo departamento: ");
        newProfesor.setDepartamento(sc.nextLine());
        System.out.println();

        System.out.println("ALUMNOS:");
        for(int i = 0; i < student_number; i++) {
            System.out.println(students[i].toString());
            System.out.println();
        }

        System.out.println();

        System.out.println("PROFESORES:");
        for(int i = 0; i < professor_number; i++) {
            System.out.println(professors[i].toString());
            System.out.println();
        }
    }
}