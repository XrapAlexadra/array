package com.github.xrapalexandra.reader;

import com.github.xrapalexandra.model.NumberArray;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NumberArrayInputReaderTest extends Assert {

    NumberArrayInputReader numberArrayInputReader = new NumberArrayInputReader();

    @Test
    public void testRead() {
        NumberArray actual = numberArrayInputReader.read();
        NumberArray expected = new NumberArray(new int[] {23, 45, 67, 123, 45, 0, 456, 67, 89, 1234, 5678});

        assertEquals(actual, expected);
    }

}