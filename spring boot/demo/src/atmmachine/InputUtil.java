package atmmachine;

import java.util.Scanner;

public abstract class InputUtil {

    public static String getUserStringResponse(String inputDescription) {
        Scanner input = new Scanner(System.in);
        System.out.println(inputDescription);
        return input.next();
    }

    public static Integer getUserIntResponse(String inputDescription) {
        Scanner input = new Scanner(System.in);
        System.out.println(inputDescription);
        return input.nextInt();
    }
}
