
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
		raspored[0][0] = new Student("Jesenko", "Gavri�");
		raspored[0][1] = new Student("Sanela", "Grci�");
		raspored[0][2] = new Student("Amra","Popr�anovi�");
		raspored[0][3] = new Student("Gorjan", "Kalauzovi�");
		raspored[1][0] = new Student("Davor", "Stankovi�");
 		raspored[1][1] = new Student("Emir", "Imamovi�");
		raspored[1][2] = new Student("Ned�ad", "Hamzi�");
		raspored[1][3] = new Student("Haris", "Arifovi�");
		raspored[2][0] = new Student("Selma", "Tabakovi�");
		raspored[2][1] = new Student("Adnan", "Spahi�");
		raspored[2][2] = new Student("Neldin", "D�ekovi�");
		raspored[2][3] = new Student("Nermin", "Graca");
		raspored[3][0] = new Student("Haris", "Krkali�");
		raspored[3][1] = new Student("Gordan", "Sajevi�");
		raspored[3][2] = new Student("Edib", "Imamovi�");
		raspored[3][3] = new Student("Mustafa", "Ademovi�");
		raspored[4][0] = new Student("Nermin", "Vu�ini�");
		raspored[4][1] = new Student("Mirza", "Be�i�");
		raspored[4][2] = new Student("Hikmet", "Durgutovi�");
		raspored[4][3] = new Student("Nedim", "Omerovi�");
		raspored[5][0] = new Student("Vedad", "Zorni�");
		raspored[5][1] = new Student("Prazno", "Prazno");
		raspored[5][2] = new Student("Emina", "Muratovi�");
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