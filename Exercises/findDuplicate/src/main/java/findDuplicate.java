import java.util.Scanner;

public class findDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a text");
        String inputText = scanner.next();
        System.out.println(findFirstDuplicateCharacter.findDuplicate(inputText));
    }
}
