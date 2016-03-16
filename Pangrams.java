package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toLowerCase();
		List alpha = new ArrayList();
		for(int i =0;i<str.length();i++) {
			if(!alpha.contains(str.charAt(i)) && str.charAt(i)!= ' ') 
				alpha.add(str.charAt(i));
		}		
		if(alpha.size() == 26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}
}
