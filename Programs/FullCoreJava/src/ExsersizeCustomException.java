/**
 * 
 */

/**
 * @author Raj.Kumar
 *
 */
public class ExsersizeCustomException {

	/**
	 * @param args
	 */
	static int k =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(ExsersizeCustomException.Divide(9,3));
			System.out.println(ExsersizeCustomException.Divide(0,0));
			System.out.println(ExsersizeCustomException.Divide(2,0));
		}
		catch(CException e)
		{
			System.out.println("Got the exception : " + e.getMessage());
		}
		finally
		{
			System.out.println("cleaning up the garbage things");
		}
	}
	
	public static int Divide(int i, int j) throws CException
	{
		if (j == 0 && i != 0)
		{
			throw new CException("this is cutom exception");
		}
		else if(j == 0 && i == 0)
		{
			throw new CException("both values are null", i);
		}
		else
		{
			k = i/j;
			return k;
		}
	}

}

class CException extends Exception
{
	private String str1;
	private int i1;
	
	CException()
	{
		
	}
	
	CException(String str)
	{
		this.str1 = str;
	}
	
	CException(String str, int i)
	{
		this.str1 = str;
		this.i1 = i;
	}
	
	public String getMessage()
	{
		return str1;
	}
}
