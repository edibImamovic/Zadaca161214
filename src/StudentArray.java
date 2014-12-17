
public class StudentArray {
	
	//Zadatak za samostalan rad
	
	private Student[][] array;
	
	/**
	 * Konstruktor koji kreira matricu studenata
	 */
	
	public StudentArray()
	{
		array = new Student[6][4];
	}
	
	/**
	 * Funkcija koja dodaje studente matrici, po rasporedu sjedenja
	 */
	
	public void addStudent()
	{
		array[0][0] = new Student("Jesenko", "Gavri�");
		array[0][1] = new Student("Sanela", "Grci�");
		array[0][2] = new Student("Amra","Popr�anovi�");
		array[0][3] = new Student("Gorjan", "Kalauzovi�");
		array[1][0] = new Student("Davor", "Stankovi�");
 		array[1][1] = new Student("Emir", "Imamovi�");
		array[1][2] = new Student("Ned�ad", "Hamzi�");
		array[1][3] = new Student("Haris", "Arifovi�");
		array[2][0] = new Student("Selma", "Tabakovi�");
		array[2][1] = new Student("Adnan", "Spahi�");
		array[2][2] = new Student("Neldin", "D�ekovi�");
		array[2][3] = new Student("Nermin", "Graca");
		array[3][0] = new Student("Haris", "Krkali�");
		array[3][1] = new Student("Gordan", "Sajevi�");
		array[3][2] = new Student("Edib", "Imamovi�");
		array[3][3] = new Student("Mustafa", "Ademovi�");
		array[4][0] = new Student("Nermin", "Vu�ini�");
		array[4][1] = new Student("Mirza", "Be�i�");
		array[4][2] = new Student("Hikmet", "Durgutovi�");
		array[4][3] = new Student("Nedim", "Omerovi�");
		array[5][0] = new Student("Vedad", "Zorni�");
		array[5][1] = new Student("Prazno", "Prazno");
		array[5][2] = new Student("Emina", "Muratovi�");
		array[5][3] = new Student("Prazno", "Prazno");
		

	}
	
	/**
	 * Funkcija koja ispisuje matricu studenata
	 */
	
	public void print(){
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j].toString() + "  ");
			}
			System.out.println();	
		}
	}
		
	public Student getRandomStudent() {
		int rowIndex = (int)(Math.random()*6);
		int columnIndex =(int)(Math.random()*4);
		return array[rowIndex][columnIndex];
		
	
		}
		

	}

	
