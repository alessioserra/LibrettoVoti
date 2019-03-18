package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class Libretto {

	private List<Voto> voti ;
	
	public Libretto() {
		this.voti= new ArrayList<Voto>();
	}
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
    public void add(Voto v) {
		voti.add(v);
	}
    
    public String print() {
    	String s="";
    	for (Voto v : this.voti) {
    		s=s+v.toString();
    	}
    	if (s.length()>1) s=s.substring(0, s.length()-1);
		return s; 	
    }
    
    public String print(int voto) {
    	String s="";
    	for (Voto v : this.voti) {
    		if (v.getVoto()==voto)
    		s=s+v.toString();
    	}
    	if (s.length()>1) s=s.substring(0, s.length()-1);
		return s; 	
    }
    
    public int risultato(String nomeCorso){	
    	for (Voto v : this.voti) {
    		if (v.getCorso().compareTo(nomeCorso)==0) return v.getVoto();
    	}	
    	return 0;
    	
    }
	
	
}
