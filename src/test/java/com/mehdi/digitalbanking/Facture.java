package com.mehdi.digitalbanking;

public class Facture {
	public double getFraisTransport(double montant) {
		if(montant < 600) {
			return 45;
		} else {
			return 0;
		}
	}
}
