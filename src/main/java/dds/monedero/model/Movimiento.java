package dds.monedero.model;

import java.time.LocalDate;

import dds.monedero.exceptions.MontoNegativoException;

public abstract class Movimiento {
  protected LocalDate fecha;
  protected double monto;


  public double getMonto() {
    return monto;
  }

  public boolean esDeLaFecha(LocalDate fecha) {
    return this.fecha.equals(fecha);
  }
  
  public void validarAplicacion(double saldoCuenta, long depositosDiarios, double limite) {
		if (monto <= 0) {
      throw new MontoNegativoException(monto + ": el monto a ingresar debe ser un valor positivo");
    }
  }

	protected abstract double montoAplicable();
}
