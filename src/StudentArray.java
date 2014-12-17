
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
		array[0][0] = new Student("Jesenko", "Gavriæ");
		array[0][1] = new Student("Sanela", "Grciæ");
		array[0][2] = new Student("Amra","Popržanoviæ");
		array[0][3] = new Student("Gorjan", "Kalauzoviæ");
		array[1][0] = new Student("Davor", "Stankoviæ");
 		array[1][1] = new Student("Emir", "Imamoviæ");
		array[1][2] = new Student("Nedžad", "Hamziæ");
		array[1][3] = new Student("Haris", "Arifoviæ");
		array[2][0] = new Student("Selma", "Tabakoviæ");
		array[2][1] = new Student("Adnan", "Spahiæ");
		array[2][2] = new Student("Neldin", "Džekoviæ");
		array[2][3] = new Student("Nermin", "Graca");
		array[3][0] = new Student("Haris", "Krkaliæ");
		array[3][1] = new Student("Gordan", "Sajeviæ");
		array[3][2] = new Student("Edib", "Imamoviæ");
		array[3][3] = new Student("Mustafa", "Ademoviæ");
		array[4][0] = new Student("Nermin", "Vuèiniæ");
		array[4][1] = new Student("Mirza", "Beèiæ");
		array[4][2] = new Student("Hikmet", "Durgutoviæ");
		array[4][3] = new Student("Nedim", "Omeroviæ");
		array[5][0] = new Student("Vedad", "Zorniæ");
		array[5][1] = new Student("Prazno", "Prazno");
		array[5][2] = new Student("Emina", "Muratoviæ");
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

	
