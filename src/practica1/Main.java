package practica1;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Celeste");
        persona.setApellido("Ek");

        Dni dni1 = new Dni('E',12124);
        persona.setDni(dni1);

        System.out.println(persona);
    }
}
