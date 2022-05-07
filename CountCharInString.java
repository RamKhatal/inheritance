package pkg1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharInString {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a string");
	String s = scn.nextLine();
	s = s.replace(" ", "");
	char a[] = s.toCharArray();
	int count =0;
	TreeMap<Character,Integer>p = new TreeMap<>();
	for(int i=0;i<a.length;i++)
	{
		count = 0;
		for(int j=0;j<a.length;j++)
		if(a[i]==a[j])
		{
			count++;
		}
		p.put(a[i],count);
	}
	System.out.println(p);

	}

}
