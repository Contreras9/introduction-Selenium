import java.util.ArrayList;

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
        ArrayList a = new ArrayList<>();
        a.add("Hamzah");
        a.add("Sumaya");
        a.add("Mohamed");
        System.out.println(a.get(1));
    }
}
