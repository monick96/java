package utils;

public class StringUtil {
    public static String repeatString(String string, int times){
        String result = "";

        if (times < 0) {

            throw new IllegalArgumentException("Ingrese cantidad a repetir > 0");
        }

        for (int i = 0; i < times; i++) {
            result += string;
        }

        return result;


    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
