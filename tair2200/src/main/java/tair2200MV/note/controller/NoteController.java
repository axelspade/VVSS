package tair2200MV.note.controller;

import tair2200MV.note.validator.ClasaException;
import tair2200MV.note.model.Corigent;
import tair2200MV.note.model.Elev;
import tair2200MV.note.model.Medie;
import tair2200MV.note.model.Nota;
import tair2200MV.note.repository.*;

import java.util.List;


public class NoteController {
	private NoteRepository note;
	private ClasaRepository clasa;
	private EleviRepository elevi;

	public NoteController() {
		note = new NoteRepositoryMock();
		clasa = new ClasaRepositoryMock();
		elevi = new EleviRepositoryMock();
	}

	public void addNota(Nota nota) throws ClasaException {
		note.addNota(nota);
	}
	
	public void addElev(Elev elev) {
		elevi.addElev(elev);
	}
	
	public void creeazaClasa(List<Elev> elevi, List<Nota> note) {
		clasa.creazaClasa(elevi, note);
	}
	
	public List<Medie> calculeazaMedii() throws ClasaException {
			return clasa.calculeazaMedii();
		
	}
	
	public List<Nota> getNote() {
		return note.getNote();
	}
	
	public List<Elev> getElevi() {
		return elevi.getElevi();
	}
	
	/*public HashMap<Elev, HashMap<String, List<Double>>> getClasa() {
		return clasa.getClasa();
	}*/

	/*
	public void afiseazaClasa() {
		clasa.afiseazaClasa();
	}*/
	
	public void readElevi(String fisier) {
		elevi.readElevi(fisier);
	}
	
	public void readNote(String fisier) {
		note.readNote(fisier);
	}
	
	public List<Corigent> getCorigenti() {
		return clasa.getCorigenti();
	}
}
