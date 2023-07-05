/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package exercise1.robot.handleException;

public class IllegalCommand extends RuntimeException {
    public IllegalCommand(String command) {
        super("Given command -> " + command + " is invalid");
    }
}
