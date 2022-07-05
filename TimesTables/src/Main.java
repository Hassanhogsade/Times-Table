import java.util.Scanner;


public class Main {
//task 1
	public static void main(String[] args) {
		 //TODO Auto-generated method stub
//using new scanner here
		Scanner sc = new Scanner(System.in);
//outputting this question to ask user what times tabke they want to see
		String sentence = ("Which Times Table do you want to see:");
		System.out.println(sentence);
//here i ask the user for a input value
		int value = sc.nextInt();
		int answer;
		System.out.println("--------------------------------------");
		System.out.println();
//here i created a array for the first 12 numbers to times by
		int [] multiply = {1,2,3,4,5,6,7,8,9,10,11,12};
		
// created a for loop to create the which iterates through the loop and times the number chosen by the array number
		for (int j = 0; j < multiply.length; j++) {
			answer = value * multiply[j];
			System.out.println(multiply[j] + "*" + value + "=" + answer);
		}
		
	
//task 1 stretch challenge 

//		public static void main(String[] args) {
//			 //TODO Auto-generated method stub
//			Scanner sc = new Scanner(System.in);
//			
//			String sentence = ("Which Times Table do you want to see:");
//			System.out.println(sentence);
//			int value = sc.nextInt();
//			
//			String sentence2 = ("Which you want to times by:");
//			System.out.println(sentence);
//			int newValue = sc.nextInt();
//			
//			int answer;
//			System.out.println("--------------------------------------");
//			System.out.println();
//					
//			
//			for (int j = 0; j <= newValue; j++) {
//				answer = value * j;
//				System.out.println(j + "*" + value + "=" + answer);
//			}
//			
//		
//		}
		

//task 1 stretch challenge 2
		
	}
	

}
