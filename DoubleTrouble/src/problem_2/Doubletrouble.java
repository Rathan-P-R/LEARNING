package problem_2;
import java.util.Scanner;

public class Doubletrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
int num=scan.nextInt();
scan.close();
System.out.println(doubleTheNumber(num));

	}
	
	public static int doubleTheNumber(int num)
	
	{
		return num*2;
	}

}
