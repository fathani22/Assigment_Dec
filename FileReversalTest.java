package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

import com.main.FileReversal;

class FileReversalTest {

	@Test
	void testFileReversalWithoutAPI() {
		 String mockInput = "This is my test file for file reversal Program";
	        String expectedOutput = "margorP lasrever elif rof elif tset ym si sihT";

	        Reader inputReader = new StringReader(mockInput);
	        StringWriter outputWriter = new StringWriter();

	        // Call the method with mocks
	        try {
				FileReversal.fileReversalWithoutAPI(inputReader, outputWriter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        // Verify the output
	        assertEquals(expectedOutput, outputWriter.toString());
	}
	
	@Test
	void tsetFileReversalWithReverseFunction() {
		 String mockInput = "This is my test file for file reversal Program";
	        String expectedOutput = "margorP lasrever elif rof elif tset ym si sihT";

	        Reader inputReader = new StringReader(mockInput);
	        StringWriter outputWriter = new StringWriter();

	        // Call the method with mocks
	        try {
				FileReversal.fileReversalWithReverseFunction(inputReader, outputWriter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        // Verify the output
	        assertEquals(expectedOutput, outputWriter.toString());
	}

}
