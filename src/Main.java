public class Main {
    public static void main(String[] args) {
        UserInsertNewData getName = new UserInsertNewData();
        UserCreateList  getList = new UserCreateList ();

        getList.getUserList();
        getName.getUserData(getList.names);

        System.out.println("New List of Names:: " + getList.names);
    }
}

// Separates the array via comma indicator
class SeparateArray {
    public static String[] separate(String input) {
        return input.split(",\\s*");
    }
}