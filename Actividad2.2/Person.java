class Person {
    private String name;
    private int age;
    private String email_address;

    Person(String name, int age, String email_address) {
        this.name = name;
        this.age = age;
        this.email_address = email_address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getEmail() {
        return this.email_address;
    }

    public void printPerson() {
        System.out.println("My name is " + getName());
        System.out.println("I am " + getAge() + " years old");
        System.out.println("Send me an email to " + getEmail());
    }
}
