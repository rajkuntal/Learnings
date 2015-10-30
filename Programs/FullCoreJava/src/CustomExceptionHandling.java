
public class CustomExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			CustomExceptionHandling.myTest(null);
		}
		catch(CustomException e)
		{
			System.out.println("Inside the catchblock " + e.getMessage());
		}
	}
		
		static void myTest(String str) throws CustomException
		{
	        if(str == null)
	        {
	            throw new CustomException("String val is null");
	        }
		}
	}
	
	@SuppressWarnings("serial")
	class CustomException extends Exception{
		
		private String message;
		
		/*
		CustomException()
		{
			super();
		}
		*/
		
		public CustomException(String str)
		{
			//super(str);
			this.message = str;
		}
		/*
		public CustomException(Throwable cause)
		{
			super(cause);
		}
		*/
		
		@Override
		public String toString()
		{
			return message;
		}
		
		@Override
		public String getMessage()
		{
			return message;
		}
	}
