/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */

package exercise1.robot.models;

import exercise1.robot.enums.FacingDirection;
import exercise1.robot.enums.MovementInstruction;
import exercise1.robot.handleException.ValidationCommand;
import exercise1.robot.handleException.IllegalCommand;
import exercise1.robot.utils.CalculateCorrectDirectionUtility;
import exercise1.robot.utils.ModelUtility;

import java.util.List;

public class Robot implements RobotInterface {

    public Coordinate coordinate;
    public FacingDirection currentFacingDirection;

    public Robot(FacingDirection initialFacingDirection) {
        if (initialFacingDirection == null) {
            throw new IllegalArgumentException("Invalid facing direction");
        }
        this.currentFacingDirection = initialFacingDirection;
        this.coordinate = new Coordinate(0, 0);
    }

    @Override
    public void move(String instructions) {
        if (instructions == null || instructions.isBlank())
            throw new IllegalArgumentException("Input command can't empty.");
        else if (!ValidationCommand.isValidCommand(instructions)) throw new IllegalCommand(instructions);

        List<Character> commands = ModelUtility.convertStringToCharList(instructions);

        for (int i = 0; i < commands.size(); i++) {
            /**
             * https://www.baeldung.com/java-convert-char-to-string
             */
            String comp = String.valueOf(commands.get(i));
            if (comp.equals(MovementInstruction.MOVE_FORWARD.getValue())) moveForward();
            else if (comp.equals(MovementInstruction.TURN_LEFT.getValue())) turnLeftOperation();
            else if (comp.equals(MovementInstruction.TURN_RIGHT.getValue())) turnRightOperation();
        }

    }

    protected void turnRightOperation() {
        currentFacingDirection = CalculateCorrectDirectionUtility.changeFacingDirection(currentFacingDirection, MovementInstruction.TURN_RIGHT);
    }

    protected void turnLeftOperation() {
        currentFacingDirection = CalculateCorrectDirectionUtility.changeFacingDirection(currentFacingDirection, MovementInstruction.TURN_LEFT);
    }

    void moveForward() {
        if (currentFacingDirection == FacingDirection.NORTH) {
            coordinate.setY(coordinate.getY() + 1);
            return;
        } else if (currentFacingDirection == FacingDirection.EAST) {
            coordinate.setX(coordinate.getX() + 1);
            return;
        } else if (currentFacingDirection == FacingDirection.SOUTH) {
            coordinate.setY(coordinate.getY() - 1);
            return;
        } else if (currentFacingDirection == FacingDirection.WEST) {
            coordinate.setX(coordinate.getX() - 1);
            return;
        }
        throw new RuntimeException("Unsupported current facing direction");
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public FacingDirection getCurrentFacingDirection() {
        return currentFacingDirection;
    }

}
