package constructores;

public class TestRectangulo {
  public static void main(String[] args) {
    // Rectangulo miObjRectangulo = new Rectangulo();
    // miObjRectangulo.base = 10;
    // miObjRectangulo.altura = 2;
    Rectangulo miObjRectangulo = new Rectangulo(10, 2);

    int perimetro = miObjRectangulo.calcularPerimetro();
    System.out.println();
    System.out.println("El perímetro es: " + perimetro);

    // Rectangulo miObjRectangulo2 = new Rectangulo();
    // miObjRectangulo2.base = 12;
    // miObjRectangulo2.altura = 8;
    Rectangulo miObjRectangulo2 = new Rectangulo(12, 8);

    int perimetro2 = miObjRectangulo2.calcularPerimetro();
    System.out.println();
    System.out.println("El perímetro del segundo objeto es: " + perimetro2);

    // Rectangulo miObjRectangulo3 = new Rectangulo();
    // miObjRectangulo3.base = 6;
    // miObjRectangulo3.altura = 18;
    Rectangulo miObjRectangulo3 = new Rectangulo(6, 18);
    System.out.println();
    System.out.println("El área de un rectángulo de 6*18 es: " + miObjRectangulo3.calcularArea());
  }
}
