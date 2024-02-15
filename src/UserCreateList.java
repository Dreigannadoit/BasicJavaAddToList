import java.util.*;

public class UserCreateList  {
    List<String> names = new ArrayList<>();

    public void getUserList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of personnel names separated by commas:");
        String inputNames = scanner.nextLine();

        // split the input string into an array of names
        String[] namesArray = SeparateArray.separate(inputNames);

        // display each name in the array
        Collections.addAll(names, namesArray);

        System.out.println("List of Names: " + names);
    }
}