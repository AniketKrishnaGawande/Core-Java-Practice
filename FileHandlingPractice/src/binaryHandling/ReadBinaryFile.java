package binaryHandling;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class ReadBinaryFile {

	public static void main(String[] args) {

		// java -- doi -- bio -- fio -- file
		try (Scanner sc = new Scanner(System.in);
				DataInputStream doi = new DataInputStream(new BufferedInputStream(new FileInputStream(sc.next())))

		) {

			CoreBanking bank = new CoreBanking(doi.readInt(), doi.readUTF(), doi.readDouble());
			System.out.println(bank);

		} catch (

		Exception e) {
			e.printStackTrace();
		}

	}
}
