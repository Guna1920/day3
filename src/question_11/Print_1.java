package question_11;

import java.util.Scanner;

public class Print_1 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		while(a>0&&a<=b)
		{
			System.out.println(a);
			a++;
		}
	}

}
