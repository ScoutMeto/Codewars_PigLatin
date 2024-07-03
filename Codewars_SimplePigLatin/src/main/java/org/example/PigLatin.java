package org.example;

public class PigLatin {
    public static String pigIt(String str) {

        StringBuilder wordSetOfStr = new StringBuilder();

        String[] strArray = str.split("\\s+"); // Regex as tool to split a sentence.

        for (String s : strArray) {
                if(s.matches("[a-zA-Z]+")) { // Work with letters only.
                    StringBuilder currentString = new StringBuilder(s); // StringBuilder for string design.
                    char firstChar = currentString.charAt(0);
                    currentString.append(firstChar);
                    currentString.append("ay");
                    currentString.deleteCharAt(0);
                    wordSetOfStr.append(currentString).append(" ");
                } else {
                    wordSetOfStr.append(s).append(" "); // Leave without changes, if not letter (,.!? ...).
            }
        }
        return wordSetOfStr.toString().trim(); // Delete whitespaces (start and end of sentence) before return the result.
    }
}

/*
TESTING

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
    }
}
 */