package no.hvl.dat100.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;
import no.hvl.dat100.oppgave2.*;
import no.hvl.dat100.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {
        Blogg lest = null;
        String filePath = mappe + "/" + filnavn; 

        try (Scanner scanner = new Scanner(new File(filePath));
             FileWriter writer = new FileWriter("filnavn.txt", true)) {

            int antall = Integer.parseInt(scanner.nextLine());
            Blogg newBlogg = new Blogg(antall);

            for (int i = 0; i < antall; i++) {
                String type = scanner.nextLine();
				int id = Integer.parseInt(scanner.nextLine());
				String bruker = scanner.nextLine();
				String dato = scanner.nextLine();
				int likes = Integer.parseInt(scanner.nextLine());
				String tekst = scanner.nextLine();
			
				if(type.equals(TEKST)){
				Tekst tekstInnlegg = new Tekst(id, bruker, dato, likes, tekst);
				newBlogg.leggTil(tekstInnlegg);
				} else if (type.equals(BILDE)){
					String url = scanner.nextLine();
                	Bilde bildeInnlegg = new Bilde(id, bruker, dato, likes, tekst, url);
                	newBlogg.leggTil(bildeInnlegg);
				}
            }

            lest = newBlogg; 

        } catch (FileNotFoundException e) {
            System.err.println("Filen var ikke funnet: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Det var et problem med filen: " + e.getMessage());
        }

        return lest;
    }


	}

