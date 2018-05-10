package PracticeCar;

import java.util.Scanner;

public class Interactive {
    public default float getFloat(String prompt) {
        return Float.parseFloat(this.getString(prompt));
    }

    public default boolean getBoolean(String prompt) {
        return(getString(prompt + " (Y is yes)").toUpperCase().contains("Y"));
    }

    public default String getString(String prompt) {
        String response = "";
        Scanner reader = new Scanner(System.in);
        System.out.print(prompt + " Press enter when ready. ");
        response = reader.nextLine();
        return response;
    }
}
