package mi_primer_paquete.metodos;

public class TestCalculadora {
  public static void main(String[] args) {
    // int resultado = 0;

    Calculadora miObjetoCalculadora = new Calculadora();

    // resultado = miObjetoCalculadora.sumar(8, 5);
    double resultado = miObjetoCalculadora.sumar(8, 5);

    System.out.println();
    System.out.println("El resultado de la suma es: " + resultado);

    resultado = miObjetoCalculadora.restar(8, 5);
    System.out.println();
    System.out.println("El resultado de la resta es: " + resultado);

    resultado = miObjetoCalculadora.multiplicar(8, 5);
    System.out.println();
    System.out.println("El resultado de la multiplicación  es: " + resultado);

    resultado = miObjetoCalculadora.potenciar(8, 5);
    System.out.println();
    System.out.println("El resultado de 8 elevado (potenciado) a la 5 es: " + resultado);

    resultado = miObjetoCalculadora.radicar(8);
    System.out.println();
    System.out.println("La raíz de 8 es: " + resultado);

    resultado = miObjetoCalculadora.radicar(5);
    System.out.println();
    System.out.println("La raíz de 5 es: " + resultado);

    System.out.println();
    miObjetoCalculadora.imprimir();
  }
}
