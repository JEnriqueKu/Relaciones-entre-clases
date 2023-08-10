package ejercicio1;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;
import ejercicio1.enumeradores.razaPerros;

public class Main_Ej_1 {

    public static void main(String[] args) {
        
        Persona p1 = new Persona();
        Persona p2 = new Persona(); 
        
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        
        p1.setNombre("Shirley");
        p1.setApellido("Alvarado");
        p1.setEdad(31);
        p1.setDocumento(123456);
        p1.setPerro(perro1);
        perro1.setNombre("thor");
        perro1.setEdad(3);
        perro1.setRaza(razaPerros.FOX_TERRIER);
        perro1.setTamanio("Chiquito");
        perro1.setDuenio(p1);
        
        p2.setNombre("Federico");
        p2.setApellido("Bonifacio");
        p2.setEdad(28);
        p2.setDocumento(655655);
        p2.setPerro(perro2);
        perro2.setNombre("pichon");
        perro2.setEdad(4);
        perro2.setRaza(razaPerros.CORGI);
        perro2.setTamanio("Chiquito");
        perro2.setDuenio(p2);
        
        
        System.out.println(p1);
        System.out.println(p2);
        
    }
    
}
