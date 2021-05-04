package dds.monedero.model;

import java.time.LocalDate;

import dds.monedero.exceptions.MaximaCantidadDepositosException;
import dds.monedero.exceptions.MontoNegativoException;

public class Deposito extends Movimiento{
	
	public Deposito(LocalDate fecha, double monto) {
    this.fecha = fecha;
    this.monto = monto;
  }

	@Override
	public void validarAplicacion(double saldoCuenta, long depositosDiarios, double limite) {
		super.validarAplicacion(saldoCuenta, depositosDiarios, limite);
		
    if (depositosDiarios >= 3) {
      throw new MaximaCantidadDepositosException("Ya excedio los " + 3 + " depositos diarios");
    }
    
	}
	
	public double montoAplicable() {
		return monto;
	}

}
