package mi_primer_paquete.constructores;

public class TestAuto {
  public static void main(String[] args) {
    Auto carro1;
    carro1 = new Auto();

    System.out.println();
    System.out.println("marca: " + carro1.getMarca());
    System.out.println("año: " + carro1.getAnio());
    System.out.println("precio: " + carro1.getPrecio());

    carro1.setMarca("Volkswagen");
    carro1.setAnio(2019);
    carro1.setPrecio(2_000_000);

    System.out.println();
    System.out.println("marca: " + carro1.getMarca());
    System.out.println("año: " + carro1.getAnio());
    System.out.println("precio: " + carro1.getPrecio());

    System.out.println();
    Auto carro2;
    carro2 = new Auto();
    System.out.println("marca: " + carro2.getMarca());
    carro2.setMarca("Lamborghini Urus");
    System.out.println("marca: " + carro2.getMarca());

    Auto carro3 = new Auto("Audi", 2_000_000);
    carro3.setAnio(2015);
    System.out.println();
    System.out.println("Auto con marca y año seteados por defecto");
    System.err.println(
        "Marca: " + carro3.getMarca() + ", año(modelo): " + carro3.getAnio() + ", precio: " + carro3.getPrecio());

  }
}
