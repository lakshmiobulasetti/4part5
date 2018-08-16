import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int[] num={1,2,5,8,9,10};
	int toFind=5;
	boolean found=false;
	for(int n:num)
	{
	if(n==toFind)
	{
		found=true;
		break;
	}
	
	}
	if(found)
	System.out.println(toFind +"is found.");
	else
	System.out.println(toFind +"is not found.");
}
}
