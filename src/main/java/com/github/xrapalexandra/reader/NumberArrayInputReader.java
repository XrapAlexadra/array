package com.github.xrapalexandra.reader;

import com.github.xrapalexandra.model.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class NumberArrayInputReader {

    private static final Logger logger = LogManager.getLogger(NumberArrayInputReader.class);

    private static final File DEFAULT_FILE = new File("data/array.txt");

    public NumberArray read() {
        NumberArray numberArray = read(DEFAULT_FILE);
        return numberArray;
    }

    public NumberArray read(File file) {
        String stringFromFile = readStringFromFile(file);
        String[] arrayFromString = stringFromFile.split(" +");
        int[] readNumbers = new int[arrayFromString.length];
        for (int i = 0; i < arrayFromString.length; i++) {
            readNumbers[i] = Integer.parseInt(arrayFromString[i]);
        }
        logger.info("Read numbers from file: " + file + " in the NumbersArray");
        return new NumberArray(readNumbers);
    }

    private String readStringFromFile(File file) {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader fileReader = new FileReader(file)) {
            int c;
            while ((c = fileReader.read()) >= 0) {
                stringBuilder.append((char) c);
            }
        } catch (FileNotFoundException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        }
        String result = stringBuilder.toString().trim();
        return result;
    }
}
