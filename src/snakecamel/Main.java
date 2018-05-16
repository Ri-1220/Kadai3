package snakecamel;

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		try{
		String a = sc.nextLine();		
		String b;
		if(Character.isUpperCase(a.charAt(0))) {
		  b=SnakeCamelUtil.camelToSnakecase(a);
		  System.out.println(b);
		}
		else if(Character.isLowerCase(a.charAt(0))){
		  b = SnakeCamelUtil.snakeToCamelcase(a);
		  System.out.println(b);	 
		}
		else if(a.matches(".*_.*")){
			b = SnakeCamelUtil.snakeToCamelcase(a);	
			System.out.println(b);	
		}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("");
		}
	}
}
