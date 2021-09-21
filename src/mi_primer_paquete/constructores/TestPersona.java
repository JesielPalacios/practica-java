package mi_primer_paquete.constructores;

public class TestPersona {
  public static void main(String[] args) {
    Persona persona1;
    persona1 = new Persona("Juan");

    // Ahora aplicando los estándares de enc5apsulamiento:
    System.out.println();
    System.out.println("nombre: " + persona1.getNombre()); // Imprimir por consola.
    System.out.println("edad: " + persona1.getEdad());
    System.out.println("estatura: " + persona1.getEstatura());

    // persona1.setNombre("Juan");
    persona1.setEdad(20);
    persona1.setEstatura(1.75);

    System.out.println();
    System.out.println("nombre: " + persona1.getNombre()); // Imprimir por consola.
    System.out.println("edad: " + persona1.getEdad());
    System.out.println("estatura: " + persona1.getEstatura());

    System.out.println();
    Persona persona2; // 1) Declaro la variable persona1 de tipo Persona
    persona2 = new Persona("Marco");
    System.out.println("nombre: " + persona2.getNombre());
    // persona2.setNombre("Marco");
    System.out.println("nombre: " + persona2.getNombre());

    // Aunque se cambió el funcionamiento normal del constructor por defecto de la
    // clase Persona en este caso, todavía se puede seguir instanciando objetos, es
    // decir, todavía se pueden crear instancias de la manera normal sin necesidad
    // de setear valores en l acreación del objeto, en este caso al principio de la
    // creación del objeto de tipo Persona.

    Persona persona3 = new Persona();
    System.out.println();
    System.out.println("Objeto con parámetros de constructor por defecto.");
    System.out.println("nombre: " + persona3.getNombre()); // Imprimir por consola.
    System.out.println("edad: " + persona3.getEdad());
    System.out.println("estatura: " + persona3.getEstatura());
    System.out.println();
    persona3.setNombre("Pepito");
    persona3.setEdad(40);
    persona3.setEstatura(1.76);

    System.out.println();
    System.out.println("nombre: " + persona3.getNombre()); // Imprimir por consola.
    System.out.println("edad: " + persona3.getEdad());
    System.out.println("estatura: " + persona3.getEstatura());

    Persona persona4 = new Persona("Marco", 24, 1.23);
    System.out.println();
    System.out.println("Objeto con todos los parámetros del constructor seteados.");
    System.out.println("nombre: " + persona4.getNombre()); // Imprimir por consola.
    System.out.println("edad: " + persona4.getEdad());
    System.out.println("estatura: " + persona4.getEstatura());
    System.out.println();
  }
}
