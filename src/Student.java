
public class Student {

	//Zadatak za samostalan rad
	
	private String ime;
	private String prezime;
	
	/**
	 * Konstruktor sa dva parametra
	 * @param ime
	 * @param prezime
	 */
	
	public Student(String ime, String prezime)
	{
		if (prezime.length() < 1 || ime.length() < 1)
		{
			throw new IllegalArgumentException("Ime ili prezime ne može biti prazno!");
		}
		else
		{
			this.ime = ime;
			this.prezime = prezime;
		}
	}

	/**
	 * Getter za ime
	 * @return ime
	 */
	
	public String getIme()
	{
		return ime;
	}
	
	/**
	 * Getter za prezime
	 * @return
	 */
	
	public String getPrezime()
	{
		return prezime;
	}
	
	/**
	 * Setter za prezime
	 * @param prezime2
	 */
	
	public void setPrezime(String prezime2) {
		if (this.prezime.length() < 1)
		{
			throw new IllegalArgumentException("Prezime ne može biti prazno!");
		}
		else
		{
			this.prezime = prezime;
		}
		
	}

	/**
	 * Setter za ime
	 * @param ime2
	 */
	
	public void setIme(String ime2) {
		if (ime.length() < 1)
		{
			throw new IllegalArgumentException("Ime ne može biti prazno!");
		}
		else
		{
			this.ime = ime;
		}
	}
	
	/**
	 * Funkcija vraæa straing sa imenom i prezimenom studenta
	 */
	
	public String toString()
	{
		return ime + " " + prezime;
	}
}