
public class Test {

	public static void main(String[] args) {
		
		StudentArray bitCamp = new StudentArray();
		bitCamp.addStudent();
		bitCamp.print();
		System.out.println("\nRandom student je:" + bitCamp.getRandomStudent().toString());
	}

}