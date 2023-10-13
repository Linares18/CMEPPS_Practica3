package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {

	static Cuenta ctaPruebas;
	static Cuenta ctaPruebas2;
		
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas = new Cuenta("12345", "Titular1", 50);
		ctaPruebas2 = new Cuenta("67890", "Titular2", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ctaPruebas.setSaldo(50);
		ctaPruebas2.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		ctaPruebas.ingreso(100);
		ctaPruebas2.ingreso(50);
		assertEquals(150, ctaPruebas.getSaldo());
		//System.out.println("ingreso"+ctaPruebas.getSaldo());
		assertEquals(50, ctaPruebas2.getSaldo());
	}
	
	@Test
	void testReintegro() {
		ctaPruebas.reintegro(200);
		ctaPruebas2.reintegro(350);
		ctaPruebas2.reintegro(200);
		ctaPruebas2.reintegro(150);
		ctaPruebas.reintegro(200);
		ctaPruebas2.reintegro(100);
		assertEquals(-350, ctaPruebas.getSaldo());
		//System.out.println("reintegro"+ctaPruebas.getSaldo());
		assertEquals(-500, ctaPruebas2.getSaldo());
	}
	
	@Test
	void testCuenta1() {
		ctaPruebas.reintegro(200);
		ctaPruebas.ingreso(100);
		ctaPruebas.reintegro(200);
		assertEquals(-250, ctaPruebas.getSaldo());
		System.out.println("Saldo final cuenta 1: " + ctaPruebas.getSaldo());
	}
	
	@Test
	void testCuenta2() {
		ctaPruebas2.reintegro(350);
		ctaPruebas2.reintegro(200);
		ctaPruebas2.reintegro(150);
		ctaPruebas2.reintegro(100);
		ctaPruebas2.ingreso(50);
		System.out.println("Saldo final cuenta 2: " + ctaPruebas2.getSaldo());
		assertEquals(-450, ctaPruebas2.getSaldo());
		
	}
}
