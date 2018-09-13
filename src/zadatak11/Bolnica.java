/**
 * 
 */
package zadatak11;

import java.util.ArrayList;

/**
 * @author Radovan.Olujic
 *
 */
public class Bolnica {

	private String naziv;
	private String direktor;
	private ArrayList<Lekari> lekari;
	private ArrayList<MedicinskeSestre> medicinskeSestre;
	private ArrayList<Osoblje> osoblje;

	/**
	 * @param naziv
	 * @param direktor
	 * @param lekari
	 * @param medicinskeSestre
	 * @param osoblje
	 */
	public Bolnica(String naziv, String direktor, ArrayList<Lekari> lekari,
			ArrayList<MedicinskeSestre> medicinskeSestre, ArrayList<Osoblje> osoblje) {
		super();
		this.naziv = naziv;
		this.direktor = direktor;
		this.lekari = lekari;
		this.medicinskeSestre = medicinskeSestre;
		this.osoblje = osoblje;
	}

	/**
	 * @return the naziv
	 */
	public String getNaziv() {
		return naziv;
	}

	/**
	 * @param naziv the naziv to set
	 */
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	/**
	 * @return the direktor
	 */
	public String getDirektor() {
		return direktor;
	}

	/**
	 * @param direktor the direktor to set
	 */
	public void setDirektor(String direktor) {
		this.direktor = direktor;
	}

	/**
	 * @return the lekari
	 */
	public ArrayList<Lekari> getLekari() {
		return lekari;
	}

	/**
	 * @param lekari the lekari to set
	 */
	public void setLekari(ArrayList<Lekari> lekari) {
		this.lekari = lekari;
	}

	/**
	 * @return the medicinskeSestre
	 */
	public ArrayList<MedicinskeSestre> getMedicinskeSestre() {
		return medicinskeSestre;
	}

	/**
	 * @param medicinskeSestre the medicinskeSestre to set
	 */
	public void setMedicinskeSestre(ArrayList<MedicinskeSestre> medicinskeSestre) {
		this.medicinskeSestre = medicinskeSestre;
	}

	/**
	 * @return the osoblje
	 */
	public ArrayList<Osoblje> getOsoblje() {
		return osoblje;
	}

	/**
	 * @param osoblje the osoblje to set
	 */
	public void setOsoblje(ArrayList<Osoblje> osoblje) {
		this.osoblje = osoblje;
	}

}
