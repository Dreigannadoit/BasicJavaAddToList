import java.util.*;

public class UserCreateList  {
    List<String> names = new ArrayList<>();

    public void getUserList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of personnel names separated by commas:");
        String inputNames = scanner.nextLine();

        String[] namesArray =  inputNames.split(",\\s*");

        // display each name in the array
        Collections.addAll(names, namesArray);

        System.out.println("List of Names: " + names);
    }
}