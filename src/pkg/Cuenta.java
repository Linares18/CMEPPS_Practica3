package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Cuenta.Movimiento.Signo;

public class Cuenta {
	

	class Movimiento {
		private double importe;
	    public enum Signo{D, H};
	    private String detalle;
		private Signo signo;
	    
	    public Movimiento(double importe, Signo signo, String detalle) {
	        this.importe = importe;
	        this.detalle = detalle;
	        this.signo = signo;
	    }
	}
	    
	private String numero;
	private String titular;
	private double saldo;
	List <Movimiento> movimientos;
	
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.movimientos = new ArrayList<>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingreso(double i) {
		this.setSaldo(0);
		/*this.setSaldo(this.getSaldo() + i);
		Movimiento movimiento = new Movimiento(i, Signo.D, "Detalle");
		movimientos.add(movimiento);*/
	}

	public void reintegro(double i) {
		this.setSaldo(0);
		/*this.setSaldo(this.getSaldo() - i);	
		Movimiento movimiento = new Movimiento(i, Signo.H, "Detalle");
		movimientos.add(movimiento);*/
	}
}
