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
		return nesteledig;
	}

	public Innlegg[] getSamling() {
		return iTab;
	}

	public int finnInnlegg(Innlegg innlegg) {

		int index = -1;
		for (int i = 0; i < nesteledig; i++) {
			if (iTab[i] == innlegg) {
				index = i;
			}
		}
		return index;
	}

	public boolean finnes(Innlegg innlegg) {

		boolean funnet = false;
		for (int i = 0; !funnet && i < nesteledig; i++) {
			funnet = iTab[i].erLik(innlegg);

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
		if (!finnes(innlegg)) {

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
		Innlegg[] tempiTab = iTab;
		lengde *= 2;
		iTab = new Innlegg[lengde];

		for (int i = 0; i < tempiTab.length; i++) {
			iTab[i] = tempiTab[i];
		}
	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		if (ledigPlass() && !finnes(innlegg)) {
			utvid();
		}

		boolean lagtTil = leggTil(innlegg);

		return lagtTil;

	}

	public boolean slett(Innlegg innlegg) {
		boolean funnet = finnes(innlegg);
		int indexDelete = finnInnlegg(innlegg);
		int indexGone = 0;
		if (funnet) {
			Innlegg[] tempiTab = iTab;
			iTab = new Innlegg[lengde];
			nesteledig--;

			for (int i = 0; i < nesteledig; i++) {
				if (i == indexDelete) {
					i++;
				}
				iTab[indexGone] = tempiTab[i];
				indexGone++;
			}
		}
		return funnet;
	}

	public int[] search(String keyword) {

		
		int[] tempTab = new int[lengde];
		int found = 0;
		String compare;
		
		for(int i = 0; i < lengde; i++) {
			compare = iTab[i].toString();
			if(compare.contains(keyword)) {
				tempTab[found] = iTab[i].getId();
				found++;
			}
		}
		int[] tab = new int[found];
		for(int i=0; i<found; i++) {
			tab[i] = tempTab[i];
		}
		return tab;
	}
}