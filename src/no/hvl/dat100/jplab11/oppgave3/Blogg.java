package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable
	private Innlegg[] innleggtabell;
	private int nesteledig = 0;

	public Blogg() {

		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {

		return nesteledig;
	}

	public Innlegg[] getSamling() {

		return innleggtabell;
	}

	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;

		while (!funnet && pos < nesteledig) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			} else {
				pos++;
			}
		}
		if (funnet) {
			return pos;
		} else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {

		boolean funnet = false;

		if (finnInnlegg(innlegg) >= 0) {
			funnet = true;
		}
		return funnet;
	}

	public boolean ledigPlass() {

		return nesteledig < innleggtabell.length -1;
	}

	public boolean leggTil(Innlegg innlegg) {

		boolean lagtTil = false;

		if (!finnes(innlegg)) {
			innleggtabell[nesteledig] = innlegg;
			lagtTil = true;
			nesteledig++;
		}
		return lagtTil;
	}

	public String toString() {
		
		String tab = "" + nesteledig + "\n";
		
		for (int i = 0; i < nesteledig; i++) {
			tab += innleggtabell[i];
		}
		System.out.print(tab);
		return tab;
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