import java.util.List;
import java.util.Scanner;

public class userInsertNewData {
    int position = 0;
    boolean askQuestion = true;

    // gets the data of the name and what position the user inputted
    public void getUserData(List<String> names) {
        Scanner scanner = new Scanner(System.in);

        while (askQuestion) {
            System.out.println("\nEnter Add Name and position" + "(from 1 to " + (names.size() + 1) + ")");
            System.out.println("use a comma to separate them");
            System.out.println("(Example: John Doe, 2)");

            String inputNew = scanner.nextLine();

            String[] namesArray = SeparateArray.separate(inputNew);

            if (namesArray.length >= 2) {
                String nameValue = namesArray[0];

                if (!namesArray[1].trim().isEmpty()) {
                    try {
                        position = Integer.parseInt(namesArray[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid position. Please enter a valid integer position.");
                        continue; // Continue the loop to ask the question again
                    }
                } else {
                    position = 0;
                }

                fixUserData(position, names, nameValue);
                askQuestion = false; // Break the loop after successful input
            } else {
                System.out.println("Invalid input. Please enter both name and position.");
            }
        }
    }

    public void fixUserData(int position, List<String> names, String inputName) {
        // shifts the starting position fo index from 0 to 1
        int fixedPosition = position - 1;

        // checks if index position is available in the list
        if (fixedPosition >= 0 && fixedPosition  <= (names.size())) {
            names.add(fixedPosition, inputName);
        } else {
            // if position is not available, user input in added to the end of the list
            System.out.println("Invalid position. Name will be added to the end.");
            names.add(inputName);
        }
    }
}
