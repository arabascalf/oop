class Test {
    public static void main(String[] args) {

        EstanteMultifigura estante = new EstanteMultifigura(3);
        estante.agregarRectangulo(40, 40, 1);
        estante.agregarCirculo(30, 0);
        estante.agregarTriangulo(30, 50, 2);

        estante.calcularAreaTotal();
        System.out.println("Area total de estante: " + estante.getAreaTotal());

        Producto xbox = new Producto("XBOX-113-14902", 2);
        xbox.mostrarProducto();
    }
}