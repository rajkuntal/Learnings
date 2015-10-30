package com.raju.array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindCommonContacts {
	
	Queue<Integer> queue= new LinkedList<Integer>();
	
	int[][] arr = new int[5][5];
	List<Integer> aa = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindCommonContacts obj = new FindCommonContacts();
		
		String[][] contact = { 
					{"A", "B", "C"},
			       { "B", "D", "Q"},
			       { "P", "R", "S"},
			       { "Q", "Z", "N"},
			       { "R", "G", "W"}
			     	};
		obj.prepareGraph(contact);
		obj.getSameElement();
	}
	
	public void bfs(int adjacency_matrix[][], int source)
    {
        int number_of_nodes = adjacency_matrix[source].length - 1;
 
        int[] visited = new int[number_of_nodes + 1];
        int i, element;
 
        visited[source] = 1;
        queue.add(source);
       while (!queue.isEmpty())
        {
            element = queue.remove();
            i = element;
            System.out.print(i + "\t");
            aa.add(i);
            while (i <= number_of_nodes)
            {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
                {
                    queue.add(i);
                    visited[i] = 1;
                }
                i++;
            }
        }
    }

	public void prepareGraph(String[][] contact) {
		int i = 0, j = 0, k = 0, l = 0, m = 0; 
		
		for(i = 0; i < contact.length ; i++)
		{
			for(j = i+1; j < contact.length; j++)
			{
				for(k = 0; k < contact[i].length && j >= 0; k++)
				{
					for(l = contact[i].length - 1; l >= 0; l--)
					{
						m = 0;
						if(contact[i][k] == contact[j][l])
						{
							m = 1;
							break;
						}
					}
					if(m ==1)
					{
						arr[i][j] = 1;
						arr[j][i] = 1;
						break;
					}
				}
				System.out.println();
			}
		}
				
		for(i = 0; i < arr.length ; i++)
		{
			for(j=0; j < arr.length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void getSameElement(){
		int n = 0;
		for(;n < arr[1].length; n++ )
		{
			//if(aa.contains(n))
				bfs(arr, n);
			System.out.println();
		}
	}

}
