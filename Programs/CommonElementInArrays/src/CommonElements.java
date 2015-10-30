
public class CommonElements {

	
	static int[] a1 = {2,5,8,9,11,12};
	static int[] a2 = {6,8,10,12};
	static int[] a3 = {2,8,9,10,12};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i =0 ,j =0, k=0;
		int n1 = a1.length;
		int n2 = a2.length;
		int n3 = a3.length;
		while (i<n1 && j<n2 && k<n3)
		{
			if(a1[i] == a2[j] && a2[j] == a3[k])
			{
				System.out.println(a1[i]);
				i++; j++; k++;
			}
			else if (a1[i] < a2[j])
				i++;
			else if (a1[i] > a2[j] || a2[j] < a3[k])
				j++;
			else
				k++;
		}
	}

}
