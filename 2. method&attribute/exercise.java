package practice1;
import java.util.Scanner;

public class exercise {
	
	static void method1() {
		Rectangle rect1 = new Rectangle(10,10,100);
		Rectangle rect2 = new Rectangle(1,1,90,90);
	
	}
	
	static void  method2() {
		Rectangle rect = new Rectangle(0,0, 100); 
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Choose (1 : move, 2 : enlarge, 3 : change, 4: quit)"); 
			int choice = input.nextInt();
			switch(choice) {
				case 1: int dx = input.nextInt(); int dy = input.nextInt();
					rect.move(dx, dy); break;
				case 2: double rate = input.nextDouble();
	        			rect.change((int)(rate * rect.getHeight() - rect.getHeight())); 
	        			break;
				case 3: int dh = input.nextInt(); int dw = input.nextInt();
					rect.change(dh, dw); break;
				case 4: System.out.println("Terminated"); return;
			}
		rect.print();
		System.out.println("Area : " + rect.getArea());
		}
	}
	
	static void  method3() {
		CurrencyConverter converter = new CurrencyConverter(1121.3);
		System.out.println("1,000,000원은 " + converter.toDollar(1000000) + "달러이다.");
		System.out.println("100  달러는 " + converter.toKWR(100) + "원이다.");
	}
	
	public static void main(String[] args)
	{
		//method1();
		//method2();
		method3();
	}
}
