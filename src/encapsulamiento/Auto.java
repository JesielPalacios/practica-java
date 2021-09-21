package encapsulamiento;

public class Auto {
  private String marca;
  private double precio;
  private int anio;

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public String getMarca() {
    return marca;
  }

  public double getPrecio() {
    return precio;
  }

  public int getAnio() {
    return anio;
  }
}
