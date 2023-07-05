/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */

package exercise1.robot.models;

import exercise1.robot.enums.FacingDirection;

public interface RobotInterface {
    void move(String instructions);

    Coordinate getCoordinate();

    FacingDirection getCurrentFacingDirection();
}
