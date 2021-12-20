package com.mehdi.digitalbanking;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MockitoTest {
	
	IFacture facture = mock(IFacture.class);
	
	@BeforeEach
	private void set() {
		// TODO Auto-generated method stub

	}

	@Test
	void testGetFraisTransport() {
		when(facture.getFraisTransport(400.0)).thenReturn(0.0);
		when(facture.getFraisTransport(800.0)).thenReturn(45.0);
		
		assertTrue(facture.getFraisTransport(400.0) == 0, "calcul exact");
		assertTrue(facture.getFraisTransport(800.0) == 45, "calcul exact");
	}
	
	@AfterEach
	private void tear() {
		// TODO Auto-generated method stub

	}

}
