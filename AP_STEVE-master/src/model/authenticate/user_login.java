package model.authenticate;

public class user_login {
    private final String username;
    private final user_role role;


    public user_login(String username, user_role role) {
        this.username = username;
        this.role = role;
    }


    public user_role getRole() {
        return role;
    }
}

