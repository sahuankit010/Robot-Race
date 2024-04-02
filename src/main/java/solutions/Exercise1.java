/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */

package solutions;

import exercise1.robot.enums.FacingDirection;
import exercise1.robot.models.Robot;

public class Exercise1 {

    public static void main(String[] args) {
        // assumption: original direction is NORTH as given example "FF" results in [0,2] u can change it in the next line
        Robot robot = new Robot(FacingDirection.NORTH);
        robot.move("LFFFRFFFRRFFF");

        System.out.println(robot.getCoordinate());
    }

}
