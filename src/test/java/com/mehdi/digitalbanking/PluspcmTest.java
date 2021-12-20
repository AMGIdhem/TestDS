package com.mehdi.digitalbanking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PluspcmTest {
	private Pluspcm pluspcm;

	@BeforeEach
	private void set() {
		pluspcm = new Pluspcm();

	}
	
	@Test
	void testAlgorithme() {
		assertEquals(120, pluspcm.ppcm(24, 30));
	}
	
	@Test
	public void testAlgorthime2() {
		assertEquals(36, pluspcm.ppcm(18, 12));
	}
	
	@AfterEach
	private void tear() {
		pluspcm = null;

	}

}
