package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
	// THESE GUYS CAN BE PRIVATE RIGHT OR SHOULD THEY JUST BE PROTECTED??
	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < innleggtabell.length; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return i;
			}
		}
		
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean finnes = false;
		
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				return !finnes;
			}
		}
		
		return finnes;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		
		if (nesteledig < innleggtabell.length) {
			return !ledig;
		}
		
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagt = false;
		
		if (!finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			return !lagt;
		}
	}
	
	public String toString() {
		throw new UnsupportedOperationException(TODO.method());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}