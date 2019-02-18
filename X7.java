package spoj.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class X7 {

	public static void main(String args[])throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	 int i,j,k;boolean flag= false;
	 int n = Integer.parseInt(st.nextToken());//no. of nodes
	 int e = Integer.parseInt(st.nextToken());//no. of edges
	 int small=0;
	int grid[][] = new int[n+1][n+1];
	for(k=0;k<e;k++)
	 { 
	   st = new StringTokenizer(br.readLine());
	   i = Integer.parseInt(st.nextToken());
	   j =Integer.parseInt(st.nextToken());
	   if(i<j)
	   {grid[i][j] = 1;
	   }
	   else
	    {grid[j][i]=1;
	    }
	 }
	if(e!=n-1)
	  {
	   System.out.println("NO");
	   System.exit(1);
	  }
	int visited[][] = new int[n+1][n+1];
	Queue<Node> myQueue = new LinkedList<Node>();
	myQueue.add(new Node(1));
	visited[1][1]=1;int count=1;
	while(myQueue.isEmpty()!=true)
	   {
	     Node current = myQueue.remove();
	     j=current.data;
	     for(k=1;k<=n;k++)
	         {
	          if(grid[j][k]==1)
	             {
	               if(visited[k][k]!=1)
	               {
	               myQueue.add(new Node(k));
	               visited[k][k]=1;
	               count++;
	                }
	                else
	                   {
	                    if(j<k){
	                    System.out.println("NO");
	                    flag=true;
	                    break;
	                    }
	                   }
	             }
	         }
	      if(flag==true)break;
	   }
	if(count<n)
	   {System.out.println("NO");}
	else if(flag==false)System.out.println("YES");
	}
	}
	//node class 
	class Node
	{
	int data;
	public Node(int d)
	 {
	  this.data = d;
	 }

}
