import java.util.List;
import java.util.Scanner;

public class UserInsertNewData {

    // gets the data of the name and what position the user inputted
    public void getUserData(List<String> names) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter new Item to 3rd position");

        String inputNew = scanner.nextLine();

        names.add(2, inputNew);
    }
}
