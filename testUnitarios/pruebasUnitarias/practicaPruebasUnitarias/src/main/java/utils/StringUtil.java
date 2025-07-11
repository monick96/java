package utils;

public class StringUtil {
    public static String repeatString(String string, int times){
        StringBuilder result = new StringBuilder();

        if (string.isEmpty() || times < 1) {
            System.out.println("Ingrese string y cantidad a repetir > 0");
            return "Ingrese string y cantidad a repetir > 0";
        }

        for (int i = 0; i < times; i++) {
            result.append(string);
        }

        return result.toString();


    }
}
