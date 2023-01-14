package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import libraryException.LibraryException;
import libraryManagement.core.com.Library;

public class IoUtils {

	public static void WriteInFile(String file, Map<String, Library> list) throws LibraryException, IOException {
		File f = new File(file);
		if (f.isFile()) {
			try (ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream(f))) {

				write.writeObject(list);
			}
		}
		throw new LibraryException("File not Found");
	}

	public static Map<String, Library> ReadFile(String filename)
			throws LibraryException, IOException, ClassNotFoundException {
		File file = new File(filename);

		if (file.isFile()) {
			try (ObjectInputStream read = new ObjectInputStream(new FileInputStream(file))) {

				Map<String, Library> map = new HashMap<String, Library>();
				map = (Map) read.readObject();
				return map;
			}
		}
		throw new LibraryException("File not Found");
	}
}
