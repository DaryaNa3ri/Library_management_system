package ir.maktabsharif.utility;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static String stringInput(String message){
        System.out.println(">>>   ".concat(message));
        return scanner.nextLine();
    }

    public static Integer intInput(String message){
        System.out.println(">>>   ".concat(message));
        return scanner.nextInt();
    }


}
