package VariablesContinued;

public class Main {
    public static void main(String[] args) {

        // I'm adding a comment

        String name = "OIJIOJIOJOIJIOJFOESIJOFJeoiwjfoisejoiwe";
        System.out.println("String length: " + name.length());
        System.out.println("Forward: ");
        for (int i = 0; i < name.length(); i++) {
            System.out.print("Char: " + name.charAt(i) + " ");
        }
        System.out.println("\nReverse:");
        for (int i = name.length() - 1; i > 0 ; i--) {
            System.out.print("Char: " + name.charAt(i) + " ");
        }




    }

}
