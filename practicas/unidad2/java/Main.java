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

        // Uso del método esMayorQue
        Persona juan = new Persona("Juan", 20);
        Persona pedro = new Persona("Pedro", 15);

        if (pedro.esMayorQue(juan)) {
            System.out.println("Pedro es mayor que Juan");
        } else if (juan.esMayorQue(pedro)) {
            System.out.println("Juan es mayor que Pedro");
        } else {
            System.out.println("Ambos tienen la misma edad");
        }

    }
}
