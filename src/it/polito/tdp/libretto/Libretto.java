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
	 * @return lista di{@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	public List<Voto> CercaVoti(int punti){
		List<Voto> result = new ArrayList<Voto>();
		
		for(Voto v: this.voti) {
			if(v.getPunti()==punti)
				result.add(v);
		}
		return result;
	}
	
	/**
	 * ricerca un voto relativo al corso di cui è specificato il nome
	 * 
	 * @param nomeEsame nome del corso
	 * @return il {@link Voto} corrispondente, oppure {@code null} se non esistente
	 */
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v: this.voti) {
			if(v.getCorso().equals(nomeEsame))
				return v;
		}
		return null;
	}
	
}
