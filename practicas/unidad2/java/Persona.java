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

}