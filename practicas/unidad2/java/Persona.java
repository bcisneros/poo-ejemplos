class Persona {

    private String nombre;
    private int edad;
    private boolean vive;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.vive = true;
    }

    void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }

    void incrementarEdad() {
        edad = edad + 1;
    }

    void morir() {
        vive = false;
    }

    int miEdad() {
        return this.edad;
    }

    boolean vive() {
        return this.vive;
    }

    String miNombre() {
        return this.nombre;
    }

    boolean esMayorQue(Persona otraPersona) {
        // Utilizamos la palabra this para hacer referencia al objeto actual
        // No es requerida a menos que el nombre de la variable o parámetro tenga
        // conflicto con el atributo
        return this.edad > otraPersona.edad;
    }
}