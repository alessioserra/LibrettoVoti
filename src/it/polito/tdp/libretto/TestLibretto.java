package it.polito.tdp.libretto;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {

    Libretto l = new Libretto();
    
    //ES. PUNTO 1
    l.add(new Voto(18,"Fisica I", LocalDate.of(2019, 06, 24)));
    l.add(new Voto(18,"Informatica", LocalDate.of(2016, 02, 02)));
    l.add(new Voto(24,"Statistica", LocalDate.of(2017, 07, 25)));
    l.add(new Voto(25,"Diritto", LocalDate.of(2018, 06, 24)));
    l.add(new Voto(25,"Analisi I", LocalDate.of(2016, 01, 25)));
    l.add(new Voto(24,"Fisica II", LocalDate.of(2016, 06, 25)));
    l.add(new Voto(30,"Programmazione ad Oggetti", LocalDate.of(2019, 01, 25)));
    l.add(new Voto(18,"Sistemi Elettrici", LocalDate.of(2018, 06, 25)));
    l.add(new Voto(25,"Chimica", LocalDate.of(2019, 07, 25)));
    l.add(new Voto(25,"Base di Dati", LocalDate.of(2019, 06, 25)));
	
    System.out.println("LISTA VOTI:");
    System.out.println(l.print());
    
    //ES. PUNTO 2
    System.out.println("\nLISTA VOTI uguali a 25:");
    System.out.println(l.print(25));

    //ES. PUNTO 3
    System.out.println("\nEsito esame Analisi I : "+l.risultato("Analisi I"));
    System.out.println("Esito Informatica : "+l.risultato("Informatica"));
    System.out.println("Esito Statistica : "+l.risultato("Statistica"));
    
	}

	
	
}
