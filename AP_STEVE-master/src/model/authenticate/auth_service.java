package model.authenticate;

public class auth_service {

    public static user_login login(String username, String password) {
        if (username.startsWith("lect")) {
            return new user_login(username, user_role.LECTURER);
        }
        return new user_login(username, user_role.STUDENT);
    }

}
