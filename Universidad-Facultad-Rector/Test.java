class Test {
    public static void main(String[] args) {
        Rector rector = new Rector("Alejandro", "Centro");
        Universidad uni = new Universidad("ITESM", "Puebla", rector, "Ingenieria");

        uni.verUniversidad();
    }
}