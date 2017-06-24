package session8;

import java.io.*;

public class fileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * declaring inputStream and outputStream outside try package using null
		 */

		FileInputStream instream = null;
		FileOutputStream outstream = null;

		try {
			// Created a file object using File() method

			File infile = new File("C:/Users/Tanaya/Desktop/shortStories.txt");
			File outfile = new File("C:/Users/Tanaya/Desktop/copiedShortStories.txt");

			// constructor takes a file object to create an input stream object
			// to read the file.

			instream = new FileInputStream(infile);

			// constructor takes a file object to create an output stream object
			// to write the file.

			outstream = new FileOutputStream(outfile);

			// created a byte array “buffer”

			byte[] buffer = new byte[1024];

			// initializing integer variable length

			int length;

			/*
			 * copying the contents from input stream to output stream using
			 * read and write methods
			 */

			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);
			}

			System.out.println("File copied successfully!!");

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		finally {
			
			// Closing the input/output file streams
			instream.close();
			outstream.close();
		}
	}

}
