package mi_primer_paquete.clases_y_objetos;

public class TestAuto {
  public static void main(String[] args) {
    Auto carro1;
    carro1 = new Auto();

    System.out.println();
    System.out.println("marca: " + carro1.marca);
    System.out.println("año: " + carro1.anio);
    System.out.println("precio: " + carro1.precio);

    carro1.marca = "Volkswagen";
    carro1.anio = 2019;
    carro1.precio = 2_000_000;

    System.out.println();
    System.out.println("marca: " + carro1.marca);
    System.out.println("año: " + carro1.anio);
    System.out.println("precio: " + carro1.precio);

    System.out.println();
    Auto carro2;
    carro2 = new Auto();
    System.out.println("marca: " + carro2.marca);
    carro2.marca = "Lamborghini Urus";
    System.out.println("marca: " + carro2.marca);

  }
}
