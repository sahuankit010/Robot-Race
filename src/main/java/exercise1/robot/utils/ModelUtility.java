/**
 * Kayak Java Engineering Intern Screening
 *
 * @author Ankit Sahu
 */
package exercise1.robot.utils;

import java.util.AbstractList;
import java.util.List;

public class ModelUtility {

    /**
     * https://www.geeksforgeeks.org/convert-a-string-to-a-list-of-characters-in-java/
     */
    public static List<Character> convertStringToCharList(String str) {
        return new AbstractList<>() {

            @Override
            public Character get(int index) {
                return str.charAt(index);
            }

            @Override
            public int size() {
                return str.length();
            }
        };
    }
}
