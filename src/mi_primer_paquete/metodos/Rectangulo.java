package mi_primer_paquete.metodos;

public class Rectangulo {
  public int base;
  public int altura;

  // Calcula el perímetro:
  public int calcularPerimetro() {
    // int res = (2 * base) + (2 * altura);
    // return res;
    return (2 * base) + (2 * altura);
  }

  // Calcula el área:
  // calcularArea: retorna un int, base*altura.
  public int calcularArea() {
    return base * altura;
  }
}
