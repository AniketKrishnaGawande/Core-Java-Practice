package charHandling;

import java.io.FileReader;
import java.util.Scanner;

public class SumFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter file name :: ");
		try(Scanner sc = new Scanner(System.in);
				Scanner sr = new Scanner(new FileReader(sc.next()))
				) {
			int sum =0;
			while(sr.hasNextInt())
				sum=sum+sr.nextInt();
			System.out.println(sum);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
