package zadatak13;

/**
 * @author Radovan.Olujic
 *
 */

public class Student implements Comparable<Student> {
	private String ime;
	private String prezime;
	private int brojPoena;
	private int ocena;

	/**
	 * @param ime
	 * @param prezime
	 * @param brojPoena
	 */
	public Student(String ime, String prezime, int brojPoena) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		if (0 <= brojPoena && brojPoena <= 100)
			this.brojPoena = brojPoena;
		else {
			System.out.println("Greska u unosu! Broj poena je u rasponu od 0 do 100");
		}
	}

	/**
	 * @return the ime
	 */
	public String getIme() {
		return ime;
	}

	/**
	 * @param ime the ime to set
	 */
	public void setIme(String ime) {
		this.ime = ime;
	}

	/**
	 * @return the prezime
	 */
	public String getPrezime() {
		return prezime;
	}

	/**
	 * @param prezime the prezime to set
	 */
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	/**
	 * @return the brojPoena
	 */
	public int getBrojPoena() {
		return brojPoena;
	}

	/**
	 * @param brojPoena the brojPoena to set
	 */
	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	public int getOcena() {
		if (this.brojPoena > 90)
			return 10;
		else if (this.brojPoena > 80)
			return 9;
		else if (this.brojPoena > 70)
			return 8;
		else if (this.brojPoena > 60)
			return 7;
		else if (this.brojPoena > 50)
			return 6;
		else
			return 5;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [ime=" + ime + ", prezime=" + prezime + ", brojPoena=" + brojPoena + ", ocena=" + getOcena()
				+ "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.valueOf(brojPoena).compareTo(o.getBrojPoena());

	}

}
