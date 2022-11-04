package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		PrintWriter skriver = null;
		boolean skrevet = false;

		try {
			skriver = new PrintWriter(mappe + filnavn);
			skriver.println(samling.toString());	
			skrevet = true;
			
		} catch (FileNotFoundException e) {
			System.out.println("Finner ikke filen.");
		} finally {
			if (skriver != null) {
				skriver.close();

			}
		}
		return skrevet;
	}
}
