package it.polito.tdp.libretto;

import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	
	public Libretto(){
		this.voti = new ArrayList<Voto>();
	}
	
	/**
	 * aggiunge un nuovo voto al libretto
	 * 
	 * @param v il {@link Voto} da aggiungere
	 */
	public void add(Voto v) {
		voti.add(v);
	}
	
	/**
	 * seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * 
	 * @param punti
	 * @return lista di{@link Voto} aventi quel punteggio
	 */
	public List<Voto> CercaVoti(int punti){
		List<Voto> result = new ArrayList<Voto>();
		
		for(Voto v: voti) {
			if(v.getPunti()==punti)
				result.add(v);
		}
		return result;
	}
}
