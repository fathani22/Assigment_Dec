package com.main;

import java.io.*;

public class FileUtility {

	
	 public static void reverseFileContents(String inputFile, String outputFile) throws IOException {
	        try (Reader inputReader = new FileReader(inputFile);
	             Writer outputWriter = new FileWriter(outputFile)) {
	        	FileReversal.fileReversalWithoutAPI(inputReader, outputWriter);
	        }
	    }
}
