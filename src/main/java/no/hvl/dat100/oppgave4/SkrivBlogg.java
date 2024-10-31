package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		String filePath = mappe + "\n" + filnavn; 

		try (PrintWriter skriver = new PrintWriter(new FileWriter(filePath))) { 

		for(int i = 0; i < samling.getAntall(); i++){
			skriver.println(samling.getSamling()[i].toString());

		} 
		return true; 
	}catch (IOException e) {
			System.err.println("Det var et problem ,ed filen" + e.getMessage());
			return false;

		
	}
}}
