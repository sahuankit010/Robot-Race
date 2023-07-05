/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */

package solutions;

public class Exercise2 {

    /**
     * Part 2(a) solution
     */
    public void countUp(int start, int end) {
        if (start > end) return;
        System.out.println(start);
        countUp(start + 1, end);
    }

    public static void main(String[] args) {
        Exercise2 ex = new Exercise2();
        ex.countUp(0, 5);
        ex.countUpAndDown(-5, 3);
    }

    /**
     * Part 2(b) solution
     */
    public void countUpAndDown(int start, int end) {
        if (start == end) {
            System.out.println(start);
            return;
        }
        System.out.println(start);
        countUpAndDown(start + 1, end);
        System.out.println(start);
    }
}
