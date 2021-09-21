package constructores;

public class Rectangulo {
  private int base;
  private int altura;

  public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
  }

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
