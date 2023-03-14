package dupicatewords;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		String str=duplicate(s);
		System.out.println(str);
	}
	public static String duplicate(String s) {
		String[] s1=s.toLowerCase().split(" ");
		List<String> list=Arrays.asList(s1).stream().distinct().toList();
		s1=list.toArray(new String[list.size()]);
		StringBuilder builder = new StringBuilder();
		for(String st : s1) {
		    builder.append(st+" ");
		}
		return builder.toString();
	}

}
