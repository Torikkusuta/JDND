import java.util.HashSet;
import java.util.Set;

public class findFirstDuplicateCharacter {

    //Class to find the first duplicate character
    public static int findDuplicate(String input) {
        Set<Character> seen = new HashSet<>();
        //Looping through the string.
        for (int i = 0; i < input.length(); i++) {
            //If any duplicates are found.
            if (seen.contains(input.charAt(i))) {
                return i;
            } else {
                //add values to hashset if nothing is found.
                seen.add(input.charAt(i));
            }
        }
        //If no duplicates are found after the entire loop.
        return -1;
    }
}
