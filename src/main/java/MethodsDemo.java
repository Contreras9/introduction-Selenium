public class MethodsDemo {
    public static void main(String[] args) {
        MethodsDemo methodsDemo = new MethodsDemo();
        String name = methodsDemo.getData();
        System.out.println(name);
        getData2();

        MethodsDemo2 methodsDemo2 = new MethodsDemo2();
        methodsDemo2.getUserData();

    }

    public static String getData() {
        System.out.println("Salam World!");
        return "Hamzah";
    }

    public static String getData2() {
        System.out.println("Salam World!");
        return "Hamzah";
    }
}
