package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	class Movimiento {
		
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

	public void ingreso(double i) {
		// TODO Auto-generated method stub
		
	}

	public void reintegro(double i) {
		// TODO Auto-generated method stub
		
	}
}
