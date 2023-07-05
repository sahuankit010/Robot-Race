/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */

package com.exercise.tests;

import org.junit.jupiter.api.Test;
import solutions.Exercise2;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Exercise2Part1Test {
    Exercise2 ex = new Exercise2();

    @Test
    public void testCountUp() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ex.countUp(0, 5);
        String expectedOutput = "0\n1\n2\n3\n4\n5\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testCountUp_StartAndEndAreEqual() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ex.countUp(0, 0);
        String expectedOutput = "0\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testCountUp_StartLessThanEnd() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ex.countUp(3, 8);
        String expectedOutput = "3\n4\n5\n6\n7\n8\n";

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testCountUp_StartGreaterThanEnd() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        ex.countUp(10, 6);
        String expectedOutput = "";

        assertEquals(expectedOutput, outputStream.toString());
    }

}
