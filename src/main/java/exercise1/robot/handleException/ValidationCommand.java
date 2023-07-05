/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package exercise1.robot.handleException;

import exercise1.robot.enums.MovementInstruction;

public class ValidationCommand {
    public static boolean isValidCommand(String commands) {
        if (commands == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
//        MovementInstruction.class
        for (MovementInstruction ins : MovementInstruction.class.getEnumConstants()) {
            sb.append(ins.getValue());
        }
        sb.append("]+");
        return commands.matches(sb.toString());
    }
}
