/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package exercise1.robot.handleException;

import exercise1.robot.enums.FacingDirection;

public class IllegalFaceDirection extends RuntimeException {
    public IllegalFaceDirection(FacingDirection direction) {
        super(direction + " is not a valid facing direction");
    }
}
