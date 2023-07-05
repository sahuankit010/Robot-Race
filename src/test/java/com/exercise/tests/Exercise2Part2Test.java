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

public class Exercise2Part2Test {
    Exercise2 ex = new Exercise2();

    private ByteArrayOutputStream captureOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        return outputStream;
    }

    // Helper method to get the console output as a string
    private String getOutput(ByteArrayOutputStream outputStream) {
        System.out.flush();
        System.setOut(System.out);
        return outputStream.toString().trim();
    }

    // Test case: start = 0, end = 5
    @Test
    public void testCountUpAndDownOutputExample1() {

        ByteArrayOutputStream outputStream1 = captureOutput();
        ex.countUpAndDown(0, 5);
        String output1 = getOutput(outputStream1);
        assertEquals("0\n1\n2\n3\n4\n5\n4\n3\n2\n1\n0", output1);
    }

    // Test case: start = 1, end = 3
    @Test
    public void testCountUp_StartAndEndAreEqualExample2() {

        ByteArrayOutputStream outputStream2 = captureOutput();
        ex.countUpAndDown(1, 3);
        String output2 = getOutput(outputStream2);
        assertEquals("1\n2\n3\n2\n1", output2);
    }

    // Test case: start = 10, end = 10
    @Test
    public void testCountUp_StartAndEndAreEqualExample3() {

        ByteArrayOutputStream outputStream3 = captureOutput();
        ex.countUpAndDown(10, 10);
        String output3 = getOutput(outputStream3);
        assertEquals("10", output3);
    }

    // Test case: start = -5, end = 3
    @Test
    public void testCountUp_StartAndEndAreEqualExample4() {

        ByteArrayOutputStream outputStream3 = captureOutput();
        ex.countUpAndDown(-5, 3);
        String output3 = getOutput(outputStream3);
        System.out.println(output3);
        assertEquals("-5\n-4\n-3\n-2\n-1\n0\n1\n2\n3\n2\n1\n0\n-1\n-2\n-3\n-4\n-5", output3);
    }
}
