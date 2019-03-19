package it.polito.tdp.libretto;

import java.util.Comparator;

public class ComparatoreNomeCorso implements Comparator{

	public int compare(Object arg0, Object arg1) {

		Voto v1=(Voto)arg0;
		Voto v2=(Voto)arg1;

		return v1.getCorso().compareTo(v2.getCorso());
	}

}
