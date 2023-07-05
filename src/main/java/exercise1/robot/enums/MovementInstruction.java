/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package exercise1.robot.enums;

public enum MovementInstruction {
    TURN_LEFT("L"), TURN_RIGHT("R"), MOVE_FORWARD("F");

    private final String value;

    /**
     * @param value direction can be L -left, R -right - where to turn 90 degrees
     */
    MovementInstruction(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
