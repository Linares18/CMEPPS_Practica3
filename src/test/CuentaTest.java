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
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		ctaPruebas.ingreso(100);
		assertEquals(150, ctaPruebas.getSaldo());
	}
	
	/*@Test
	void testReintegro() {
		ctaPruebas.reintegro(50);
		assertEquals(50, ctaPruebas.getSaldo());
	}*/

}
