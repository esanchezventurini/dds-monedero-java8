package dds.monedero.model;

import java.time.LocalDate;

public abstract class Movimiento {
  protected LocalDate fecha;
  protected double monto;


  public double getMonto() {
    return monto;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public boolean esDeLaFecha(LocalDate fecha) {
    return this.fecha.equals(fecha);
  }
  
  public abstract boolean isDeposito();
}
