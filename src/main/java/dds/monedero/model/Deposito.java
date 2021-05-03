package dds.monedero.model;

import java.time.LocalDate;

public class Deposito extends Movimiento{
	
	public Deposito(LocalDate fecha, double monto) {
    this.fecha = fecha;
    this.monto = monto;
  }
	
	@Override
	public double calcularValor(Cuenta cuenta) {   
      return cuenta.getSaldo() + getMonto();
  }
	
	public boolean isDeposito() {
		return true;
	}

}
