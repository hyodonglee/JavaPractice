package practice1;

import java.util.Scanner;

public class In_and_Out {
	
		static void method1()
		{
			Scanner input = new Scanner(System.in);
			int score=0;
			int sum=0;
			int cnt=0;
			while(score!=-1){
				System.out.print("Enter grade: ");
				score = input.nextInt();
				cnt++;
				if(score == -1)
				{
					cnt--;
					System.out.printf("Total of %d student grades is %d\n",cnt, sum);
					System.out.printf("Class average is %d", sum/cnt );
					return;
				}
				sum+=score;

			}
		}
		
		static void method2()
		{
			int score=0;
			int[] arr = new int[5];
			int cnt=0;
			Scanner input = new Scanner(System.in);
			
			while(true)
			{
				System.out.printf("Enter grade: ");
				score = input.nextInt();
				if(score ==-1)
				{
					System.out.println("Number of students who received each grade:");
					System.out.printf("A: %d\n", arr[0]);
					System.out.printf("B: %d\n", arr[1]);
					System.out.printf("C: %d\n", arr[2]);
					System.out.printf("D: %d\n", arr[3]);
					System.out.printf("F: %d\n", arr[4]);
					return;
				}
				if(score>=90 && score<=100) arr[0]++;
				else if(score>=80 && score<=89) arr[1]++;
				else if(score>=70 && score<=79) arr[2]++;
				else if(score>=60 && score<=69) arr[3]++;
				else arr[4]++;
			}
		}

		static void method3()
		{
			
		}
		
		public static void main(String[] args)
		{
			//method1();
			method2();
			method3();
		}

}
