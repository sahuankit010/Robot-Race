/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package com.exercise.tests;

import exercise1.robot.enums.FacingDirection;
import exercise1.robot.models.Robot;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void testFacingNorthThenTurnRight() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.NORTH);
        robot.move("FFRFF");
        assertEquals("[2, 2]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.EAST, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingEastWith5StepsForward() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.EAST);
        robot.move("FFFFF");
        assertEquals("[5, 0]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.EAST, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingEastTurnLeft() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.EAST);
        robot.move("FFLFF");
        assertEquals("[2, 2]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.NORTH, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingEastTurnRight() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.EAST);
        robot.move("FFRFF");
        assertEquals("[2, -2]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.SOUTH, robot.getCurrentFacingDirection());
    }

    @Test
    public void testExampleTestCase1() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.NORTH);
        robot.move("FFRRFF");
        assertEquals("[0, 0]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.SOUTH, robot.getCurrentFacingDirection());

    }

    @Test
    public void testExampleTestCase2() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.NORTH);
        robot.move("FF");
        assertEquals("[0, 2]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.NORTH, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingWestWith5StepsForward() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.WEST);
        robot.move("FFFFF");
        assertEquals("[-5, 0]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.WEST, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingWestTurnLeft() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.WEST);
        robot.move("FFLFFF");
        assertEquals("[-2, -3]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.SOUTH, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingWestTurnRight() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.WEST);
        robot.move("FFRFFF");
        assertEquals("[-2, 3]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.NORTH, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingSouthWith5StepsForward() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.SOUTH);
        robot.move("FFFFF");
        assertEquals("[0, -5]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.SOUTH, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingSouthTurnLeft() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.SOUTH);
        robot.move("FFLFFF");
        assertEquals("[3, -2]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.EAST, robot.getCurrentFacingDirection());
    }

    @Test
    public void testFacingSouthTurnRight() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        Robot robot = new Robot(FacingDirection.SOUTH);
        robot.move("FFRFFF");
        assertEquals("[-3, -2]", robot.getCoordinate().toString());
        assertEquals(FacingDirection.WEST, robot.getCurrentFacingDirection());
    }
}
