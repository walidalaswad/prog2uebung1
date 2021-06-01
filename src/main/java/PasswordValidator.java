public class PasswordValidator {
    public static boolean checkPassword(String password){
        if(password.length() < 8 || password.length() > 25)
            return false;
        else if(!password.matches(".*[a-z].*"))
            return false;
        else if(!password.matches(".*[A-Z].*"))
            return false;
        else if(!password.matches(".*[0-9].*"))
            return false;
        else if(!password.matches(".*[()#$;!%/@].*"))
            return false;
        else if(password.matches(".*[1]{4,}.*") || password.matches(".*[2]{4,}.*") || password.matches(".*[3]{4,}.*")
                || password.matches(".*[4]{4,}.*") || password.matches(".*[5]{4,}.*") || password.matches(".*[6]{4,}.*")
                || password.matches(".*[7]{4,}.*") || password.matches(".*[8]{4,}.*") || password.matches(".*[9]{4,}.*")
                || password.matches(".*[0]{4,}.*"))
            return false;
        else
            return digitChecker(password);

    }

    public static boolean digitChecker(String password){
        char[] chars = password.toCharArray();
        int a = 10;
        int b = 10;
        int c = 10;

        for(int i = 0; i < password.length(); i++){

            if(chars[i] >= 48 && chars[i] <= 57 && chars[i + 1] >= 48 && chars[i + 1] <= 57 && chars[i + 2] >= 48 &&
                    chars[i + 2] <= 57 && i < password.length() - 2){
                a = Character.getNumericValue(chars[i]);
                b = Character.getNumericValue(chars[i + 1]);
                c = Character.getNumericValue(chars[i + 2]);
            }

            if(a == b - 1 && c == b + 1)
                return false;

        }
        return true;
    }
}
