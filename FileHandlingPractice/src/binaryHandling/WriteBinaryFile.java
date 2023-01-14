package binaryHandling;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteBinaryFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CoreBanking bank = new CoreBanking(111, "Aniket", 10000); //acno, name,balance
		// javac -- DOS--BOS--Fos-- file
		try (Scanner sc = new Scanner(System.in);
				DataOutputStream dos = new DataOutputStream(
						new BufferedOutputStream(new FileOutputStream(sc.next())))) {

			dos.writeInt(bank.getAcno());
			dos.writeUTF(bank.getName());
			dos.writeDouble(bank.getBalance());
			System.out.println("data written into file");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
