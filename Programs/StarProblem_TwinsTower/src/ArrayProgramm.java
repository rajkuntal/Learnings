
public class ArrayProgramm {
	
	int[] arr = new int[100];
	
	static int size = 0;
	
	private void insertInArray(int element){
		
		arr[size] = element;
		size++;
	}
	
	public static void displayArr(String arg[] ){
		
		ArrayProgramm a = new ArrayProgramm();
		
		a.insertInArray(2);		
		a.insertInArray(3);
		a.insertInArray(4);
		a.insertInArray(5);
		a.insertInArray(6);
		
		System.out.println(size);
	}

}
