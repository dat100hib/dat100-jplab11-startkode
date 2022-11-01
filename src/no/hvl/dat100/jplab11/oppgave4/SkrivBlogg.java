package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

// import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean skrevet = false;
		String txt = samling.toString();
		String path = mappe + filnavn;

		try {
			PrintWriter skriver = new PrintWriter(path);
			
			skriver.print(txt);
			
			skriver.close();
			
			return !skrevet;
		} catch (FileNotFoundException e) {
			return skrevet;
		}
		
	}
}
