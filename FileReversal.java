package com.main;

import java.io.*;

public class FileReversal {

	public static void fileReversalWithReverseFunction(Reader inputReader, Writer outputWriter) throws IOException {

		BufferedReader buffReder = new BufferedReader(inputReader);
		StringBuilder s = new StringBuilder();
		String line;

		while ((line = buffReder.readLine()) != null) {
			s.append(line).append("\n");
		}

		String reverse = s.reverse().toString().strip();

		BufferedWriter bufferedWriter = new BufferedWriter(outputWriter);
		bufferedWriter.write(reverse);
		bufferedWriter.flush();
	}

	public static void fileReversalWithoutAPI(Reader inputReader, Writer outputWriter) throws IOException {

		BufferedReader buffReder = new BufferedReader(inputReader);
		CharArrayWriter charWritter = new CharArrayWriter();

		StringBuilder s = new StringBuilder();
		String line;

		while ((line = buffReder.readLine()) != null) {
			s.append(line).append("\n");
		}

		char[] content = s.toString().strip().toCharArray();
		int left = 0, right = content.length - 1;

		while (left < right) {

			char temp = content[left];
			content[left] = content[right];
			content[right] = temp;
			left++;
			right--;
		}

		// System.out.print(new String(content));

		BufferedWriter bufferedWriter = new BufferedWriter(outputWriter);

		for (char c : content) {
			bufferedWriter.write(c);
		}
		bufferedWriter.flush();

	}

	/*
	 * public static void main(String args[]) throws IOException {
	 * FileReversal.fileReversalWithReverseFunction(
	 * "C:\\Users\\Hp\\eclipse-workspace\\Assigment\\src\\com\\main\\Test.txt",
	 * "C:\\Users\\Hp\\eclipse-workspace\\Assigment\\src\\resources\\output\\result.txt"
	 * ); FileReversal.fileReversalWithoutAPI(
	 * "C:\\Users\\Hp\\eclipse-workspace\\Assigment\\src\\com\\main\\Test.txt",
	 * "C:\\Users\\Hp\\eclipse-workspace\\Assigment\\src\\resources\\output\\result1.txt"
	 * );
	 * 
	 * }
	 */

}
