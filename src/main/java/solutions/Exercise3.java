/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package solutions;

import exercise1.robot.enums.FacingDirection;
import exercise1.robot.models.RobotRace;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static final List<RobotRace> robotsRace = new ArrayList<>();
    public static int finishCounter = 0;
    public static long startTime;

    public static void main(String[] args) {

        // First three for example as given in the note.
        // please uncomment other to see the full result
        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Joe", 3, "FRFLLFRF"));
        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Bill", 1, "FFFFFLF"));
        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Jim", 2, "LFRF"));

//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Ankit", 1, "FRFLLFRF"));
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "James", 2, "FFFFFLF"));
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Richard", 3, "LFRF"));
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "William", 1, "FFF"));
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Monica", 2, "FFLF"));
//
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Stewart", 1, "FRFLLFRF"));
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Serena", 2, "FFFFFLF"));
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Simona", 3, "LFRF"));
//        robotsRace.add(new RobotRace(FacingDirection.NORTH, "Victoria", 1, "FFF"));

        System.out.println("The race has STARTED!");

        startTime = System.currentTimeMillis();

        for (RobotRace robot : Exercise3.robotsRace) {
            new Thread(robot).start();
        }

    }
}
