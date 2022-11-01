package no.hvl.dat100.jplab11.oppgave3;

// import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {
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
		int index = -1;
		
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtabell[i].erLik(innlegg)) {
				index = i;
				return index;
			}
		}
		
		return index;
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
		
		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return !lagt;
		}
		
		return lagt;
	}
	
	@Override
	public String toString() {
		String txt = nesteledig + "\n";
		
		for (int i = 0; i < nesteledig; i++) {
			txt += innleggtabell[i].toString();
		}
		
		return txt;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		int len = innleggtabell.length * 2;
		Innlegg[] copyinnleggtabell = new Innlegg[nesteledig];
		
		for (int i = 0; i < nesteledig; i ++) {
			copyinnleggtabell[i] = innleggtabell[i];
		}
		
		innleggtabell = new Innlegg[len];
		nesteledig = 0;
		
		for (Innlegg x : copyinnleggtabell) {
			innleggtabell[nesteledig] = x;
			nesteledig++;
		}
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		
		if (!ledigPlass() && !finnes(innlegg)) {
			utvid();
		}
		
		boolean lagt = leggTil(innlegg);
		
		return lagt;
	}
	
	public boolean slett(Innlegg innlegg) {
		boolean deleted = false;
		
		if(finnes(innlegg)) {
			// delete object
			int index = finnInnlegg(innlegg);
			innleggtabell[index] = null;
			
			// adjust list
			if (!(index == nesteledig - 1)) {
				for (int i = index; i < nesteledig - 1; i++) {
					Innlegg x = innleggtabell[i + 1];
					innleggtabell[i + 1] = null;
					innleggtabell[i] = x;
				}
			} 
			
			nesteledig--;
			return !deleted;
		}
		
		return deleted;
	}
	
	public int[] search(String keyword) {
		int[] ids = new int[nesteledig];
		
		for (int i = 0; i < nesteledig; i++) {
			int id = innleggtabell[i].getId();
			// get tekst
			// seperate text by space then check if key word is in there
			// add ids to list
		}
		
		return ids;
	}
}