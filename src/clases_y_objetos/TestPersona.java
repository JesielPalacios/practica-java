package clases_y_objetos;

public class TestPersona {
  public static void main(String[] args) {
    Persona persona1; // 1) Declaro la variable persona1 de tipo Persona
    persona1 = new Persona(); // 2) Instancio un obtejo Persona

    System.out.println();
    System.out.println("nombre: " + persona1.nombre); // Imprimir por consola.
    System.out.println("edad: " + persona1.edad);
    System.out.println("estatura: " + persona1.estatura);

    persona1.nombre = "Juan"; // 3) Modifico el atributo nombre de la Persona.
    persona1.edad = 20;
    persona1.estatura = 1.75;

    System.out.println();
    System.out.println("nombre: " + persona1.nombre); // Imprimir por consola.
    System.out.println("edad: " + persona1.edad);
    System.out.println("estatura: " + persona1.estatura);

    System.out.println();
    Persona persona2; // 1) Declaro la variable persona1 de tipo Persona
    persona2 = new Persona();
    System.out.println("nombre: " + persona2.nombre);
    persona2.nombre = "Marco";
    System.out.println("nombre: " + persona2.nombre);
  }
}
