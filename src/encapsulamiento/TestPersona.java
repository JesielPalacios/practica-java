package encapsulamiento;

public class TestPersona {
  public static void main(String[] args) {
    Persona persona1; // 1)
    persona1 = new Persona();

    // Ahora aplicando los estándares de enc5apsulamiento:
    System.out.println();
    System.out.println("nombre: " + persona1.getNombre()); // Imprimir por consola.
    System.out.println("edad: " + persona1.getEdad());
    System.out.println("estatura: " + persona1.getEstatura());

    persona1.setNombre("Juan");
    persona1.setEdad(20);
    persona1.setEstatura(1.75);

    System.out.println();
    System.out.println("nombre: " + persona1.getNombre()); // Imprimir por consola.
    System.out.println("edad: " + persona1.getEdad());
    System.out.println("estatura: " + persona1.getEstatura());

    System.out.println();
    Persona persona2; // 1) Declaro la variable persona1 de tipo Persona
    persona2 = new Persona();
    System.out.println("nombre: " + persona2.getNombre());
    persona2.setNombre("Marco");
    System.out.println("nombre: " + persona2.getNombre());
  }
}
