
public class RasporedStudenata {
	
	//Zadatak za samostalan rad
	
	private Student[][] raspored;
	
	/**
	 * Konstruktor koji kreira matricu studenata
	 */
	
	public RasporedStudenata()
	{
		raspored = new Student[6][4];
	}
	
	/**
	 * Funkcija koja dodaje studente matrici, po rasporedu sjedenja
	 */
	
	public void dodavanjeStudenta()
	{
		raspored[0][0] = new Student("Jesenko", "Gavriæ");
		raspored[0][1] = new Student("Sanela", "Grciæ");
		raspored[0][2] = new Student("Amra","Popržanoviæ");
		raspored[0][3] = new Student("Gorjan", "Kalauzoviæ");
		raspored[1][0] = new Student("Davor", "Stankoviæ");
 		raspored[1][1] = new Student("Emir", "Imamoviæ");
		raspored[1][2] = new Student("Nedžad", "Hamziæ");
		raspored[1][3] = new Student("Haris", "Arifoviæ");
		raspored[2][0] = new Student("Selma", "Tabakoviæ");
		raspored[2][1] = new Student("Adnan", "Spahiæ");
		raspored[2][2] = new Student("Neldin", "Džekoviæ");
		raspored[2][3] = new Student("Nermin", "Graca");
		raspored[3][0] = new Student("Haris", "Krkaliæ");
		raspored[3][1] = new Student("Gordan", "Sajeviæ");
		raspored[3][2] = new Student("Edib", "Imamoviæ");
		raspored[3][3] = new Student("Mustafa", "Ademoviæ");
		raspored[4][0] = new Student("Nermin", "Vuèiniæ");
		raspored[4][1] = new Student("Mirza", "Beèiæ");
		raspored[4][2] = new Student("Hikmet", "Durgutoviæ");
		raspored[4][3] = new Student("Nedim", "Omeroviæ");
		raspored[5][0] = new Student("Vedad", "Zorniæ");
		raspored[5][1] = new Student("Prazno", "Prazno");
		raspored[5][2] = new Student("Emina", "Muratoviæ");
		raspored[5][3] = new Student("Prazno", "Prazno");
		

	}
	
	/**
	 * Funkcija koja ispisuje matricu studenata
	 */
	
	public void ispis()
	{
		for (int i=0; i<raspored.length; i++)
		{
			for (int j=0; j<raspored[i].length; j++)
			{
				System.out.print(raspored[i][j].toString() + "  ");
			}
			System.out.println();
			
			
		}
	}
}