package test1;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 while (sc.hasNextInt()) {

		int a = sc.nextInt();
		
		
		

			if (a>= 90 && a<=100 ) {
				System.out.println("A");	
			}else if(a> 79 && a<90) {
				System.out.println("B");
				
			}else if (a>69 && a<80) {
				System.out.println("C");
			}else if (a<70 && a>59) {
				System.out.println("D");
				
			} else {
			 System.out.println("F");		
			}
			break;
			}
	}
}

