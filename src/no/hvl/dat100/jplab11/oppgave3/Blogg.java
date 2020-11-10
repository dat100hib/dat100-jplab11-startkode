package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	private int lengde;
	private Innlegg[] iTab;
	private int nesteledig;

	public Blogg() {
		nesteledig = 0;
		lengde = 20;
		iTab = new Innlegg[lengde];
	}

	public Blogg(int lengde) {
		nesteledig = 0;
		this.lengde = lengde;
		iTab = new Innlegg[lengde];

	}

	public int getAntall() {
		/*
		 * int i = 0; while (iTab[i] != null && i < iTab.length) { i++; }
		 */
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return iTab;

	}

	public int finnInnlegg(Innlegg innlegg) {
		int i = 0;
		while (iTab[i].erLik(innlegg) == false && i < nesteledig) {
			i++;
		}
		if (i == nesteledig) {
			i = -1;
		}
		return i;
	}

	public boolean finnes(Innlegg innlegg) {
		int i = 0;
		boolean funnet = false;
		while (funnet == false && i < nesteledig) {
			funnet = iTab[i].erLik(innlegg);
			i++;
		}
		return funnet;
	}

	public boolean ledigPlass() {
		boolean erledig = false;
		if (lengde != nesteledig) {
			erledig = true;
		}
		return erledig;
	}

	public boolean leggTil(Innlegg innlegg) {
		boolean b = false;
		if (finnes(innlegg) == false) {

			iTab[nesteledig] = innlegg;
			b = true;
			nesteledig++;
		}
		return b;
	}

	public String toString() {
		String s = Integer.toString(nesteledig) + "\n";

		for (int i = 0; i < nesteledig; i++) {
			s += iTab[i].toString();
		}
		return s;
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