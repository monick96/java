package utils;

public class PaswordUtil {

    public enum LevelPassword{
        WEAK,MEDIUM,STRONG
    }

    public static LevelPassword levelSecurityPassword(String pass){
        LevelPassword result = LevelPassword.WEAK;

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (char c : pass.toCharArray()) {
            if (Character.isLetter(c)) hasLetter = true;
            if (Character.isDigit(c)) hasDigit = true;
        }

        if (pass.length() > 8 && hasDigit && hasLetter && pass.length() <= 10 ){
            result = LevelPassword.MEDIUM;
        }

        if (pass.length() > 10 && hasDigit && hasLetter){
            result = LevelPassword.STRONG;
        }

        return result;
    }
}
