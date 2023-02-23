import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

    public static void main(String[] args) {

        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};

        // multiples of 2
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                System.out.println(arr2[i]);
                break;
            }
            else {
                System.out.println(arr2[i] + " is not a multiple of2.");
            }
        }

        // create object of the class - object.method
        ArrayList<String> names = new ArrayList<String>();
        names.add("Hamzah");
        names.add("Sumaya");
        names.add("Mohamed");
        System.out.println(names.get(1));

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("*********");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println(names.contains("Mohamed"));
        String[] names1 = {"Hamzah", "Sumaya", "Mohamed", "Ivan"};
        List<String> namesArrayList = Arrays.asList(names1);
        namesArrayList.contains("Ivan");
    }
}
