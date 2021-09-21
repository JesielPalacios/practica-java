package com.clearminds.conceptos;

public class Calculadora {
  public double sumar(double a, double b) {
    return a + b;
  }

  public double restar(double a, double b) {
    return a - b;
  }

  public double multiplicar(double a, double b) {
    return a * b;
  }

  public double dividor(double a, double b) {
    return a / b;
  }

  public double potenciar(double a, double b) {
    return Math.pow(a, b);
  }

  public double radicar(double a) {
    return Math.sqrt(a);
  }

  public void imprimir() {
    System.out.println("Método imprimir de la clase calculadora");
  }
}
