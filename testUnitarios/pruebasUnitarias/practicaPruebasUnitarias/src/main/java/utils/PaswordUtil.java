package utils;

public class PaswordUtil {

    public enum LevelPassword{
        WEAK,MEDIUM,STRONG
    }

    public static LevelPassword levelSecurityPassword(String pass){
        LevelPassword result = LevelPassword.WEAK;


        if ( pass.matches("[a-zA-Z-0-9]+") && pass.length() > 8) {
            result = LevelPassword.MEDIUM;
        }

        //sobrescribe la variable asignada en la linea anterior
        if ( pass.matches("[a-zA-Z]+") && pass.length() > 8) {
            result = LevelPassword.WEAK;
        }

        if (pass.matches("(?=.*[a-zA-Z])(?=.*\\d)(?=.*[^a-zA-Z\\d]).+") && pass.length() > 8) {
            result = LevelPassword.STRONG;
        }

        return result;
    }
}
