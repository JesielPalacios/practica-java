package encapsulamiento;

public class TestFecha {
  public static void main(String[] args) {
    Fecha miObjFecha = new Fecha();

    // miObjFecha.dia = 30;
    // miObjFecha.mes = 20;
    // miObjFecha.anio = -2;
  }

  // Ahora los atributos ya no son más públicos, sino que se hace un tipo de condiciones para su lectura y escritura.
    miObjFecha.setDia(30);
    miObjFecha.setMes(20);
    miObjFecha.setAnio(-1);
}
