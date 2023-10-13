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
		
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas = new Cuenta("12345", "Titular1", 0);
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
		assertEquals(100, ctaPruebas.getSaldo());
	}
	
	/*@Test
	void testReintegro() {
		ctaPruebas.reintegro(50);
		assertEquals(50, ctaPruebas.getSaldo());
	}*/

}
