package pl.coderslab;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(verifyLogin("ka"));
        System.out.println(verifyLogin("ka_ro-\\l123#"));
        System.out.println(verifyLogin("1ka_ro-l123"));
        System.out.println(verifyLogin("ka_ro-l123"));
    }

    static boolean verifyLogin(String email) {
        String regex1 =".{5,}";
        String regex2 = "([A-Za-z0-9\\-\\_])*";
        String regex3 = "^[^0-9].*";
        return email.matches(regex1) && email.matches(regex2) && email.matches(regex3);
    }
}
