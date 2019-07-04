class Persona {
    private int numero_identidad;
    private String primer_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private int telefono_casa;
    private int telefono_movil;
    private int codigo_postal;
    private String correo_electronico;
    private double valor_maximo;
    private double valor_prestado;

    Persona(int numero_identidad, String primer_nombre, String primer_apellido, String segundo_apellido, int telefono_casa, int telefono_movil) {
        this.numero_identidad = numero_identidad;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono_casa = telefono_casa;
        this.telefono_movil = telefono_movil;
        this.valor_prestado = 0;
        this.valor_maximo = 0;
    }

    Persona(int numero_identidad, String primer_nombre, String primer_apellido, String segundo_apellido, int telefono_casa, int telefono_movil, int codigo_postal, String correo_electronico) {
        this.numero_identidad = numero_identidad;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono_casa = telefono_casa;
        this.telefono_movil = telefono_movil;
        this.codigo_postal = codigo_postal;
        this.correo_electronico = correo_electronico;
    }

    public void establecerNumeroIdentidad(int numero_identidad) { this.numero_identidad = numero_identidad; }
    public void establecerPrimerNombre(String primer_nombre) { this.primer_nombre = primer_nombre; }
    public void establecerPrimerApellido(String primer_apellido) { this.primer_apellido = primer_apellido; }
    public void establecerSegundoApellido(String segundo_apellido) { this.segundo_apellido = segundo_apellido; }
    public void establecerTelefonoCasa(int telefono_casa) { this.telefono_casa = telefono_casa; }
    public void establecerTelefonoMovil(int telefono_movil) { this.telefono_movil = telefono_movil; }
    public void establecerCodigoPostal(int codigo_postal) { this.codigo_postal = codigo_postal; }
    public void establecerCorreoElectronico(String correo_electronico) { this.correo_electronico = correo_electronico; }
    public void establecerValorMaximo(double valor_maximo) { this.valor_maximo = valor_maximo; }
    public void establecerValorPrestado(double valor_prestado) { this.valor_prestado += valor_prestado; }

    public int obtenerNumeroIdentidad() { return this.numero_identidad; }
    public String obtenerPrimerNombre() { return this.primer_nombre; }
    public String obtenerPrimerApellido() { return this.primer_apellido; }
    public String obtenerSegundoApellido() { return this.segundo_apellido; }
    public int obtenerTelefonoCasa() { return this.telefono_casa; }
    public int obtenerTelefonoMovil() { return this.telefono_movil; }
    public int obtenerCodigoPostal() { return this.codigo_postal; }
    public String obtenerCorreoElectronico() { return this.correo_electronico; }
    public double obtenerValorMaximo() { return this.valor_maximo; }
    public double obtenerValorDisponible() { return (this.valor_maximo - this.valor_prestado); }
    public double obtenerValorPrestado() { return this.valor_prestado; }

    public String obtenerNombre() { return this.primer_nombre + " " + this.primer_apellido + " " + this.segundo_apellido; }
    public String obtenerValorDisponibleString() { return "$" + (this.valor_maximo - this.valor_prestado); }
    public String obtenerValorPrestadoString() { return "$" + this.valor_prestado; }
}