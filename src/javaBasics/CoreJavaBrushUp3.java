package javaBasics;

public class CoreJavaBrushUp3 {

    public static void main(String[] args) {
        // String is an object - String literal
        String myName = "Hamzah Contreras";

        // new
        String brotherName = new String("Mohamed Kheir");

        String fullName = "Hamzah Yared Contreras";
        String[] names = fullName.split("Yared");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[1].trim());

        System.out.println("*********");

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        System.out.println("*********");

        for (int i = fullName.length() - 1; i >= 0; i--) {
            System.out.println(fullName.charAt(i));
        }

//        for (String name : names) {
//            System.out.println(name);
//        }

    }
}
