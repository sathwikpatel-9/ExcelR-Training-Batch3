import java.util.ArrayList;
// add 10 friends names in the array list
class ArrayListNames{
    void addFriendNames(){
        System.out.println("names of my friends: ");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Anitha");
        arrayList.add("Charita");
        arrayList.add("Rina");
        // Convert ArrayList to array
        String[] array = arrayList.toArray(new String[0]);
        // Display the array
        for (String i : array) {
            System.out.println(i);
        }
    }
}
public class Demo029 {
    public static void main(String[] args) {
        ArrayListNames obj = new  ArrayListNames();
        obj.addFriendNames();
    }
}