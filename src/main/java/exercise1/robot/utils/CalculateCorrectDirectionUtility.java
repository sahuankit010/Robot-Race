/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package exercise1.robot.utils;

import exercise1.robot.enums.FacingDirection;
import exercise1.robot.enums.MovementInstruction;

public class CalculateCorrectDirectionUtility {

    public static FacingDirection changeFacingDirection(FacingDirection currentFacingDirection,
                                                        MovementInstruction movementInstruction) {
        validateInput(currentFacingDirection, movementInstruction);

        return (movementInstruction == MovementInstruction.TURN_LEFT)
                ? rotateLeft(currentFacingDirection)
                : rotateRight(currentFacingDirection);
    }

    private static void validateInput(FacingDirection currentFacingDirection, MovementInstruction movementInstruction) {
        if (currentFacingDirection == null) {
            throw new IllegalArgumentException("Current facing direction cannot be null.");
        } else if (movementInstruction == null) {
            throw new IllegalArgumentException("facing direction is legal but movement instruction cannot be null.");
        } else if (movementInstruction != MovementInstruction.TURN_LEFT && movementInstruction != MovementInstruction.TURN_RIGHT) {
            throw new IllegalArgumentException(movementInstruction + " is not a valid command to change facing direction.");
        }
    }

    private static FacingDirection rotateLeft(FacingDirection currentFacingDirection) {
        if (currentFacingDirection == FacingDirection.NORTH) {
            return FacingDirection.WEST;
        } else if (currentFacingDirection == FacingDirection.WEST) {
            return FacingDirection.SOUTH;
        } else if (currentFacingDirection == FacingDirection.SOUTH) {
            return FacingDirection.EAST;
        } else if (currentFacingDirection == FacingDirection.EAST) {
            return FacingDirection.NORTH;
        }
        throw new IllegalArgumentException("Unsupported facing direction value: " + currentFacingDirection);
    }

    private static FacingDirection rotateRight(FacingDirection currentFacingDirection) {
        if (currentFacingDirection == FacingDirection.NORTH) {
            return FacingDirection.EAST;
        } else if (currentFacingDirection == FacingDirection.EAST) {
            return FacingDirection.SOUTH;
        } else if (currentFacingDirection == FacingDirection.SOUTH) {
            return FacingDirection.WEST;
        } else if (currentFacingDirection == FacingDirection.WEST) {
            return FacingDirection.NORTH;
        }
        throw new IllegalArgumentException("Unsupported facing direction value: " + currentFacingDirection);
    }

}
