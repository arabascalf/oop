class Test {
    public static void main(String[] args) {
        Ciencias prof1 = new Ciencias();

        prof1.setBono(8000);
        prof1.setSueldo(30000);

        System.out.println("Bono: $" + prof1.getBono());
        System.out.println("Sueldo: $" + prof1.getSueldo());
    }
}