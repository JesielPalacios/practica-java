package encapsulamiento;

public class Fecha {
  // public int dia;
  // public int mes;
  // public int anio;

  private int dia;
  private int mes;
  private int anio;

  public void setDia(int dia) {
    if (dia >= 1 && dia <= 30) {
      this.dia = dia;
    } else {
      System.err.println("Error");
    }
  }

  public void setMes(int mes) {
    if (mes >= 1 && mes <= 12) {
      this.mes = mes;
    } else {
      System.err.println("Error");
    }
  }

  public void setAnio(int anio) {
    if (anio >= 1 && anio <= 2021) {
      this.anio = anio;
    } else {
      System.err.println("Error");
    }
  }

  public void imprimir() {

  }
}
