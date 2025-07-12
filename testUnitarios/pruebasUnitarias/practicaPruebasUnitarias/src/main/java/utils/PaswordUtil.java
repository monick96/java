package utils;

public class PaswordUtil {

    public enum LevelPassword{
        WEAK,MEDIUM,STRONG
    }

    public static LevelPassword levelSecurityPassword(String pass){
        LevelPassword result = LevelPassword.STRONG;

        if ( pass.length() < 8){
            result = LevelPassword.WEAK;
        }

        if (pass.matches("[a-zA-Z]+") ){
            result = LevelPassword.WEAK;
        }

        if (pass.matches("[0-9]+") && pass.matches("[a-zA-Z]+") && pass.length() >= 8) {
            result = LevelPassword.MEDIUM;
        }

        return result;
    }
}
