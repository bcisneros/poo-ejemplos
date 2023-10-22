public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Rogelio", 25);

        System.out.println("La edad de la persona es " + persona.miEdad());
        System.out.println("La persona vive? " + persona.vive());

        persona.saludar();

        System.out.println("La edad de la persona es " + persona.miEdad());
        System.out.println("La persona vive? " + persona.vive());

        persona.incrementarEdad();

        System.out.println("La edad de la persona es " + persona.miEdad());
        System.out.println("La persona vive? " + persona.vive());

        persona.morir();

        System.out.println("La edad de la persona es " + persona.miEdad());
        System.out.println("La persona vive? " + persona.vive());

        String nombreDeLaPersona = persona.miNombre();

        System.out.println(nombreDeLaPersona);

    }
}
