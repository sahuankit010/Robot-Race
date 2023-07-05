/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package exercise1.robot.models;

import exercise1.robot.enums.FacingDirection;
import exercise1.robot.enums.MovementInstruction;
import exercise1.robot.handleException.IllegalCommand;
import exercise1.robot.handleException.ValidationCommand;
import solutions.Exercise3;

import java.util.ArrayDeque;
import java.util.Queue;

public class RobotRace extends Robot implements Runnable {

    public String name;
    public int rank;
    private final int delay;
    private final String instructions;
    public static final Queue<RobotRace> rankHolder  = new ArrayDeque<>();

    public RobotRace(FacingDirection initialFacingDirection, String name, int delay, String instruction) {
        super(initialFacingDirection);
        this.name = name;
        this.delay = delay;
        this.rank = -1;
        this.instructions = instruction;
    }

    public void run() {
        if (instructions == null || instructions.isBlank())
            throw new IllegalArgumentException("Input command can't empty.");
        else if (!ValidationCommand.isValidCommand(instructions)) throw new IllegalCommand(instructions);
        for (int i = 0; i < instructions.length(); i++) {
            /**
             * https://www.baeldung.com/java-convert-char-to-string
             */
            String comp = String.valueOf(instructions.charAt(i));

            if (comp.equals(MovementInstruction.MOVE_FORWARD.getValue())) {
                moveForward();
                System.out.println(getElapsedTime() + "s " + name + ": Moves " + instructions.charAt(i));
            } else if (comp.equals(MovementInstruction.TURN_LEFT.getValue())) {
                turnLeftOperation();
                System.out.println(getElapsedTime() + "s " + name + ": Turns L");
            } else if (comp.equals(MovementInstruction.TURN_RIGHT.getValue())) {
                turnRightOperation();
                System.out.println(getElapsedTime() + "s " + name + ": Turns R");
            }
            try {
                Thread.sleep(delay * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (Exercise3.class){
            rank = ++Exercise3.finishCounter;
            rankHolder.add(this);
            if (rank == Exercise3.robotsRace.size()) {
                System.out.println((System.currentTimeMillis() - Exercise3.startTime)/1000 - this.delay + "s " + "The race has ENDED!");
                while(!rankHolder.isEmpty()){
                    RobotRace currentRobot = rankHolder.poll();
                    System.out.println(currentRobot.name + " is #" + currentRobot.rank + " at " + currentRobot.getCoordinate());
                }
            }
        }
    }

    public String getElapsedTime() {
        return String.format("%02d", (System.currentTimeMillis() - Exercise3.startTime) / 1000);
    }

}
