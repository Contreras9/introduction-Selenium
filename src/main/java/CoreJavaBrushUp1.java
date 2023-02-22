public class CoreJavaBrushUp1 {

    public static void main(String[] args) {

        int myNum = 9;
        String website = "Khan Academy";
        char letter = 'h';
        double dec = 9.99;
        boolean myCard = true;

        System.out.println(myNum + " is the value stored in the myNym variable.");
        System.out.println(website);
        // Arrays -
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
        System.out.println(arr2[2]);

        // for loop
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }

        String[] name = {"Hamzah", "Sumaya", "Mohamed"};
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
}
