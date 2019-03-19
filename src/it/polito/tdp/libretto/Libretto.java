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
    public Voto add(Voto v) {
		voti.add(v);
		return v;
	}
    
    public Voto add2(Voto v) {
     	int flag = 1;
    	
		for(Voto vv: this.voti) {
			if (vv.getCorso().compareTo(v.getCorso())==0) flag=0;
		}
		
		if (flag==1) {
    	voti.add(v);
    	return v;
		}
		
		return null;
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
    
    public boolean esiste(Voto vv) {
    	for (Voto v : voti) {
    		if (v.getCorso().compareTo(vv.getCorso())==0 && v.getVoto()==vv.getVoto()) return true;
    	}
    	return false;
    }
    
    public boolean conflitto(Voto vv) {
    	for (Voto v : voti) {
    		if (v.getCorso().compareTo(vv.getCorso())==0 && v.getVoto()!=vv.getVoto()) return true;
    	}
    	return false;
    }
    
    public Libretto migliora() {
    	Libretto libretto = new Libretto();
    	for (Voto v : this.voti) {	
    		if (v!=null) {
    		if (v.getVoto()<24) libretto.voti.add(new Voto(v.getVoto()+1,v.getCorso(),v.getData()));
    		if (v.getVoto()>=24 && v.getVoto()<=28) libretto.voti.add(new Voto(v.getVoto()+2,v.getCorso(),v.getData()));
    		if (v.getVoto()==29 || v.getVoto()==30) libretto.voti.add(new Voto(30,v.getCorso(),v.getData()));
    		}
    	}
    	return libretto;
    }
    
    public String printPerNomeCorso() { 	
    	String s="";
    	ArrayList<Voto> votii = (ArrayList<Voto>) this.voti;
    	Collections.sort(votii, new ComparatoreNomeCorso());
    	for (Voto v : votii) {
    		     s=s+v.toString();
    	}
    	if (s.length()>1) s=s.substring(0, s.length()-1);
		return s; 	
    }
    
    public String printPerValutazione() { 	
    	String s="";
    	ArrayList<Voto> votii = (ArrayList<Voto>) this.voti;
    	Collections.sort(votii, new ComparatorePerVoto());
    	for (Voto v : votii) {
    		     s=s+v.toString();
    	}
    	if (s.length()>1) s=s.substring(0, s.length()-1);
		return s; 	
    }
    
    public void rimuoviVoti(int voto) {
    	
    	ArrayList<Voto> lista = null;
    	lista = (ArrayList<Voto>)this.voti;
    	
    	try {
    	
    	for (Voto v : lista) {
    		if (v.getVoto()<voto) {
    			
    			if (this.voti.contains(v)) 
    				this.voti.remove(v);
    		}
    	}
    	
    	}catch (ConcurrentModificationException cme) {
    		System.err.println("Problema");
    	}
    }
    	
}
