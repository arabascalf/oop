class Persona {
    private int num_identidad;
    private String primer_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private int telefono_fijo;
    private int telefono_movil;
    private String calle_numero;
    private int codigo_postal;
    private String estado;
    private double valor_maximo;

    Persona(int num_identidad, String primer_nombre, String primer_apellido, String segundo_apellido, int telefono_fijo, int telefono_movil) {
        this.num_identidad = num_identidad;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono_fijo = telefono_fijo;
        this.telefono_movil = telefono_movil;
    }

    Persona(int num_identidad, String primer_nombre, String primer_apellido, String segundo_apellido, int telefono_fijo, int telefono_movil, String calle_numero, int codigo_postal, String estado) {
        this.num_identidad = num_identidad;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono_fijo = telefono_fijo;
        this.telefono_movil = telefono_movil;
        this.calle_numero = calle_numero;
        this.codigo_postal = codigo_postal;
        this.estado = estado;
    }

    // Setters
    public void setNumIdentidad(int num_identidad) { this.num_identidad = num_identidad; }
    public void setPrimerNombre(String primer_nombre) { this.primer_nombre = primer_nombre; }
    public void setPrimerApellido(String primer_apellido) { this.primer_apellido = primer_apellido; }
    public void setSegundoApellido(String segundo_apellido) { this.segundo_apellido = segundo_apellido; }
    public void setTelefonoFijo(int telefono_fijo) { this.telefono_fijo = telefono_fijo; }
    public void setTelefonoMovil(int telefono_movil) { this.telefono_movil = telefono_movil; }
    public void setCalleNumero(String calle_numero) { this.calle_numero = calle_numero; }
    public void setCodigoPostal(int codigo_postal) { this.codigo_postal = codigo_postal; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setValorMaximo(double valor_maximo) { this.valor_maximo = valor_maximo; }

    // Getters
    public int getNumIdentidad() { return this.num_identidad; }
    public String getPrimerNombre() { return this.primer_nombre; }
    public String getPrimerApellido() { return this.primer_apellido; }
    public String getSegundoApellido() { return this.segundo_apellido; }
    public int getTelefonoFijo() { return this.telefono_fijo; }
    public int getTelefonoMovil() { return this.telefono_movil; }
    public String getCalleNumero() { return this.calle_numero; }
    public int getCodigoPostal() { return this.codigo_postal; }
    public String getEstado() { return this.estado; }
    public double getValorMaximo() { return this.valor_maximo; }
}