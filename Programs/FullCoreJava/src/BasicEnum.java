
public class BasicEnum {
	
	private kaseya k;
	
	public BasicEnum(kaseya kk)
	{
		this.k = kk;
	}
	
	public void getString()
	{
		switch(k) {
			case A:
				System.out.println(k);
				break;
			case B:
				System.out.println(k);
				break;
			case C:
				System.out.println(k);
				break;
			default:
				System.out.println("D");
				break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicEnum A = new BasicEnum(kaseya.A);
		A.getString();
		BasicEnum B = new BasicEnum(kaseya.B);
		B.getString();

	}

	enum kaseya
	{
		A, B, C, D;
	}
}
