package com.github.xrapalexandra.reader;

import com.github.xrapalexandra.model.NumberArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class NumberArrayInputReader {

    private static final Logger logger = LogManager.getLogger(NumberArrayInputReader.class);

    private static final File DEFAULT_FILE = new File("file/array.txt");

    public NumberArray read() {
        NumberArray numberArray = read(DEFAULT_FILE);
        return numberArray;
    }

    public NumberArray read(File file) {
        String stringFromFile = readStringFromFile(file);
        String[] arrayFromString = stringFromFile.split(" +");
        List<Integer> readNumbers = Arrays.stream(arrayFromString)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
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
            e.printStackTrace();
        } catch (IOException e) {
            logger.error(e);
            e.printStackTrace();
        }
        String result = stringBuilder.toString().trim();
        return result;
    }
}
