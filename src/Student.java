/**
 * 
 * 
 * @author Edib Imamovic
 *
 */

// Zadatak za samostalan rad

public class Student {

	private String name;
	private String surname;

	/**
	 * Konstruktor sa dva parametra
	 * 
	 * @param name
	 * @param surname
	 */

	public Student(String name, String surname) {
		if (surname.length() < 1 || name.length() < 1) {
			throw new IllegalArgumentException(
					"Ime ili prezime ne može biti prazno!");
		} else {
			this.name = name;
			this.surname = surname;
		}
	}

	/**
	 * Getter za ime
	 * 
	 * @return name
	 */

	public String getName() {
		return name;
	}

	/**
	 * Getter za prezime
	 * 
	 * @return surname
	 */

	public String getSurname() {
		return surname;
	}

	/**
	 * Setter za prezime
	 * 
	 * @param surname
	 */

	public void setSurname(String surname) {
		if (this.surname.length() < 1) {
			throw new IllegalArgumentException("Prezime ne može biti prazno!");
		} else {
			this.surname = surname;
		}

	}

	/**
	 * Setter za ime
	 * 
	 * @param name
	 */

	public void setIme(String name) {
		if (name.length() < 1) {
			throw new IllegalArgumentException("Ime ne može biti prazno!");
		} else {
			this.name = name;
		}
	}

	/**
	 * Funkcija vraæa string sa imenom i prezimenom studenta
	 */

	public String toString() {
		return name + " " + surname;
	}
}