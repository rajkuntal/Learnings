import java.util.ArrayList;
import java.util.List;

public class ImplementStackUsingArray {
	
	int stackSize ;
	static int[] stackArr;
	int stacktop;
	
	int item = 0;
	
	ImplementStackUsingArray(int size)
	{
		stackSize = size;
		stackArr = new int[stackSize];
		stacktop = -1;
	}
	
	public void StackPUSH(int i) throws Exception
	{
		if(stacktop == stackSize - 1)
		{
			throw new Exception("Overflow condition : Stack is already full");
		}
		stackArr[++stacktop] = i;
		System.out.println("Added item is :" + i + " And top = " + stacktop);
	}
	
	public void StackPOP() throws Exception
	{
		if(stacktop < 0)
		{
			throw new Exception("Underflow condition : Stack is already empty");
		}
		item = stackArr[stacktop--];		
		System.out.println("deleted item is :" + item + " And top = " + stacktop);				
	}
	
	public static void main(String arg[])
	{
		int top = 4;
		ImplementStackUsingArray obj = new ImplementStackUsingArray(top);
		try
		{
			
			obj.StackPUSH(2);
			obj.StackPOP();
			obj.StackPUSH(4);
			obj.StackPUSH(6);
			obj.StackPUSH(8);
			obj.StackPOP();	
			obj.StackPUSH(10);
			//obj.StackPUSH(12);
			obj.StackPOP();
			obj.StackPOP();
			obj.StackPOP();
			obj.StackPOP();
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
